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
import model.Fatura;
import model.Item;
import model.Parcela;
import model.Produto;
import model.Servico;

/**
 *
 * @author Victor
 */
public class CrudAlterFatura extends javax.swing.JDialog {

    /**
     * Creates new form CrudAlterConta
     */
    private int indexCliente;
    private Data dados;
    int quantParcelas;
    Conta conta;
    int index;
    int jaPago;
    Fatura fatura;

    public CrudAlterFatura(java.awt.Frame parent, boolean modal, Data dados, Fatura fatura, int index) {
        super(parent, modal);
        this.setTitle("Tela Alterar Fatura");
        this.dados = dados;

        this.index = index;
        this.fatura = fatura;
        int jaPago = 0;
        jButtonPagar1.setText("Pagar Parcela  " + jaPago + 1);
        initComponents();
        String a = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getDayOfMonth());
        String b = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getMonthValue());
        String c = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getYear());
        String d = Double.toString(fatura.getParcelas()[2].getValor());
        jLabelParcela1.setText("Data de vencimento: " + a + "." + b + "." + c + ": Valor = " + d);
        if (fatura.getParcelas()[0].getDataPagamento() != null) {
            jLabelParcela1.setText("Parcela paga.");
            jaPago++;
        }
        jButtonPagar1.setText("Pagar Parcela  " + jaPago + 1);

        jLabelParcela2.setVisible(false);
        jLabelDias2.setVisible(false);
        jLabelParcela3.setVisible(false);
        jLabelDias3.setVisible(false);

        if (quantParcelas > 1) {
            jLabelParcela2.setVisible(true);
            jLabelDias2.setVisible(true);
            String a2 = Integer.toString(fatura.getParcelas()[1].getDataVencimento().getDayOfMonth());
            String b2 = Integer.toString(fatura.getParcelas()[1].getDataVencimento().getMonthValue());
            String c2 = Integer.toString(fatura.getParcelas()[1].getDataVencimento().getYear());
            String d2 = Double.toString(fatura.getParcelas()[1].getValor());
            jLabelParcela2.setText("Data de vencimento: " + a2 + "." + b2 + "." + c2 + ": Valor = " + d2);
            if (fatura.getParcelas()[1].getDataPagamento() != null) {
                jLabelParcela2.setText("Parcela paga.");
                jaPago++;
            }

            jButtonPagar1.setText("Pagar Parcela  " + jaPago + 1);
        }
        if (quantParcelas > 2) {
            jLabelParcela3.setVisible(true);
            jLabelDias3.setVisible(true);
            String a3 = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getDayOfMonth());
            String b3 = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getMonthValue());
            String c3 = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getYear());
            String d3 = Double.toString(fatura.getParcelas()[2].getValor());
            jLabelParcela3.setText("Data de vencimento: " + a3 + "." + b3 + "." + c3 + ": Valor = " + d3);
            if (fatura.getParcelas()[2].getDataPagamento() != null) {
                jLabelParcela3.setText("Parcela paga.");
                jaPago++;
            }
        }
        if (fatura.getQtdParcelas() == jaPago) {
            jButtonPagar1.setText("Todas Parcelas pagas");
        }

        this.jaPago = jaPago;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonGravar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabelParcela1 = new javax.swing.JLabel();
        jButtonPagar1 = new javax.swing.JButton();
        jLabelDias1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabelParcela2 = new javax.swing.JLabel();
        jLabelParcela3 = new javax.swing.JLabel();
        jLabelDias2 = new javax.swing.JLabel();
        jLabelDias3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonVoltar.setText("<<<");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Alterar Fatura");

        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cliente");

        jLabelParcela1.setText("Parcela 1 ");

        jButtonPagar1.setText("Pagar Parcela");
        jButtonPagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagar1ActionPerformed(evt);
            }
        });

        jLabelDias1.setText("Data de vencimento: 12 12 2004 : Valor = 1546");

        jLabel19.setText("Dia");

        jLabelParcela2.setText("Parcela 2 ");

        jLabelParcela3.setText("Parcela 3 ");

        jLabelDias2.setText("jLabel16");

        jLabelDias3.setText("jLabel16");

        jLabel3.setText("Mês");

        jLabel4.setText("Ano");

        jLabel6.setText("Data do Pagamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonVoltar)
                                .addGap(128, 128, 128)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jButtonPagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelParcela1)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabelParcela2)
                                    .addComponent(jLabelParcela3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDias3)
                                    .addComponent(jLabelDias1)
                                    .addComponent(jLabelDias2))))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonVoltar))
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelParcela1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelParcela2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelParcela3)
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDias1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDias2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDias3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel19)
                            .addComponent(jLabel4)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        CrudFatura crud = new CrudFatura(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

        Item[] item;

        try {
            dados.ficharioFatura.arrayFatu.set(index, fatura);

            JOptionPane.showConfirmDialog(null, "Gravou corretamente", "Sucesso",
                    JOptionPane.DEFAULT_OPTION);
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "Não gravou corretamente", "Erro",
                    JOptionPane.DEFAULT_OPTION);

        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonPagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagar1ActionPerformed

        int dia = Integer.parseInt(jTextField1.getText());
        int mes = Integer.parseInt(jTextField2.getText());
        int ano = Integer.parseInt(jTextField3.getText());
        LocalDate date = LocalDate.of(ano, mes, dia);

        if (jaPago < quantParcelas) {

            fatura.getParcelas()[jaPago].setDataPagamento(date);
            fatura.JurosPorAtraso();
            String h = Double.toString(fatura.getParcelas()[jaPago].getValorfinal());

            int input;
            input = JOptionPane.showConfirmDialog(null, "O preço final é " + h + " ", "Pagar", JOptionPane.OK_CANCEL_OPTION);
            if (input == JOptionPane.OK_OPTION) {

                JOptionPane.showConfirmDialog(null, "Gravou corretamente", "Sucesso",
                        JOptionPane.DEFAULT_OPTION);

            }

        } else {
            JOptionPane.showConfirmDialog(null, "Não tem parcela para pagar", "Erro",
                    JOptionPane.DEFAULT_OPTION);
        }

    }//GEN-LAST:event_jButtonPagar1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonPagar1;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDias1;
    private javax.swing.JLabel jLabelDias2;
    private javax.swing.JLabel jLabelDias3;
    private javax.swing.JLabel jLabelParcela1;
    private javax.swing.JLabel jLabelParcela2;
    private javax.swing.JLabel jLabelParcela3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    void showDialog() {
        this.setVisible(true);

    }

    void atualiza() {
        jaPago = 0;
        jButtonPagar1.setText("Pagar Parcela  " + jaPago + 1);
        initComponents();
        String a = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getDayOfMonth());
        String b = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getMonthValue());
        String c = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getYear());
        String d = Double.toString(fatura.getParcelas()[2].getValor());
        jLabelParcela1.setText("Data de vencimento: " + a + "." + b + "." + c + ": Valor = " + d);
        if (fatura.getParcelas()[0].getDataPagamento() != null) {
            jLabelParcela1.setText("Parcela paga.");
            jaPago++;
        }
        jButtonPagar1.setText("Pagar Parcela  " + jaPago + 1);

        jLabelParcela2.setVisible(false);
        jLabelDias2.setVisible(false);
        jLabelParcela3.setVisible(false);
        jLabelDias3.setVisible(false);

        if (quantParcelas > 1) {
            jLabelParcela2.setVisible(true);
            jLabelDias2.setVisible(true);
            String a2 = Integer.toString(fatura.getParcelas()[1].getDataVencimento().getDayOfMonth());
            String b2 = Integer.toString(fatura.getParcelas()[1].getDataVencimento().getMonthValue());
            String c2 = Integer.toString(fatura.getParcelas()[1].getDataVencimento().getYear());
            String d2 = Double.toString(fatura.getParcelas()[1].getValor());
            jLabelParcela2.setText("Data de vencimento: " + a2 + "." + b2 + "." + c2 + ": Valor = " + d2);
            if (fatura.getParcelas()[1].getDataPagamento() != null) {
                jLabelParcela2.setText("Parcela paga.");
                jaPago++;
            }

            jButtonPagar1.setText("Pagar Parcela  " + jaPago + 1);
        }
        if (quantParcelas > 2) {
            jLabelParcela3.setVisible(true);
            jLabelDias3.setVisible(true);
            String a3 = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getDayOfMonth());
            String b3 = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getMonthValue());
            String c3 = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getYear());
            String d3 = Double.toString(fatura.getParcelas()[2].getValor());
            jLabelParcela3.setText("Data de vencimento: " + a3 + "." + b3 + "." + c3 + ": Valor = " + d3);
            if (fatura.getParcelas()[2].getDataPagamento() != null) {
                jLabelParcela3.setText("Parcela paga.");
                jaPago++;
            }
        }
        if (fatura.getQtdParcelas() == jaPago) {
            jButtonPagar1.setText("Todas Parcelas pagas");
        }

    }
}
