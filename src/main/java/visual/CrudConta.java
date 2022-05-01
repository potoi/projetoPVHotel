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
public class CrudConta extends javax.swing.JFrame {
  
    private DefaultTableModel dtm;
    private ArrayList<Conta> arrayAtual;
    private ContaFichario ficharioAtual;
    private Data dados;

    public CrudConta(Data dados) {
        ficharioAtual = new ContaFichario();
        this.arrayAtual = dados.arrayCont;
        this.dados = dados;

        dtm = new DefaultTableModel(0, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        initComponents();
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setTitle("Tabela: Conta");
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
        jMenuShowPessoaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowPessoaFActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowPessoaF);

        jMenuShowPessoaJ.setText("PessoaJ");
        jMenuShowPessoaJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowPessoaJActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowPessoaJ);

        jMenuShowEndereco.setText("Endereço");
        jMenuShowEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowEnderecoActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowEndereco);

        jMenuShowMunicipio.setText("Município");
        jMenuShowMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowMunicipioActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowMunicipio);

        jMenuShowVeiculo.setText("Veículo");
        jMenuShowVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowVeiculoActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowVeiculo);

        jMenuShowConta.setText("Conta");
        jMenuShowConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowContaActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowConta);

        jMenuShowFatura.setText("Fatura");
        jMenuShowFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowFaturaActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowFatura);

        jMenuShowParcela.setText("Parcela");
        jMenuShowParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowParcelaActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowParcela);

        jMenuShowProduto.setText("Produto");
        jMenuShowProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowProdutoActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowProduto);

        jMenuShowServico.setText("Serviço");
        jMenuShowServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowServicoActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowServico);

        jMenuShowEquipamento.setText("Equipamento");
        jMenuShowEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowEquipamentoActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowEquipamento);

        jMenuShowFuncionario.setText("Funcionario");
        jMenuShowFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowFuncionarioActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowFuncionario);

        jMenuBarPrincipal.add(jMenu10);

        jMenu15.setText("Adicionar");

        jMenuAddClientePF.setText("PessoaF");
        jMenuAddClientePF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddClientePFActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddClientePF);

        jMenuAddClientePj.setText("PessoaJ");
        jMenuAddClientePj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddClientePjActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddClientePj);

        jMenuAddEndereco.setText("Endereço");
        jMenuAddEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddEnderecoActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddEndereco);

        jMenuAddMunicipio.setText("Município");
        jMenuAddMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddMunicipioActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddMunicipio);

        jMenuAddVeiculo.setText("Veículo");
        jMenuAddVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddVeiculoActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddVeiculo);

        jMenuAddConta.setText("Conta");
        jMenuAddConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddContaActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddConta);

        jMenuAddFatura.setText("Fatura");
        jMenuAddFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddFaturaActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddFatura);

        jMenuAddParcela.setText("Parcela");
        jMenuAddParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddParcelaActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddParcela);

        jMenuAddProduto.setText("Produto");
        jMenuAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddProdutoActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddProduto);

        jMenuAddServico.setText("Serviço");
        jMenuAddServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddServicoActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddServico);

        jMenuAddEquipamento.setText("Equipamento");
        jMenuAddEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddEquipamentoActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddEquipamento);

        jMenuAddFuncionario.setText("Funcionario");
        jMenuAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddFuncionarioActionPerformed(evt);
            }
        });
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

        removeItem();
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jMenuShowPessoaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowPessoaFActionPerformed
        CrudPessoaF crud = new CrudPessoaF(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowPessoaFActionPerformed

    private void jMenuShowPessoaJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowPessoaJActionPerformed
        CrudPessoaJ crud = new CrudPessoaJ(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowPessoaJActionPerformed

    private void jMenuShowEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowEnderecoActionPerformed
        CrudEndereco crud = new CrudEndereco(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowEnderecoActionPerformed

    private void jMenuShowMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowMunicipioActionPerformed
        CrudMunicipio crud = new CrudMunicipio(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowMunicipioActionPerformed

    private void jMenuShowVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowVeiculoActionPerformed
        CrudVeiculo crud = new CrudVeiculo(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowVeiculoActionPerformed

    private void jMenuShowContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowContaActionPerformed
        CrudConta crud = new CrudConta(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowContaActionPerformed

    private void jMenuShowFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowFaturaActionPerformed
        CrudFatura crud = new CrudFatura(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowFaturaActionPerformed

    private void jMenuShowParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowParcelaActionPerformed
        CrudParcela crud = new CrudParcela(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowParcelaActionPerformed

    private void jMenuShowProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowProdutoActionPerformed
        CrudProduto crud = new CrudProduto(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowProdutoActionPerformed

    private void jMenuShowServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowServicoActionPerformed
        CrudServico crud = new CrudServico(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowServicoActionPerformed

    private void jMenuShowEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowEquipamentoActionPerformed
        CrudEquipamento crud = new CrudEquipamento(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowEquipamentoActionPerformed

    private void jMenuShowFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowFuncionarioActionPerformed
        CrudFuncionario crud = new CrudFuncionario(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowFuncionarioActionPerformed

    private void jMenuAddClientePFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddClientePFActionPerformed
        CrudAddPessoaF crud = new CrudAddPessoaF(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddClientePFActionPerformed

    private void jMenuAddClientePjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddClientePjActionPerformed
        CrudAddPessoaJ crud = new CrudAddPessoaJ(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddClientePjActionPerformed

    private void jMenuAddEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddEnderecoActionPerformed
        CrudAddEndereco crud = new CrudAddEndereco(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddEnderecoActionPerformed

    private void jMenuAddMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddMunicipioActionPerformed
        CrudAddMunicipio crud = new CrudAddMunicipio(dados);
        crud.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuAddMunicipioActionPerformed

    private void jMenuAddVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddVeiculoActionPerformed
        CrudAddVeiculo crud = new CrudAddVeiculo(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddVeiculoActionPerformed

    private void jMenuAddContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddContaActionPerformed
        CrudAddConta crud = new CrudAddConta(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddContaActionPerformed

    private void jMenuAddFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddFaturaActionPerformed
        CrudAddVeiculo crud = new CrudAddVeiculo(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddFaturaActionPerformed

    private void jMenuAddParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddParcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddParcelaActionPerformed

    private void jMenuAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddProdutoActionPerformed
        CrudAddProduto crud = new CrudAddProduto(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddProdutoActionPerformed

    private void jMenuAddServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddServicoActionPerformed
        CrudAddServico crud = new CrudAddServico(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddServicoActionPerformed

    private void jMenuAddEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddEquipamentoActionPerformed
        CrudAddEquipamento crud = new CrudAddEquipamento(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddEquipamentoActionPerformed

    private void jMenuAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddFuncionarioActionPerformed
        CrudAddFuncionario crud = new CrudAddFuncionario(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddFuncionarioActionPerformed

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

    private void removeItem() {

        if ((jTable.getSelectedRow()) > -1) {
            
            dtm.removeRow(jTable.getSelectedRow());

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
