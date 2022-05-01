/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichario;

import java.util.ArrayList;
import model.Cliente;
import model.PessoaJuridica;
import model.PessoaJuridica;

/**
 *
 * @author Victor
 */
public class PessoaJuridicaFichario {

    public PessoaJuridicaFichario() {
       
    }

    public String[] getColumnName() {
        String[] a = {"Nome Empresa","CNPJ", "Nome Cliente", "Endereco", "Quantidade Carro", "Telefone Fixo", "Telefone Celular"};
        return a;
    }
 
    public String[][] getDataString(ArrayList<Cliente> data) {
        String[][] stringTotal;
        int quantCampos = 7;
        int i = 0;
        ArrayList<PessoaJuridica> nData= new ArrayList<PessoaJuridica>();
        for(Cliente c: data){
            if(c instanceof PessoaJuridica){
                nData.add((PessoaJuridica)c);
            }
            
        }
        
        stringTotal = new String[data.size()][quantCampos];
        for (PessoaJuridica c : nData ){
            stringTotal[i][0] = c.getNomeFantasia();
            stringTotal[i][1] = c.getCnpj();
            stringTotal[i][2] = c.getNome();
            stringTotal[i][3] = c.getEnderecoComercial().getBairro()+" "+c.getEnderecoComercial().getMunicipio().getNome();
            stringTotal[i][4]=(c.getVeiculos()!=null?Integer.toString(c.getVeiculos().length):"0");
            stringTotal[i][5] = c.getTelefoneComercial();
            stringTotal[i][6] = c.getTelefoneCelular();
            
            i++;

        }
        return stringTotal;
    }
        public PessoaJuridica getEnde(int i, ArrayList<PessoaJuridica> array) {
        return array.get(i);
    }

    public ArrayList getArray(ArrayList array) {
        return array;
    }

    public void remove(int i, ArrayList array) {
        array.remove(i);
    }

    public void add(PessoaJuridica e, ArrayList array) {
        array.add(e);
    }

}

