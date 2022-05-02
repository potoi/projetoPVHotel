/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Victor
 */
public class Fatura {

    public Fatura(Conta conta, LocalDate dataLiquidacao, int qtdParcelas, Parcela[] parcelas, int tipopagamento) {
        this.conta = conta;
        this.dataLiquidacao = dataLiquidacao;
        this.qtdParcelas = qtdParcelas;
        this.parcelas = parcelas;
        this.tipopagamento = tipopagamento;
    }

    public Fatura(Conta conta, int qtdParcelas, int tipopagamento, Parcela[] parcelas) {
        this.conta = conta;
        this.qtdParcelas = qtdParcelas;
        this.tipopagamento = tipopagamento;
        this.parcelas = parcelas;
        JurosPorParcelmento();
    }

    private Conta conta;
    private LocalDate dataLiquidacao;
    private int qtdParcelas;
    private Parcela parcelas[];
    private int tipopagamento;

    public Fatura() {

    }

    public enum tipoPagamento {

        DINHEIRO("dinheiro"),
        CARTAOCREDITO("cartão de crédito"),
        CARTAODEBITO("cartão de débito"),
        PIX("pix");

        private String tipo;

        tipoPagamento(String tipo) {
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public LocalDate getDataLiquidacao() {
        return dataLiquidacao;
    }

    public void setDataLiquidacao(LocalDate dataLiquidacao) {
        this.dataLiquidacao = dataLiquidacao;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public Parcela[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(Parcela[] parcelas) {
        this.parcelas = parcelas;
    }

    public int getTipopagamento() {
        return tipopagamento;
    }

    public void setTipopagamento(int tipopagamento) {
        this.tipopagamento = tipopagamento;
    }

    public void JurosPorParcelmento() {

        int i, j;
        
        double juros, valorParcela, jurosgeral,total=0;
        switch (tipopagamento) {
            case 0 -> {
                juros = 1.02;
                jurosgeral = 1;
                break;
            }

            case 1 -> {
                juros = 1.06;

                jurosgeral = 1.018;
                break;
            }
            case 2 -> {
                juros = 1.04;
                jurosgeral = 1.013;

                break;
            }
            case 3 -> {
                juros = 1.02;

                jurosgeral = 1;
                break;
            }
            default -> {
                juros = 1;

                jurosgeral = 1;
                break;
            }

        }
        if (qtdParcelas > 1) {
            double[] valorParcelas = new double[qtdParcelas];
            for (i = 1; i <= qtdParcelas; i++) {

                valorParcelas[i - 1] = conta.getTotal()/qtdParcelas;
                LocalDate sl = conta.getDataFechamento();
                sl.plusDays(30 * i);
                parcelas[i - 1].setDataVencimento(sl);

                for (j = i; j > 0; j--) {
                    valorParcelas[i - 1] *= juros;
                }
                total+=valorParcelas[i-1];
              
            }
            total *= jurosgeral;
            for (int z = 0; z < qtdParcelas; z++) {
                parcelas[z].setValor(total/qtdParcelas);
            }
        } else {
            LocalDate sl = conta.getDataFechamento();
            parcelas[0].setDataPagamento(sl);
            valorParcela = conta.getTotal();
            parcelas[0].setValor(valorParcela);
            parcelas[0].setValorfinal(valorParcela);
            parcelas[0].setJurosMoraAplicado(0);
        }
    }

    public void JurosPorAtraso() {
        int atraso;
        double valor;
        double juros = 0;
        int i = 0;
        for (Parcela parcela : parcelas) {

            Period period;
            atraso = 0;
            juros = 0;
            if (parcela.getDataPagamento() != null) {
                if (parcela.getDataPagamento().isAfter(parcela.getDataVencimento())) {
                    period = Period.between(parcela.getDataPagamento(), parcela.getDataVencimento());
                    atraso = period.getDays();
                    valor = parcela.getValor();
                    if (atraso < 16) {
                        parcela.setJurosMoraAplicado(valor * 0.03);
                    }
                    if (atraso < 31) {
                        parcela.setJurosMoraAplicado(valor * 0.09);
                    }
                    if (atraso > 30) {
                        for (int j = 0; j < atraso; j++) {
                            juros += 0.0003;

                        }
                        parcela.setJurosMoraAplicado(valor * juros);

                    }

                }
                i++;
                parcelas[i] = parcela;
            }
        }

    }

}
