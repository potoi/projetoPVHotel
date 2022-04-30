/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import model.Endereco;

/**
 *
 * @author Victor
 */
public class EnderecoFichario {

    public String[] getColumnName() {
        String[] a = {"Logradouro", "Número", "Bairro", "Município", "Complemento", "Cep"};
        return a;
    }

    public String[][] getDataString(ArrayList<Endereco> data) {
        String[][] stringTotal;
        int quantCampos = 6;
        stringTotal = new String[data.size()][quantCampos];
        int i = 0;
        for (Endereco c : data) {
            stringTotal[i][0] = c.getLogradouro();
            stringTotal[i][1] = c.getNumero();
            stringTotal[i][2] = c.getBairro();
            stringTotal[i][3] = c.getMunicipio().getNome();
            stringTotal[i][4] = c.getComplemento();
            stringTotal[i][5] = c.getComplemento();
            i++;

        }
        return stringTotal;
    }

    public Endereco getEnde(int i, ArrayList<Endereco> array) {
        return array.get(i);
    }

    public ArrayList<Endereco> getArrayEnde(ArrayList<Endereco> array) {

        return array;
    }

    public void remove(int i, ArrayList array) {
        array.remove(i);
    }

}
