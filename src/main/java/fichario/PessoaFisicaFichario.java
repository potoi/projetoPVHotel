/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import model.Cliente;
import model.PessoaFisica;

/**
 *
 * @author Victor
 */
public class PessoaFisicaFichario {

    public PessoaFisicaFichario() {

    }

    public String[] getColumnName() {
        String[] a = {"Cpf", "Nome", "Endereco", "Quantidade Carro", "Telefone Fixo", "Telefone Celular"};
        return a;
    }

    public String[][] getDataString(ArrayList<Cliente> data) {
        String[][] stringTotal;
        int quantCampos = 6;
        int i = 0;
        ArrayList<PessoaFisica> nData = new ArrayList<PessoaFisica>();
        for (Cliente c : data) {
            if (c instanceof PessoaFisica) {
                nData.add((PessoaFisica) c);
            }

        }

        stringTotal = new String[data.size()][quantCampos];
        for (PessoaFisica c : nData) {

            stringTotal[i][0] = c.getCpf();
            stringTotal[i][1] = c.getNome();
            stringTotal[i][2] = c.getEnderecoResidencial().getBairro() + " " + c.getEnderecoResidencial().getMunicipio().getNome();
            stringTotal[i][3] = (c.getVeiculos() != null ? Integer.toString(c.getVeiculos().length) : "0");
            stringTotal[i][4] = c.getTelefoneFixo();
            stringTotal[i][5] = c.getTelefoneCelular();

            i++;

        }
        return stringTotal;
    }

    public PessoaFisica getEnde(int i, ArrayList<PessoaFisica> array) {
        return array.get(i);
    }

    public ArrayList getArray(ArrayList array) {
        return array;
    }

    public void remove(int i, ArrayList array) {
        array.remove(i);
    }

    public void add(PessoaFisica e, ArrayList array) {
        array.add(e);
    }

}
