/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import model.Municipio;

/**
 *
 * @author Victor
 */
public class MunicipioFichario extends Fichario {

    public String[] getColumnName() {
        String[] a = {"Nome", "Estado", "Pais"};
        return a;
    }
    public String[][] getDataString(ArrayList<Municipio> data) {
        String[][] stringTotal;
        int quantCampos = 3;
        int i = 0;
        stringTotal = new String[data.size()][quantCampos];
        for (Municipio c : data) {
            stringTotal[i][0] = c.getNome();
            stringTotal[i][1] = c.getEstado();
            stringTotal[i][2] = c.getPais();

            i++;

        }
        return stringTotal;
    }


}
