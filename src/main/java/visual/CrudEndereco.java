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
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class CrudEndereco extends javax.swing.JFrame {

    private int indexMuni;
    private DefaultTableModel dtm;
    private EnderecoFichario ficharioAtual;
    private Data dados;
    private JDialog jd;

    public CrudEndereco(Data dados) {
        EnderecoFichario fichario = new EnderecoFichario();
        ficharioAtual = fichario;
        this.dados = dados;

        dtm = new DefaultTableModel(0, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        initComponents();
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setTitle("Tabela: Endereço");
        preencheTabela(ficharioAtual.getDataString(dados.arrayEnde), ficharioAtual.getColumnName());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextAlterAtributo1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextAlterAtributo2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextAlterAtributo3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextAlterAtributo4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextAlterAtributo5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextAlterAtributo6 = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jBotaoAlterSelecionarMunicipio = new javax.swing.JButton();
        jBotaoAlterPane = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonAlter = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenuShowCliente = new javax.swing.JMenuItem();
        jMenuShowEndereco = new javax.swing.JMenuItem();
        jMenuShowMunicipio = new javax.swing.JMenuItem();
        jMenuShowVeiculo = new javax.swing.JMenuItem();
        jMenuShowConta = new javax.swing.JMenuItem();
        jMenuShowFatura = new javax.swing.JMenuItem();
        jMenuShowParcela = new javax.swing.JMenuItem();
        jMenuShowItem = new javax.swing.JMenuItem();
        jMenuShowEquipamento = new javax.swing.JMenuItem();
        jMenuShowFuncionario = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuAddCliente = new javax.swing.JMenuItem();
        jMenuAddEndereco = new javax.swing.JMenuItem();
        jMenuAddMunicipio = new javax.swing.JMenuItem();
        jMenuAddVeiculo = new javax.swing.JMenuItem();
        jMenuAddConta = new javax.swing.JMenuItem();
        jMenuAddFatura = new javax.swing.JMenuItem();
        jMenuAddParcela = new javax.swing.JMenuItem();
        jMenuAddItem = new javax.swing.JMenuItem();
        jMenuAddEquipamento = new javax.swing.JMenuItem();
        jMenuAddFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel1.setText("Logradouro");

        jTextAlterAtributo1.setText("jTextField1");
        jTextAlterAtributo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAlterAtributo1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Número");

        jTextAlterAtributo2.setText("jTextField2");

        jLabel3.setText("Bairro");

        jTextAlterAtributo3.setText("jTextField3");

        jLabel4.setText("Município");

        jTextAlterAtributo4.setEditable(false);
        jTextAlterAtributo4.setText("jTextField4");

        jLabel5.setText("Complemento");

        jTextAlterAtributo5.setText("jTextField5");

        jLabel6.setText("CEP");

        jTextAlterAtributo6.setText("jTextField6");

        jBotaoAlterSelecionarMunicipio.setText("Selecionar");
        jBotaoAlterSelecionarMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoAlterSelecionarMunicipioActionPerformed(evt);
            }
        });

        jBotaoAlterPane.setText("Gravar");
        jBotaoAlterPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoAlterPaneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBotaoAlterPane))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextAlterAtributo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(68, 68, 68)
                                    .addComponent(jTextAlterAtributo6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(12, 12, 12)
                                    .addComponent(jTextAlterAtributo5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(35, 35, 35)
                                    .addComponent(jTextAlterAtributo4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(44, 44, 44)
                                    .addComponent(jTextAlterAtributo2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(57, 57, 57)
                                    .addComponent(jTextAlterAtributo3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotaoAlterSelecionarMunicipio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAlterAtributo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jTextAlterAtributo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jTextAlterAtributo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextAlterAtributo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBotaoAlterSelecionarMunicipio)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(jTextAlterAtributo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jTextAlterAtributo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoAlterPane, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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
        jButtonAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        jMenu10.setText("Mostrar");

        jMenuShowCliente.setText("Cliente");
        jMenuShowCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowClienteActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowCliente);

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

        jMenuShowItem.setText("Item");
        jMenuShowItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowItemActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowItem);

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

        jMenuAddCliente.setText("Cliente");
        jMenuAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddClienteActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddCliente);

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

        jMenuAddItem.setText("Item");
        jMenuAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddItemActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddItem);

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

        jMenuItem1.setText("Tela Principal");
        jMenu2.add(jMenuItem1);

        jMenuBarPrincipal.add(jMenu2);

        setJMenuBar(jMenuBarPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuShowVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowVeiculoActionPerformed
        CrudVeiculo crud = new CrudVeiculo(dados);
        crud.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuShowVeiculoActionPerformed

    private void jMenuShowMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowMunicipioActionPerformed
        CrudMunicipio crud = new CrudMunicipio(dados);
        crud.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuShowMunicipioActionPerformed

    private void jMenuShowEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowEnderecoActionPerformed
        CrudEndereco crud = new CrudEndereco(dados);
        crud.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuShowEnderecoActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed

        removeItem();
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jMenuShowClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowClienteActionPerformed
        CrudCliente crud = new CrudCliente(dados);
        crud.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuShowClienteActionPerformed

    private void jMenuAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddClienteActionPerformed
        CrudAddCliente crud = new CrudAddCliente(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddClienteActionPerformed

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

    private void jMenuShowItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowItemActionPerformed
        CrudItem crud = new CrudItem(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowItemActionPerformed

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

    private void jMenuAddContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddContaActionPerformed
        CrudAddConta crud = new CrudAddConta(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddContaActionPerformed

    private void jMenuAddFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddFaturaActionPerformed
        CrudAddFatura crud = new CrudAddFatura(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddFaturaActionPerformed

    private void jMenuAddParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddParcelaActionPerformed
        CrudAddParcela crud = new CrudAddParcela(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddParcelaActionPerformed

    private void jMenuAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddItemActionPerformed
        CrudAddItem crud = new CrudAddItem(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddItemActionPerformed

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

    private void jButtonAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterActionPerformed
        if (jTable.getSelectedRow() > -1) {
            Endereco ende = dados.arrayEnde.get(jTable.getSelectedRow());
            System.out.println(jTable.getSelectedRow());
            JDialog jd = new JDialog(this);
            jd.setSize(500, 400);
            jd.add(jPanel1);
            jd.setVisible(true);
            jTextAlterAtributo1.setText(ende.getLogradouro());
            jTextAlterAtributo2.setText(ende.getNumero());
            jTextAlterAtributo3.setText(ende.getBairro());
            jTextAlterAtributo4.setText(ende.getMunicipio().getNome());
            jTextAlterAtributo5.setText(ende.getComplemento());
            jTextAlterAtributo6.setText(ende.getCep());
            this.jd= jd;
        }
    }//GEN-LAST:event_jButtonAlterActionPerformed

    private void jTextAlterAtributo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAlterAtributo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAlterAtributo1ActionPerformed

    private void jBotaoAlterSelecionarMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoAlterSelecionarMunicipioActionPerformed
        String[] possibilidades;
        MunicipioFichario munFichario = new MunicipioFichario();
        String[][] stringToda;
        stringToda = munFichario.getDataString(dados.arrayMuni);
        possibilidades = new String[stringToda.length];
        int i = 0;
        for (String s[] : stringToda) {
            possibilidades[i] = s[0];
            i++;
        }
        JComboBox cb = new JComboBox(possibilidades);
        int input;
        input = JOptionPane.showConfirmDialog(this, cb, "Selecione o Municipio",
                JOptionPane.DEFAULT_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            String str = (String) cb.getSelectedItem();
            indexMuni = cb.getSelectedIndex();
            jTextAlterAtributo4.setText(str);

        }

    }//GEN-LAST:event_jBotaoAlterSelecionarMunicipioActionPerformed

    private void jBotaoAlterPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoAlterPaneActionPerformed

        Endereco endereco = new Endereco();
        Municipio municipio;

        municipio = dados.arrayMuni.get(indexMuni);
        endereco.setLogradouro(jTextAlterAtributo1.getText());
        endereco.setNumero(jTextAlterAtributo2.getText());
        endereco.setBairro(jTextAlterAtributo3.getText());
        endereco.setMunicipio(municipio);
        endereco.setComplemento(jTextAlterAtributo5.getText());
        endereco.setCep(jTextAlterAtributo6.getText());

        int input;
        input = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Alterar Endereço", JOptionPane.OK_CANCEL_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            dados.arrayEnde.set(jTable.getSelectedRow(), endereco);
            preencheTabela(ficharioAtual.getDataString(dados.arrayEnde), ficharioAtual.getColumnName());
            JOptionPane.showConfirmDialog(null, "Gravou corretamente", "Sucesso",
            JOptionPane.DEFAULT_OPTION);
            jd.setVisible(false);
            jd.dispose();
            

        }


    }//GEN-LAST:event_jBotaoAlterPaneActionPerformed

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
            boolean igual = false;
            Endereco ende = dados.arrayEnde.get(jTable.getSelectedRow());
            for (Cliente clie : dados.arrayClie) {
                if (ende == clie.getEnderecoComercial()) {
                    igual = true;

                }
                if (ende == clie.getEnderecoResidencial()) {
                    igual = true;
                }
            }

            if (igual == false) {
                int input;
                input = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Remover Endereço", JOptionPane.OK_CANCEL_OPTION);
                if (input == JOptionPane.OK_OPTION) {
                    ficharioAtual.remove(jTable.getSelectedRow(), dados.arrayEnde);
                    dtm.removeRow(jTable.getSelectedRow());

                }

            } else {

                JOptionPane.showMessageDialog(null, "O dado é utilizado em outra tabela");
            }

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jBotaoAlterPane;
    private javax.swing.JButton jBotaoAlterSelecionarMunicipio;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAlter;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAddCliente;
    private javax.swing.JMenuItem jMenuAddConta;
    private javax.swing.JMenuItem jMenuAddEndereco;
    private javax.swing.JMenuItem jMenuAddEquipamento;
    private javax.swing.JMenuItem jMenuAddFatura;
    private javax.swing.JMenuItem jMenuAddFuncionario;
    private javax.swing.JMenuItem jMenuAddItem;
    private javax.swing.JMenuItem jMenuAddMunicipio;
    private javax.swing.JMenuItem jMenuAddParcela;
    private javax.swing.JMenuItem jMenuAddVeiculo;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuShowCliente;
    private javax.swing.JMenuItem jMenuShowConta;
    private javax.swing.JMenuItem jMenuShowEndereco;
    private javax.swing.JMenuItem jMenuShowEquipamento;
    private javax.swing.JMenuItem jMenuShowFatura;
    private javax.swing.JMenuItem jMenuShowFuncionario;
    private javax.swing.JMenuItem jMenuShowItem;
    private javax.swing.JMenuItem jMenuShowMunicipio;
    private javax.swing.JMenuItem jMenuShowParcela;
    private javax.swing.JMenuItem jMenuShowVeiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextAlterAtributo1;
    private javax.swing.JTextField jTextAlterAtributo2;
    private javax.swing.JTextField jTextAlterAtributo3;
    private javax.swing.JTextField jTextAlterAtributo4;
    private javax.swing.JTextField jTextAlterAtributo5;
    private javax.swing.JTextField jTextAlterAtributo6;
    // End of variables declaration//GEN-END:variables
}
