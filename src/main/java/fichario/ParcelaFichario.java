/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import model.Parcela;

/**
 *
 * @author Victor
 */
public class ParcelaFichario {
        private int nextSafeId = 1;
    public ArrayList<Parcela> arrayParc;

    public ParcelaFichario() {
        this.arrayParc = new ArrayList<>();

    }

    public int getNextId() {
        nextSafeId++;
        return nextSafeId;
    }

    public String[] getColumnName() {
        String[] a = {"Id", "Nome do Cliente", "Data Abertura", "Data Fechamento", "Total", "Quarto", "Quantidade Items"};
        return a;
    }


    public void remove(int i, ArrayList array) {
        array.remove(i);
    }

    public void add(Parcela e) {
        arrayParc.add(e);
        nextSafeId++;

    }

    public int findIndex(int id) {
        int i = 0;
        for (Parcela parcela : arrayParc) {

            if (parcela.getIdentificador() == id) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void remove(int index) {
        
            arrayParc.remove(index);
        
    }

    
}
