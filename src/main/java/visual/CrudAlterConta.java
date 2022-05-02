/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package visual;

import dados.Data;
import fichario.ClienteFichario;
import java.awt.Frame;
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
public class CrudAlterConta extends javax.swing.JDialog {

    /**
     * Creates new form CrudAlterConta
     */
    private int indexCliente;
    private Data dados;
    private ArrayList<Servico> arrayServico = new ArrayList<>();
    private ArrayList<Produto> arrayProduto = new ArrayList<>();
    private ArrayList<Item> arrayItem;
    double totalServ=0;
    double totalProd=0;
    Conta conta;

    public CrudAlterConta(java.awt.Frame parent, boolean modal, Data dados,Conta conta) {
        super(parent, modal);
        this.setTitle("Tela Alterar Conta");
        this.dados = dados;
        this.conta=conta;
        
        
        
        initComponents();
        jTextFieldDia1.setText(Integer.toString(conta.getDataAbertura().getDayOfMonth())) ;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonGravar = new javax.swing.JButton();
        jLabelProduto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonAddAtributo1 = new javax.swing.JButton();
        jTextAtributo6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextAtributo3 = new javax.swing.JTextField();
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
        jTextFieldMes2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldAno2 = new javax.swing.JTextField();
        jTextFieldDia2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonVoltar.setText("<<<");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel4.setText("Quarto");

        jLabel1.setText("Alterar Conta");

        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jLabelProduto.setText("Qtd:0");

        jLabel3.setText("Data Fechamento");

        jLabel5.setText("Cliente");

        jButtonAddAtributo1.setText("Selecionar Cliente");
        jButtonAddAtributo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAtributo1ActionPerformed(evt);
            }
        });

        jTextAtributo6.setText("Cliente");
        jTextAtributo6.setEnabled(false);

        jLabel2.setText("Data Abertura");

        jTextAtributo3.setMinimumSize(new java.awt.Dimension(65, 25));

        jLabelServico.setText("Qtd:0");

        jBotaoTelaServicos.setText("Adicionar Serviços");
        jBotaoTelaServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoTelaServicosActionPerformed(evt);
            }
        });

        jBotaoTelaProdutos.setText("Adicionar Produtos");
        jBotaoTelaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoTelaProdutosActionPerformed(evt);
            }
        });

        jLabelTotal.setText("Total:  0");

        jTextFieldMes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMes1ActionPerformed(evt);
            }
        });

        jTextFieldDia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDia1ActionPerformed(evt);
            }
        });

        jLabel6.setText("/");

        jLabel7.setText("/");

        jLabel8.setText("Dia");

        jLabel10.setText("Mês");

        jTextFieldMes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMes2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Ano");

        jLabel12.setText("/");

        jLabel13.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jTextFieldDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldAno1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonVoltar)
                            .addGap(128, 128, 128)
                            .addComponent(jLabel8)
                            .addGap(33, 33, 33)
                            .addComponent(jLabel10)
                            .addGap(48, 48, 48)
                            .addComponent(jLabel11))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(jTextFieldDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jTextFieldMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jTextFieldAno2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(jTextAtributo3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabelTotal))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jBotaoTelaServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabelServico)
                            .addGap(31, 31, 31)
                            .addComponent(jTextAtributo6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jButtonAddAtributo1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jBotaoTelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jLabelProduto)
                            .addGap(28, 28, 28)
                            .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addContainerGap(304, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jButtonVoltar))
                        .addComponent(jLabel8)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGap(2, 2, 2)
                    .addComponent(jLabel1)
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jTextFieldAno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel3))
                    .addGap(48, 48, 48)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextAtributo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addComponent(jLabelTotal)
                    .addGap(4, 4, 4)
                    .addComponent(jLabel5)
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBotaoTelaServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabelServico))
                        .addComponent(jTextAtributo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAddAtributo1))
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBotaoTelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabelProduto))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        CrudConta crud = new CrudConta(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
                dados.arrayCont.add(conta);
                JOptionPane.showConfirmDialog(null, "Conta gravada com sucesso", "Sucesso",
                        JOptionPane.DEFAULT_OPTION);

            } else {

                TelaAddFatura tela = new TelaAddFatura((Frame)this.getParent(), true, dados, conta);

                if (tela.showDialog()) {
                    dados.arrayCont.add(conta);
                    JOptionPane.showConfirmDialog(null, "Conta gravada com sucesso", "Sucesso",
                            JOptionPane.DEFAULT_OPTION);

                } else {
                    JOptionPane.showConfirmDialog(null,
                            "É necessário cadastrar uma parcela caso o fechamento ocorreu",
                            "Ok", JOptionPane.DEFAULT_OPTION);
                }

            }

        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "Não gravou corretamente", "Erro",
                    JOptionPane.DEFAULT_OPTION);

        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

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

    private void jBotaoTelaServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoTelaServicosActionPerformed

        TelaAddServicos tela = new TelaAddServicos((Frame)this.getParent(), true, dados.arrayItem, arrayServico);

        totalServ = 0;
        arrayServico = tela.showDialog();

        jLabelServico.setText("Qtd:" + Integer.toString(arrayServico.size()));
        for (Servico serv : arrayServico) {
            totalServ += serv.getPreco();
        }
        jLabelTotal.setText("Total  :" + Double.toString(totalServ + totalProd));
        tela.dispose();

    }//GEN-LAST:event_jBotaoTelaServicosActionPerformed

    private void jBotaoTelaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoTelaProdutosActionPerformed
        TelaAddProdutos tela = new TelaAddProdutos((Frame)this.getParent(), true, dados.arrayItem, arrayProduto);
        totalProd = 0;
        arrayProduto = tela.showDialog();
        jLabelProduto.setText("Qtd:" + Integer.toString(arrayProduto.size()));
        for (Produto prod : arrayProduto) {
            totalProd += prod.getPreco();
        }
        jLabelTotal.setText("Total  :" + Double.toString(totalServ + totalProd));
        tela.dispose();
    }//GEN-LAST:event_jBotaoTelaProdutosActionPerformed

    private void jTextFieldMes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMes1ActionPerformed

    private void jTextFieldDia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDia1ActionPerformed

    private void jTextFieldMes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMes2ActionPerformed

    /**
     * @param args the command line arguments
     */

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
