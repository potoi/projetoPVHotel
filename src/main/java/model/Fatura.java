/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

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
    
    private Conta conta;
    private LocalDate dataLiquidacao;
    private int qtdParcelas;
    private Parcela parcelas[];
    private int tipopagamento;

    public Fatura() {
       
    }

    
    public enum tipoPagamento{
       
        DINHEIRO("dinheiro"),
        CARTAOCREDITO("cartão de crédito"),
        CARTAODEBITO("cartão de débito"),
        PIX("pix");
    
        
        private String tipo;
        
        tipoPagamento(String tipo){
        this.tipo = tipo;
    }
        
        public String getTipo(){
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
    
}
