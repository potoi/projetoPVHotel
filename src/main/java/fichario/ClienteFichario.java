/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author Victor
 */
public class ClienteFichario  {


    public String[] getColumnName() {
        String[] a = {"Marca", "Modelo", "Cor", "Placa", "Vaga Ocupada"};
        return a;
    }

    public String[][] getDataString(ArrayList<Cliente> data) {
        String[][] stringTotal;
        int quantCampos = 8;
        int i = 0;
        stringTotal = new String[data.size()][quantCampos];
        for (Cliente c : data) {
            stringTotal[i][0] = Integer.toString(c.getId());
            stringTotal[i][1] = c.getNome();
            stringTotal[i][2] = c.getEnderecoResidencial().getMunicipio().getNome();
            stringTotal[i][3] = c.getEnderecoComercial().getMunicipio().getNome();
            stringTotal[i][4] = c.getVeiculos()[0].getModelo();
            stringTotal[i][5] = c.getTelefoneCelular();
            stringTotal[i][6] = c.getTelefoneComercial();
            stringTotal[i][7] = c.getTelefoneFixo();
            i++;

        }
        return stringTotal;
    }

}
