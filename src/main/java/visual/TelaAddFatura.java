/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package visual;

import dados.Data;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Conta;
import model.Fatura;
import model.Item;
import model.Parcela;
import model.Servico;

/**
 *
 * @author Victor
 */
public class TelaAddFatura extends javax.swing.JDialog {

    /**
     * Creates new form TelaAddServicos
     */
    int indexPagamento;
    private boolean feito = false;
    private int qntParcela = 1;
    private Conta conta;
    Data dados;

    public TelaAddFatura(java.awt.Frame parent, boolean modal, Data dados, Conta conta) {
        super(parent, modal);
        this.conta = conta;
        this.dados= dados;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelN = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton2.setText("<<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de Pagamento");

        jLabelN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelN.setText("1");

        jLabel4.setText("Quantidade de Parcela");

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Escolher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Gravar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelN)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton5)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelN)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(65, 65, 65))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (qntParcela < 3) {
            qntParcela++;
            jLabelN.setText(Integer.toString(qntParcela));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (qntParcela > 1) {
            qntParcela--;
            jLabelN.setText(Integer.toString(qntParcela));
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String[] possibilidades = {"Dinheiro", "Cartão de Crédito", "Cartão de débito", "Pix"};
        Fatura fatura = new Fatura();
        fatura.getTipopagamento();
        JComboBox cb = new JComboBox(possibilidades);
        int input;
        input = JOptionPane.showConfirmDialog(this, cb,
                "Selecione o método de pagamento", JOptionPane.DEFAULT_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            String str = (String) cb.getSelectedItem();
            indexPagamento = cb.getSelectedIndex();
            jLabel2.setText(str);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try{
        Fatura fatura = new Fatura();
        ArrayList<Parcela> arrayParcela= new ArrayList<>();
        fatura.setQtdParcelas(qntParcela);
        fatura.setTipopagamento(indexPagamento);
        fatura.setConta(conta);
        
        
            int i, j;
            double juros, valorParcela;
            switch (indexPagamento) {
                case 0 ->
                    juros = 0.02;
                case 1 ->
                    juros = 0.06;
                case 2 ->
                    juros = 0.04;
                case 3 ->
                    juros = 0.02;
                default ->
                    juros = 0;

            }
            for (i = 0; i < qntParcela; i++) {
                Parcela parcela = new Parcela();
                parcela.setIdentificador(ERROR);
                LocalDate sl = conta.getDataFechamento();
                sl.plusDays(15);
                parcela.setDataVencimento(sl);
                valorParcela = conta.getTotal() / 3;

                for (j = i; j > 0; j--) {
                    valorParcela *= juros;
                }
                parcela.setValor(valorParcela);
                arrayParcela.add(parcela);
                
            }
            
            dados.arrayParc.addAll(arrayParcela);
            dados.arrayFatu.add(fatura);
            feito=true;
            this.dispose();

    
            
       }catch(Exception e){
                JOptionPane.showConfirmDialog(null, "Não gravou corretamente", "Ok",
                    JOptionPane.DEFAULT_OPTION);
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    boolean showDialog() {
        setVisible(true);
        return feito;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelN;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
