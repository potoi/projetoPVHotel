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

    private int nextSafeId = 1;
    public ArrayList<Conta> arrayCont;

    public ContaFichario() {
        this.arrayCont = new ArrayList<>();

    }

    public int getNextId() {
        return nextSafeId;
    }

    public String[] getColumnName() {
        String[] a = {"Id", "Nome do Cliente", "Data Abertura", "Data Fechamento", "Total", "Quarto", "Quantidade Items"};
        return a;
    }

    public String[][] getDataString(ArrayList<Conta> data) {
        String[][] stringTotal;
        int quantCampos = 7;
        int i = 0;
        stringTotal = new String[data.size()][quantCampos];
        for (Conta c : data) {
            stringTotal[i][0] = Integer.toString(c.getId());
            stringTotal[i][1] = c.getCliente().getNome();

            if (c.getDataAbertura() != null) {

                stringTotal[i][2] = Integer.toString(c.getDataAbertura().
                        getDayOfMonth()) + "." + Integer.toString(c.getDataAbertura().
                                getMonthValue()) + "." + Integer.toString(c.getDataAbertura().getYear());
            } else {
                stringTotal[i][2] = "";

            }
            if (c.getDataFechamento() != null) {
                stringTotal[i][3] = Integer.toString(c.getDataFechamento().
                        getDayOfMonth()) + "." + Integer.toString(c.getDataFechamento().
                                getMonthValue()) + "." + Integer.toString(c.getDataFechamento().getYear());
            } else {
                stringTotal[i][3] = "";
            }
            stringTotal[i][4] = Double.toString(c.getTotal());
            stringTotal[i][5] = Integer.toString(c.getQuarto());
            if (c.getItens() != null) {

                stringTotal[i][6] = Integer.toString(c.getItens().length);
            } else {
                stringTotal[i][6] = "0";
            }
            i++;

        }
        return stringTotal;
    }

    public void remove(int i, ArrayList array) {
        array.remove(i);
    }

    public void add(Conta e) {
        arrayCont.add(e);
        nextSafeId++;

    }

    public int findIndex(int id) {
        int i = 0;
        for (Conta conta : arrayCont) {

            if (conta.getId() == id) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void remove(int index) {
        if (arrayCont.get(index).getDataFechamento() == null) {
            arrayCont.remove(index);
        }
    }

}
