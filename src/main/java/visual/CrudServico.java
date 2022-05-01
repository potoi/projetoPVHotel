/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;

import model.*;
import fichario.*;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import util.Utilidades;
import dados.Data;

/**
 *
 * @author Victor
 */
public class CrudServico extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private ArrayList<Municipio> arrayAtual;
    private MunicipioFichario ficharioAtual;
    private Data dados;

    public CrudServico(Data dados) {
        ficharioAtual = new MunicipioFichario();
        this.arrayAtual = dados.arrayMuni;
        this.dados = dados;

        dtm = new DefaultTableModel(0, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        initComponents();
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setTitle("Tabela: Município");
        preencheTabela(ficharioAtual.getDataString(arrayAtual), ficharioAtual.getColumnName());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonAlter = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenuShowPessoaF = new javax.swing.JMenuItem();
        jMenuShowPessoaJ = new javax.swing.JMenuItem();
        jMenuShowEndereco = new javax.swing.JMenuItem();
        jMenuShowMunicipio = new javax.swing.JMenuItem();
        jMenuShowVeiculo = new javax.swing.JMenuItem();
        jMenuShowConta = new javax.swing.JMenuItem();
        jMenuShowFatura = new javax.swing.JMenuItem();
        jMenuShowParcela = new javax.swing.JMenuItem();
        jMenuShowProduto = new javax.swing.JMenuItem();
        jMenuShowServico = new javax.swing.JMenuItem();
        jMenuShowEquipamento = new javax.swing.JMenuItem();
        jMenuShowFuncionario = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuAddClientePF = new javax.swing.JMenuItem();
        jMenuAddClientePj = new javax.swing.JMenuItem();
        jMenuAddEndereco = new javax.swing.JMenuItem();
        jMenuAddMunicipio = new javax.swing.JMenuItem();
        jMenuAddVeiculo = new javax.swing.JMenuItem();
        jMenuAddConta = new javax.swing.JMenuItem();
        jMenuAddFatura = new javax.swing.JMenuItem();
        jMenuAddParcela = new javax.swing.JMenuItem();
        jMenuAddProduto = new javax.swing.JMenuItem();
        jMenuAddServico = new javax.swing.JMenuItem();
        jMenuAddEquipamento = new javax.swing.JMenuItem();
        jMenuAddFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuTelaPrincipal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(dtm);
        jScrollPane2.setViewportView(jTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 650, 240));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 60, 80));
        getContentPane().add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 40, 40));

        jButtonAdd.setText("Adicionar");
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jButtonRemove.setText("Remover");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jButtonAlter.setText("Alterar");
        getContentPane().add(jButtonAlter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        jMenu10.setText("Mostrar");

        jMenuShowPessoaF.setText("PessoaF");
        jMenu10.add(jMenuShowPessoaF);

        jMenuShowPessoaJ.setText("PessoaJ");
        jMenu10.add(jMenuShowPessoaJ);

        jMenuShowEndereco.setText("Endereço");
        jMenu10.add(jMenuShowEndereco);

        jMenuShowMunicipio.setText("Município");
        jMenu10.add(jMenuShowMunicipio);

        jMenuShowVeiculo.setText("Veículo");
        jMenu10.add(jMenuShowVeiculo);

        jMenuShowConta.setText("Conta");
        jMenu10.add(jMenuShowConta);

        jMenuShowFatura.setText("Fatura");
        jMenu10.add(jMenuShowFatura);

        jMenuShowParcela.setText("Parcela");
        jMenu10.add(jMenuShowParcela);

        jMenuShowProduto.setText("Produto");
        jMenu10.add(jMenuShowProduto);

        jMenuShowServico.setText("Serviço");
        jMenu10.add(jMenuShowServico);

        jMenuShowEquipamento.setText("Equipamento");
        jMenu10.add(jMenuShowEquipamento);

        jMenuShowFuncionario.setText("Funcionario");
        jMenu10.add(jMenuShowFuncionario);

        jMenuBarPrincipal.add(jMenu10);

        jMenu15.setText("Adicionar");

        jMenuAddClientePF.setText("PessoaF");
        jMenu15.add(jMenuAddClientePF);

        jMenuAddClientePj.setText("PessoaJ");
        jMenu15.add(jMenuAddClientePj);

        jMenuAddEndereco.setText("Endereço");
        jMenu15.add(jMenuAddEndereco);

        jMenuAddMunicipio.setText("Município");
        jMenu15.add(jMenuAddMunicipio);

        jMenuAddVeiculo.setText("Veículo");
        jMenu15.add(jMenuAddVeiculo);

        jMenuAddConta.setText("Conta");
        jMenu15.add(jMenuAddConta);

        jMenuAddFatura.setText("Fatura");
        jMenu15.add(jMenuAddFatura);

        jMenuAddParcela.setText("Parcela");
        jMenu15.add(jMenuAddParcela);

        jMenuAddProduto.setText("Produto");
        jMenu15.add(jMenuAddProduto);

        jMenuAddServico.setText("Serviço");
        jMenu15.add(jMenuAddServico);

        jMenuAddEquipamento.setText("Equipamento");
        jMenu15.add(jMenuAddEquipamento);

        jMenuAddFuncionario.setText("Funcionario");
        jMenu15.add(jMenuAddFuncionario);

        jMenuBarPrincipal.add(jMenu15);

        jMenu2.setText("Ir para");

        jMenuTelaPrincipal.setText("Tela Principal");
        jMenu2.add(jMenuTelaPrincipal);

        jMenuBarPrincipal.add(jMenu2);

        setJMenuBar(jMenuBarPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed

      
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void preencheTabela(String a[][], String b[]) {
        dtm.setRowCount(0);
        dtm.setColumnCount(0);

        for (String n : b) {
            dtm.addColumn(n);
        }
        for (String[] n2 : a) {
            dtm.insertRow(0, n2);
        }

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAlter;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAddClientePF;
    private javax.swing.JMenuItem jMenuAddClientePj;
    private javax.swing.JMenuItem jMenuAddConta;
    private javax.swing.JMenuItem jMenuAddEndereco;
    private javax.swing.JMenuItem jMenuAddEquipamento;
    private javax.swing.JMenuItem jMenuAddFatura;
    private javax.swing.JMenuItem jMenuAddFuncionario;
    private javax.swing.JMenuItem jMenuAddMunicipio;
    private javax.swing.JMenuItem jMenuAddParcela;
    private javax.swing.JMenuItem jMenuAddProduto;
    private javax.swing.JMenuItem jMenuAddServico;
    private javax.swing.JMenuItem jMenuAddVeiculo;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenuItem jMenuShowConta;
    private javax.swing.JMenuItem jMenuShowEndereco;
    private javax.swing.JMenuItem jMenuShowEquipamento;
    private javax.swing.JMenuItem jMenuShowFatura;
    private javax.swing.JMenuItem jMenuShowFuncionario;
    private javax.swing.JMenuItem jMenuShowMunicipio;
    private javax.swing.JMenuItem jMenuShowParcela;
    private javax.swing.JMenuItem jMenuShowPessoaF;
    private javax.swing.JMenuItem jMenuShowPessoaJ;
    private javax.swing.JMenuItem jMenuShowProduto;
    private javax.swing.JMenuItem jMenuShowServico;
    private javax.swing.JMenuItem jMenuShowVeiculo;
    private javax.swing.JMenuItem jMenuTelaPrincipal;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
