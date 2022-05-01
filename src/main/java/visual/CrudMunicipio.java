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
import dados.Data;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class CrudMunicipio extends javax.swing.JFrame {

    private int indexMuni;
    private DefaultTableModel dtm;
    private ArrayList<Municipio> arrayAtual;
    private MunicipioFichario ficharioAtual;
    private Data dados;

    public CrudMunicipio(Data dados) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextAlterAtributo1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextAlterAtributo2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextAlterAtributo3 = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jBotaoAlterPane = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jButtonAdd1 = new javax.swing.JButton();
        jButtonRemove1 = new javax.swing.JButton();
        jButtonAlter1 = new javax.swing.JButton();
        jMenuBarPrincipal1 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenuShowCliente1 = new javax.swing.JMenuItem();
        jMenuShowEndereco1 = new javax.swing.JMenuItem();
        jMenuShowMunicipio1 = new javax.swing.JMenuItem();
        jMenuShowVeiculo1 = new javax.swing.JMenuItem();
        jMenuShowConta1 = new javax.swing.JMenuItem();
        jMenuShowFatura1 = new javax.swing.JMenuItem();
        jMenuShowParcela1 = new javax.swing.JMenuItem();
        jMenuShowItem1 = new javax.swing.JMenuItem();
        jMenuShowEquipamento1 = new javax.swing.JMenuItem();
        jMenuShowFuncionario1 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuAddCliente1 = new javax.swing.JMenuItem();
        jMenuAddEndereco1 = new javax.swing.JMenuItem();
        jMenuAddMunicipio1 = new javax.swing.JMenuItem();
        jMenuAddVeiculo1 = new javax.swing.JMenuItem();
        jMenuAddConta1 = new javax.swing.JMenuItem();
        jMenuAddFatura1 = new javax.swing.JMenuItem();
        jMenuAddParcela1 = new javax.swing.JMenuItem();
        jMenuAddItem1 = new javax.swing.JMenuItem();
        jMenuAddEquipamento1 = new javax.swing.JMenuItem();
        jMenuAddFuncionario1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 20));

        jTextAlterAtributo1.setText("jTextField1");
        jTextAlterAtributo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAlterAtributo1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextAlterAtributo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 140, -1));

        jLabel2.setText("Estado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTextAlterAtributo2.setText("jTextField2");
        jPanel1.add(jTextAlterAtributo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 46, 140, -1));

        jLabel3.setText("Páis");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jTextAlterAtributo3.setText("jTextField3");
        jPanel1.add(jTextAlterAtributo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 86, 140, -1));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 237, 34, 25));

        jBotaoAlterPane.setText("Gravar");
        jBotaoAlterPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoAlterPaneActionPerformed(evt);
            }
        });
        jPanel1.add(jBotaoAlterPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jInternalFrame1.setVisible(true);

        jTable1.setModel(dtm);
        jScrollPane3.setViewportView(jTable1);

        jInternalFrame1.getContentPane().add(jScrollPane3, java.awt.BorderLayout.CENTER);
        jInternalFrame1.getContentPane().add(filler4, java.awt.BorderLayout.PAGE_START);
        jInternalFrame1.getContentPane().add(filler5, java.awt.BorderLayout.PAGE_END);

        jButtonAdd1.setText("Adicionar");
        jInternalFrame1.getContentPane().add(jButtonAdd1, java.awt.BorderLayout.LINE_END);

        jButtonRemove1.setText("Remover");
        jButtonRemove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemove1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonRemove1, java.awt.BorderLayout.LINE_START);

        jButtonAlter1.setText("Alterar");
        jButtonAlter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlter1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonAlter1, java.awt.BorderLayout.CENTER);

        jMenu11.setText("Mostrar");

        jMenuShowCliente1.setText("Cliente");
        jMenuShowCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowCliente1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuShowCliente1);

        jMenuShowEndereco1.setText("Endereço");
        jMenuShowEndereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowEndereco1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuShowEndereco1);

        jMenuShowMunicipio1.setText("Município");
        jMenuShowMunicipio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowMunicipio1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuShowMunicipio1);

        jMenuShowVeiculo1.setText("Veículo");
        jMenuShowVeiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowVeiculo1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuShowVeiculo1);

        jMenuShowConta1.setText("Conta");
        jMenuShowConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowConta1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuShowConta1);

        jMenuShowFatura1.setText("Fatura");
        jMenuShowFatura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowFatura1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuShowFatura1);

        jMenuShowParcela1.setText("Parcela");
        jMenuShowParcela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowParcela1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuShowParcela1);

        jMenuShowItem1.setText("Item");
        jMenuShowItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowItem1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuShowItem1);

        jMenuShowEquipamento1.setText("Equipamento");
        jMenuShowEquipamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowEquipamento1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuShowEquipamento1);

        jMenuShowFuncionario1.setText("Funcionario");
        jMenuShowFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowFuncionario1ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuShowFuncionario1);

        jMenuBarPrincipal1.add(jMenu11);

        jMenu16.setText("Adicionar");

        jMenuAddCliente1.setText("Cliente");
        jMenuAddCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddCliente1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuAddCliente1);

        jMenuAddEndereco1.setText("Endereço");
        jMenuAddEndereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddEndereco1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuAddEndereco1);

        jMenuAddMunicipio1.setText("Município");
        jMenuAddMunicipio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddMunicipio1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuAddMunicipio1);

        jMenuAddVeiculo1.setText("Veículo");
        jMenuAddVeiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddVeiculo1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuAddVeiculo1);

        jMenuAddConta1.setText("Conta");
        jMenuAddConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddConta1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuAddConta1);

        jMenuAddFatura1.setText("Fatura");
        jMenuAddFatura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddFatura1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuAddFatura1);

        jMenuAddParcela1.setText("Parcela");
        jMenuAddParcela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddParcela1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuAddParcela1);

        jMenuAddItem1.setText("Item");
        jMenuAddItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddItem1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuAddItem1);

        jMenuAddEquipamento1.setText("Equipamento");
        jMenuAddEquipamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddEquipamento1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuAddEquipamento1);

        jMenuAddFuncionario1.setText("Funcionario");
        jMenuAddFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddFuncionario1ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuAddFuncionario1);

        jMenuBarPrincipal1.add(jMenu16);

        jMenu3.setText("Ir para");

        jMenuItem2.setText("Tela Principal");
        jMenu3.add(jMenuItem2);

        jMenuBarPrincipal1.add(jMenu3);

        jInternalFrame1.setJMenuBar(jMenuBarPrincipal1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 400));
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

        removeItem();
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterActionPerformed
        if (jTable.getSelectedRow() > -1) {
            indexMuni = jTable.getSelectedRow();
            Municipio muni = dados.arrayMuni.get(jTable.getSelectedRow());
            JDialog jd = new JDialog(this);
            jd.setSize(400, 250);
            jd.add(jPanel1);
            jd.setVisible(true);

            jTextAlterAtributo1.setText(muni.getNome());
            jTextAlterAtributo2.setText(muni.getEstado());
            jTextAlterAtributo3.setText(muni.getPais());
            System.out.println(indexMuni);
        }
    }//GEN-LAST:event_jButtonAlterActionPerformed

    private void jTextAlterAtributo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAlterAtributo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAlterAtributo1ActionPerformed

    private void jBotaoAlterPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoAlterPaneActionPerformed

        Municipio municipio = new Municipio();
        municipio = dados.arrayMuni.get(indexMuni);

        municipio.setNome(jTextAlterAtributo1.getText());
        municipio.setEstado(jTextAlterAtributo2.getText());
        municipio.setPais(jTextAlterAtributo3.getText());
        int input;
        input = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Alterar Município", JOptionPane.OK_CANCEL_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            dados.arrayMuni.set(jTable.getSelectedRow(), municipio);
            preencheTabela(ficharioAtual.getDataString(dados.arrayMuni), ficharioAtual.getColumnName());
            JOptionPane.showConfirmDialog(null, "Gravou corretamente", "Sucesso",
                    JOptionPane.DEFAULT_OPTION);

        }

    }//GEN-LAST:event_jBotaoAlterPaneActionPerformed

    private void jMenuShowCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuShowCliente1ActionPerformed

    private void jMenuShowEndereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowEndereco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuShowEndereco1ActionPerformed

    private void jMenuShowMunicipio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowMunicipio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuShowMunicipio1ActionPerformed

    private void jMenuShowVeiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowVeiculo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuShowVeiculo1ActionPerformed

    private void jMenuShowConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowConta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuShowConta1ActionPerformed

    private void jMenuShowFatura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowFatura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuShowFatura1ActionPerformed

    private void jMenuShowParcela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowParcela1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuShowParcela1ActionPerformed

    private void jMenuShowItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuShowItem1ActionPerformed

    private void jMenuShowEquipamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowEquipamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuShowEquipamento1ActionPerformed

    private void jMenuShowFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowFuncionario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuShowFuncionario1ActionPerformed

    private void jMenuAddCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddCliente1ActionPerformed

    private void jMenuAddEndereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddEndereco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddEndereco1ActionPerformed

    private void jMenuAddMunicipio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddMunicipio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddMunicipio1ActionPerformed

    private void jMenuAddVeiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddVeiculo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddVeiculo1ActionPerformed

    private void jMenuAddConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddConta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddConta1ActionPerformed

    private void jMenuAddFatura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddFatura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddFatura1ActionPerformed

    private void jMenuAddParcela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddParcela1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddParcela1ActionPerformed

    private void jMenuAddItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddItem1ActionPerformed

    private void jMenuAddEquipamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddEquipamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddEquipamento1ActionPerformed

    private void jMenuAddFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddFuncionario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAddFuncionario1ActionPerformed

    private void jButtonRemove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemove1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemove1ActionPerformed

    private void jButtonAlter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlter1ActionPerformed

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
        boolean igual = false;

        if ((jTable.getSelectedRow()) > -1) {
            Municipio muni = arrayAtual.get(jTable.getSelectedRow());
            for (Endereco ende : dados.arrayEnde) {
                if (muni == ende.getMunicipio()) {
                    igual = true;

                }
            }

            if (igual == false) {
                int input;
                input = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Remover Municipio", JOptionPane.OK_CANCEL_OPTION);
                if (input == JOptionPane.OK_OPTION) {
                    ficharioAtual.remove(jTable.getSelectedRow(), arrayAtual);
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
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JButton jBotaoAlterPane;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAdd1;
    private javax.swing.JButton jButtonAlter;
    private javax.swing.JButton jButtonAlter1;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonRemove1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAddCliente1;
    private javax.swing.JMenuItem jMenuAddClientePF;
    private javax.swing.JMenuItem jMenuAddClientePj;
    private javax.swing.JMenuItem jMenuAddConta;
    private javax.swing.JMenuItem jMenuAddConta1;
    private javax.swing.JMenuItem jMenuAddEndereco;
    private javax.swing.JMenuItem jMenuAddEndereco1;
    private javax.swing.JMenuItem jMenuAddEquipamento;
    private javax.swing.JMenuItem jMenuAddEquipamento1;
    private javax.swing.JMenuItem jMenuAddFatura;
    private javax.swing.JMenuItem jMenuAddFatura1;
    private javax.swing.JMenuItem jMenuAddFuncionario;
    private javax.swing.JMenuItem jMenuAddFuncionario1;
    private javax.swing.JMenuItem jMenuAddItem1;
    private javax.swing.JMenuItem jMenuAddMunicipio;
    private javax.swing.JMenuItem jMenuAddMunicipio1;
    private javax.swing.JMenuItem jMenuAddParcela;
    private javax.swing.JMenuItem jMenuAddParcela1;
    private javax.swing.JMenuItem jMenuAddProduto;
    private javax.swing.JMenuItem jMenuAddServico;
    private javax.swing.JMenuItem jMenuAddVeiculo;
    private javax.swing.JMenuItem jMenuAddVeiculo1;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenuBar jMenuBarPrincipal1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuShowCliente1;
    private javax.swing.JMenuItem jMenuShowConta;
    private javax.swing.JMenuItem jMenuShowConta1;
    private javax.swing.JMenuItem jMenuShowEndereco;
    private javax.swing.JMenuItem jMenuShowEndereco1;
    private javax.swing.JMenuItem jMenuShowEquipamento;
    private javax.swing.JMenuItem jMenuShowEquipamento1;
    private javax.swing.JMenuItem jMenuShowFatura;
    private javax.swing.JMenuItem jMenuShowFatura1;
    private javax.swing.JMenuItem jMenuShowFuncionario;
    private javax.swing.JMenuItem jMenuShowFuncionario1;
    private javax.swing.JMenuItem jMenuShowItem1;
    private javax.swing.JMenuItem jMenuShowMunicipio;
    private javax.swing.JMenuItem jMenuShowMunicipio1;
    private javax.swing.JMenuItem jMenuShowParcela;
    private javax.swing.JMenuItem jMenuShowParcela1;
    private javax.swing.JMenuItem jMenuShowPessoaF;
    private javax.swing.JMenuItem jMenuShowPessoaJ;
    private javax.swing.JMenuItem jMenuShowProduto;
    private javax.swing.JMenuItem jMenuShowServico;
    private javax.swing.JMenuItem jMenuShowVeiculo;
    private javax.swing.JMenuItem jMenuShowVeiculo1;
    private javax.swing.JMenuItem jMenuTelaPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextAlterAtributo1;
    private javax.swing.JTextField jTextAlterAtributo2;
    private javax.swing.JTextField jTextAlterAtributo3;
    // End of variables declaration//GEN-END:variables
}
