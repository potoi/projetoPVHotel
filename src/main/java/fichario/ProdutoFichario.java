/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Victor
 */
public class ProdutoFichario {

    private int nextSafeId = 1;
    public ArrayList<Produto> arrayProd;

    public ProdutoFichario() {
        this.arrayProd = new ArrayList<>();

    }

    public int getNextId() {
        nextSafeId++;
        return nextSafeId;
    }

    public String[] getColumnName() {
        String[] a = {"Id", "Descrição", "Preço", "Marca", "Validade"};
        return a;
    }

    public String[][] getDataString(ArrayList<Produto> data) {
        String[][] stringTotal;
        int quantCampos = 5;
        stringTotal = new String[data.size()][quantCampos];
        int i = 0;
        for (Produto c : data) {
            stringTotal[i][0] = Integer.toString(c.getIdentificador());

            stringTotal[i][1] = c.getDescricao();
            stringTotal[i][2] = Double.toString(c.getPreco());

            stringTotal[i][3] = c.getMarca();

            stringTotal[i][4] = Integer.toString(c.getValidade().
                    getDayOfMonth()) + "." + Integer.toString(c.getValidade().
                            getMonthValue()) + "." + Integer.toString(c.getValidade().getYear());

            i++;

        }
        return stringTotal;
    }

    public void remove(int i, ArrayList array) {
        array.remove(i);
    }

    public void add(Produto e) {
        arrayProd.add(e);
        nextSafeId++;

    }

    public int findIndex(int id) {
        int i = 0;
        for (Produto produto : arrayProd) {

            if (produto.getIdentificador() == id) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void remove(int index) {

        arrayProd.remove(index);

    }
}
