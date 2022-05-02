/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;

import dados.Data;
import fichario.ClienteFichario;
import fichario.ContaFichario;
import fichario.MunicipioFichario;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Conta;
import model.Item;
import model.Produto;
import model.Servico;

/**
 *
 * @author Victor
 */
public class CrudAddConta extends javax.swing.JFrame {

    /**
     * Creates new form CrudAddMunicipio
     */
    private int indexCliente;
    private Data dados;
    private ArrayList<Servico> arrayServico = new ArrayList<>();
    private ArrayList<Produto> arrayProduto = new ArrayList<>();
    private ArrayList<Item> arrayItem;
    double totalServ;
    double totalProd;

    public CrudAddConta(Data dados) {
        this.dados = dados;

        totalServ = 0;
        totalProd = 0;
        this.setTitle("Tela Adicionar Conta");
        initComponents();
    }

    public CrudAddConta() {
        totalServ = 0;
        totalProd = 0;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextAtributo3 = new javax.swing.JTextField();
        jButtonAddAtributo1 = new javax.swing.JButton();
        jTextAtributo6 = new javax.swing.JTextField();
        jButtonGravar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelProduto = new javax.swing.JLabel();
        jLabelServico = new javax.swing.JLabel();
        jBotaoTelaServicos = new javax.swing.JButton();
        jBotaoTelaProdutos = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldMes1 = new javax.swing.JTextField();
        jTextFieldAno1 = new javax.swing.JTextField();
        jTextFieldDia1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldMes2 = new javax.swing.JTextField();
        jTextFieldAno2 = new javax.swing.JTextField();
        jTextFieldDia2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setText("Conta");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel1.setText("Cadastro:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextAtributo3.setMinimumSize(new java.awt.Dimension(65, 25));
        getContentPane().add(jTextAtributo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 150, -1));

        jButtonAddAtributo1.setText("Selecionar Cliente");
        jButtonAddAtributo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAtributo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddAtributo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jTextAtributo6.setText("Cliente");
        jTextAtributo6.setEnabled(false);
        getContentPane().add(jTextAtributo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 150, -1));

        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 332, 150, 36));

        jLabel2.setText("Data Abertura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel3.setText("Data Fechamento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel4.setText("Quarto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel5.setText("Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jButtonVoltar.setText("<<<");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jLabelProduto.setText("Qtd:0");
        getContentPane().add(jLabelProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jLabelServico.setText("Qtd:0");
        getContentPane().add(jLabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jBotaoTelaServicos.setText("Adicionar Serviços");
        jBotaoTelaServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoTelaServicosActionPerformed(evt);
            }
        });
        getContentPane().add(jBotaoTelaServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, 39));

        jBotaoTelaProdutos.setText("Adicionar Produtos");
        jBotaoTelaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoTelaProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(jBotaoTelaProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 311, 138, 39));

        jLabelTotal.setText("Total:  0");
        getContentPane().add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jTextFieldMes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMes1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 30, -1));
        getContentPane().add(jTextFieldAno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 70, -1));

        jTextFieldDia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDia1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 30, -1));

        jLabel6.setText("/");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 50, -1));

        jLabel7.setText("/");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 20, -1));

        jLabel8.setText("Dia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        jLabel10.setText("Mês");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 20));

        jLabel11.setText("Ano");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jTextFieldMes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMes2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 30, -1));
        getContentPane().add(jTextFieldAno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 70, -1));
        getContentPane().add(jTextFieldDia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 30, -1));

        jLabel12.setText("/");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 50, -1));

        jLabel13.setText("/");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 20, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddAtributo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAtributo1ActionPerformed
        String[] possibilidades;
        ClienteFichario clieFichario = new ClienteFichario();
        String[][] stringToda;
        stringToda = clieFichario.getDataString(dados.arrayClie);
        possibilidades = new String[stringToda.length];
        int i = 0;
        for (String s[] : stringToda) {
            possibilidades[i] = s[0] + " " + s[1] + " " + s[2];
            i++;
        }

        JComboBox cb = new JComboBox(possibilidades);
        int input;
        input = JOptionPane.showConfirmDialog(this, cb, "Selecione o Cliente",
                JOptionPane.DEFAULT_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            String str = (String) cb.getSelectedItem();
            indexCliente = cb.getSelectedIndex();
            jTextAtributo6.setText(str);

        }
    }//GEN-LAST:event_jButtonAddAtributo1ActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        Conta conta = new Conta();
        Item[] item;

        try {
            int dia, mes, ano;

            dia = Integer.parseInt(jTextFieldDia1.getText());
            mes = Integer.parseInt(jTextFieldMes1.getText());
            ano = Integer.parseInt(jTextFieldAno1.getText());
            LocalDate date = LocalDate.of(ano, mes, dia);
            conta.setDataAbertura(date);

            if (!jTextFieldDia2.getText().isEmpty() && !jTextFieldMes2.getText().isEmpty() && !jTextFieldAno2.getText().isEmpty()) {
                dia = Integer.parseInt(jTextFieldDia2.getText());
                mes = Integer.parseInt(jTextFieldMes2.getText());
                ano = Integer.parseInt(jTextFieldAno2.getText());
                LocalDate date2 = LocalDate.of(ano, mes, dia);
                conta.setDataFechamento(date2);
            }

            conta.setQuarto(Integer.parseInt(jTextAtributo3.getText()));

            arrayItem = new ArrayList<>();
            if (!arrayServico.isEmpty()) {
                for (Servico serv : arrayServico) {
                    arrayItem.add(serv);
                }
            }

            if (!arrayProduto.isEmpty()) {
                for (Produto prod : arrayProduto) {
                    arrayItem.add(prod);
                }
            }
            if (!arrayItem.isEmpty()) {
                int i = arrayItem.size();
                item = arrayItem.toArray(new Item[i]);
                conta.setItens(item);
            }

            conta.setTotal(totalServ + totalProd);
            conta.setCliente(dados.arrayClie.get(indexCliente));

            if (conta.getDataFechamento() == null) {
                dados.ficharioConta.add(conta);
                JOptionPane.showConfirmDialog(null, "Conta gravada com sucesso", "Sucesso",
                        JOptionPane.DEFAULT_OPTION);

            } else {

                TelaAddFatura tela = new TelaAddFatura(this, true, dados, conta);

                if (tela.showDialog()) {
                    dados.ficharioConta.add(conta);
                    JOptionPane.showConfirmDialog(null, "Conta gravada com sucesso", "Sucesso",
                            JOptionPane.DEFAULT_OPTION);

                } else {
                    JOptionPane.showConfirmDialog(null,
                            "É necessário cadastrar uma parcela caso o fechamento ocorra",
                            "Ok", JOptionPane.DEFAULT_OPTION);
                }

            }

        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "Não gravou corretamente", "Erro",
                    JOptionPane.DEFAULT_OPTION);

        }

    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        CrudConta crud = new CrudConta(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jBotaoTelaServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoTelaServicosActionPerformed

        TelaAddServicos tela = new TelaAddServicos(this, true, dados.arrayItem, arrayServico);

        totalServ = 0;
        arrayServico = tela.showDialog();

        jLabelServico.setText("Qtd:" + Integer.toString(arrayServico.size()));
        for (Servico serv : arrayServico) {
            totalServ += serv.getPreco();
        }
        jLabelTotal.setText("Total  :" + Double.toString(totalServ + totalProd));
        tela.dispose();


    }//GEN-LAST:event_jBotaoTelaServicosActionPerformed

    private void jTextFieldMes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMes1ActionPerformed

    private void jTextFieldMes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMes2ActionPerformed

    private void jTextFieldDia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDia1ActionPerformed

    private void jBotaoTelaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoTelaProdutosActionPerformed
        TelaAddProdutos tela = new TelaAddProdutos(this, true, dados.arrayItem, arrayProduto);
        totalProd = 0;
        arrayProduto = tela.showDialog();
        jLabelProduto.setText("Qtd:" + Integer.toString(arrayProduto.size()));
        for (Produto prod : arrayProduto) {
            totalProd += prod.getPreco();
        }
        jLabelTotal.setText("Total  :" + Double.toString(totalServ + totalProd));
        tela.dispose();

    }//GEN-LAST:event_jBotaoTelaProdutosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrudAddConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudAddConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudAddConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudAddConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudAddConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoTelaProdutos;
    private javax.swing.JButton jBotaoTelaServicos;
    private javax.swing.JButton jButtonAddAtributo1;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JTextField jTextAtributo3;
    private javax.swing.JTextField jTextAtributo6;
    private javax.swing.JTextField jTextFieldAno1;
    private javax.swing.JTextField jTextFieldAno2;
    private javax.swing.JTextField jTextFieldDia1;
    private javax.swing.JTextField jTextFieldDia2;
    private javax.swing.JTextField jTextFieldMes1;
    private javax.swing.JTextField jTextFieldMes2;
    // End of variables declaration//GEN-END:variables
}
