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
public class Parcela {

    public Parcela(int identificador, LocalDate dataliquidacao, int qtdParcelas, Parcela[] parcelas) {
        this.identificador = identificador;
        this.dataliquidacao = dataliquidacao;
        this.qtdParcelas = qtdParcelas;
        this.parcelas = parcelas;
    }
    
    private int identificador;
    private LocalDate dataliquidacao;
    private int qtdParcelas;
    private Parcela parcelas[];
   


    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public LocalDate getDataliquidacao() {
        return dataliquidacao;
    }

    public void setDataliquidacao(LocalDate dataliquidacao) {
        this.dataliquidacao = dataliquidacao;
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
}
