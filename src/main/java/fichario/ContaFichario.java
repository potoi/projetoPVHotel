/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import model.Conta;

/**
 *
 * @author Victor
 */
public class ContaFichario {

    public ContaFichario() {
       
    }

    public String[] getColumnName() {
        String[] a = {"Nome do Cliente", "Data Abertura", "Data Fechamento", "Total", "Quarto", "Quantidade Items"};
        return a;
    }
 
    public String[][] getDataString(ArrayList<Conta> data) {
        String[][] stringTotal;
        int quantCampos = 6;
        int i = 0;
        stringTotal = new String[data.size()][quantCampos];
        for (Conta c : data) {
            stringTotal[i][0] = c.getCliente().getNome();
            
            
            if ( stringTotal[i][1]!=null){      
            stringTotal[i][1] = Integer.toString(c.getDataAbertura().
                    getDayOfMonth()) +"."+ Integer.toString(c.getDataAbertura().
                            getMonthValue()) +"."+ Integer.toString(c.getDataAbertura().getYear());}
            else  stringTotal[i][1] = "";
            if ( stringTotal[i][2]!=null){  
            stringTotal[i][2] = Integer.toString(c.getDataFechamento().
                    getDayOfMonth()) +"."+ Integer.toString(c.getDataFechamento().
                            getMonthValue()) +"."+ Integer.toString(c.getDataFechamento().getYear());}
            else stringTotal[i][2]="";
            stringTotal[i][3] = Double.toString(c.getTotal());
            stringTotal[i][4] = Integer.toString(c.getQuarto());
            if ( stringTotal[i][5]!=null){
            stringTotal[i][5] = Integer.toString(c.getItens().length);}
            else  stringTotal[i][5] = "0";
            i++;

        }
        return stringTotal;
    }

}
