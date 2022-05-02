/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import fichario.ContaFichario;
import fichario.FaturaFichario;
import fichario.ParcelaFichario;
import java.util.ArrayList;
import model.Cliente;
import model.Conta;
import model.Endereco;
import model.Equipamento;
import model.Fatura;
import model.Funcionario;
import model.Item;
import model.Municipio;
import model.Parcela;
import model.PessoaFisica;
import model.PessoaJuridica;
import model.Produto;
import model.Servico;
import model.Veiculo;

/**
 *
 * @author Victor
 */
public class Data {

    public  ArrayList<Cliente> arrayClie = new ArrayList<>();
    public  ContaFichario ficharioConta= new ContaFichario();
    public  FaturaFichario ficharioFatura= new FaturaFichario();
    public  ArrayList<Endereco> arrayEnde = new ArrayList<>();
    public  ArrayList<Equipamento> arrayEqui = new ArrayList<>();
    public  ArrayList<Fatura> arrayFatu = new ArrayList<>();
    public  ArrayList<Funcionario> arrayFunc = new ArrayList<>();
    public  ArrayList<Item> arrayItem = new ArrayList<>();
    public  ArrayList<Municipio> arrayMuni = new ArrayList<>();
    public  ParcelaFichario ficharioParcela= new ParcelaFichario();
    public  ArrayList<PessoaFisica> arrayPessF = new ArrayList<>();
    public  ArrayList<PessoaJuridica> arrayPessJ = new ArrayList<>();
    public  ArrayList<Produto> arrayProd = new ArrayList<>();
    public  ArrayList<Servico> arrayServ = new ArrayList<>();
    public  ArrayList<Veiculo> arrayVeic = new ArrayList<>();
}
