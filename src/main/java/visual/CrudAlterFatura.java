/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package visual;

import dados.Data;
import fichario.ClienteFichario;
import java.awt.Frame;
import java.text.DecimalFormat;
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
    private Data dados;
    int quantParcelas;
    Conta conta;
    int index;
    int jaPago=0;
    Fatura fatura;

    public CrudAlterFatura(java.awt.Frame parent, boolean modal, Data dados, Fatura fatura, int index) {
        super(parent, modal);
        this.setTitle("Tela Alterar Fatura");
        this.dados = dados;
        quantParcelas=fatura.getQtdParcelas();
        this.index = index;
        this.fatura = fatura;      
        initComponents();
        jButtonPagar1.setText("Pagar Parcela  " + jaPago + 1);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        String a = Integer.toString(fatura.getParcelas()[0].getDataVencimento().getDayOfMonth());
        String b = Integer.toString(fatura.getParcelas()[0].getDataVencimento().getMonthValue());
        String c = Integer.toString(fatura.getParcelas()[0].getDataVencimento().getYear());
        String d =  numberFormat.format(fatura.getParcelas()[0].getValor());
        jLabelDias1.setText("Data de vencimento: " + a + "." + b + "." + c + ": Valor = " + d);
        if (fatura.getParcelas()[0].getDataPagamento() != null) {
            jLabelParcela1.setText("Parcela paga.");
            jaPago++;
        }
        jButtonPagar1.setText("Pagar Parcela  " + jaPago + 1);

        jLabelParcela2.setEnabled(false);
        jLabelDias2.setEnabled(false);
        jLabelParcela3.setEnabled(false);
        jLabelDias3.setEnabled(false);

        if (quantParcelas > 1) {
            jLabelParcela2.setEnabled(true);
            jLabelDias2.setEnabled(true);
            String a2 = Integer.toString(fatura.getParcelas()[1].getDataVencimento().getDayOfMonth());
            String b2 = Integer.toString(fatura.getParcelas()[1].getDataVencimento().getMonthValue());
            String c2 = Integer.toString(fatura.getParcelas()[1].getDataVencimento().getYear());
            String d2 =  numberFormat.format(fatura.getParcelas()[1].getValor());
            jLabelDias2.setText("Data de vencimento: " + a2 + "." + b2 + "." + c2 + ": Valor = " + d2);
            if (fatura.getParcelas()[1].getDataPagamento() != null) {
                jLabelParcela2.setText("Parcela paga.");
                jaPago++;
            }

            jButtonPagar1.setText("Pagar Parcela  " + jaPago + 1);
        }
        if (quantParcelas > 2) {
            jLabelParcela3.setEnabled(true);
            jLabelDias3.setEnabled(true);
            String a3 = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getDayOfMonth());
            String b3 = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getMonthValue());
            String c3 = Integer.toString(fatura.getParcelas()[2].getDataVencimento().getYear());
            String d3 =  numberFormat.format(fatura.getParcelas()[2].getValor());
            jLabelDias3.setText("Data de vencimento: " + a3 + "." + b3 + "." + c3 + ": Valor = " + d3);
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

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Mês");

        jLabel4.setText("Ano");

        jLabel6.setText("Data do Pagamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonVoltar)
                .addGap(128, 128, 128)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(178, 178, 178)
                .addComponent(jLabel19)
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelParcela1)
                .addGap(30, 30, 30)
                .addComponent(jLabelDias1))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelParcela2)
                .addGap(30, 30, 30)
                .addComponent(jLabelDias2))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelParcela3)
                .addGap(30, 30, 30)
                .addComponent(jLabelDias3))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonPagar1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonVoltar))
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParcela1)
                    .addComponent(jLabelDias1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParcela2)
                    .addComponent(jLabelDias2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParcela3)
                    .addComponent(jLabelDias3))
                .addGap(84, 84, 84)
                .addComponent(jButtonPagar1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        CrudFatura crud = new CrudFatura(dados);
        crud.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
                fatura.getParcelas()[jaPago].setDataPagamento(date);
                atualiza();

                JOptionPane.showConfirmDialog(null, "Gravou corretamente", "Sucesso",
                        JOptionPane.DEFAULT_OPTION);

            }

        } else {
            JOptionPane.showConfirmDialog(null, "Não tem parcela para pagar", "Erro",
                    JOptionPane.DEFAULT_OPTION);
        }

    }//GEN-LAST:event_jButtonPagar1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
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

        jLabelParcela2.setEnabled(false);
        jLabelDias2.setEnabled(false);
        jLabelParcela3.setEnabled(false);
        jLabelDias3.setEnabled(false);

        if (quantParcelas > 1) {
            jLabelParcela2.setEnabled(true);
            jLabelDias2.setEnabled(true);
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
            jLabelParcela3.setEnabled(true);
            jLabelDias3.setEnabled(true);
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
