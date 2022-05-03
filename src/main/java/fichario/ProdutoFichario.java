/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import model.Item;
import model.Produto;

/**
 *
 * @author Victor
 */
public class ProdutoFichario {

    private int nextSafeId = 1;
    public ArrayList<Item> arrayItem;

    public ProdutoFichario() {
        this.arrayItem = new ArrayList<>();

    }

    public int getNextId() {
        nextSafeId++;
        return nextSafeId;
    }

    public String[] getColumnName() {
        String[] a = {"Id", "Descrição", "Preço", "Marca", "Validade"};
        return a;
    }

    public String[][] getDataString(ArrayList<Item> data) {
        String[][] stringTotal;
        int quantCampos = 5;
        stringTotal = new String[data.size()][quantCampos];
        int i = 0;

        for (Item d : data) {
            if (d instanceof Produto c) {

                stringTotal[i][0] = Integer.toString(c.getIdentificador());

                stringTotal[i][1] = c.getDescricao();
                stringTotal[i][2] = Double.toString(c.getPreco());

                stringTotal[i][3] = c.getMarca();

                stringTotal[i][4] = Integer.toString(c.getValidade().
                        getDayOfMonth()) + "." + Integer.toString(c.getValidade().
                                getMonthValue()) + "." + Integer.toString(c.getValidade().getYear());

                i++;
            }
        }
        return stringTotal;
    }

    public void remove(int i, ArrayList array) {
        array.remove(i);
    }

    public void add(Produto e) {
        arrayItem.add(e);

    }

    public int findIndex(int id) {
        int i = 0;
        for (Item item : arrayItem) {
            if (item instanceof Produto produto) {
                if (produto.getIdentificador() == id) {
                    return i;
                }
                i++;
            }

        }
        return -1;
    }

    public void remove(int index) {

        arrayItem.remove(index);

    }
}
