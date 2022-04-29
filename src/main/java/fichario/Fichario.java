/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import java.util.Arrays;
import model.Endereco;

/**
 *
 * @author Victor
 */
public class Fichario {

    public String[] getColumnName() {
        return null;
    }

    public void remove(int i, ArrayList array) {
        array.remove(i);
    }

    public void add(Object i[], ArrayList array) {
        array.addAll(Arrays.asList(i));
    }

    public void alter(Object i[], int pos, ArrayList array) {
        for (Object o : i) {
            array.set(pos, o);
        }

    }


}
