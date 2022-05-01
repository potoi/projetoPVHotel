/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;

import model.*;
import fichario.*;
import java.util.ArrayList;
import static util.Utilidades.*;
import dados.Data;
import static java.awt.Color.RED;

/**
 *
 * @author Victor
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Data dados = new Data();

    public TelaPrincipal() {
        dadosExemplos();
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     *
     *
     *
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        setBounds(0, 0, 750, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuShowClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowClienteActionPerformed
        CrudCliente crud = new CrudCliente(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuShowClienteActionPerformed

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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables

    private void dadosExemplos() {

        Veiculo testeVeiculo = new Veiculo("a", "Victor", RED, "teste", "teste");
        dados.arrayVeic.add(testeVeiculo);
        dados.arrayVeic.add(testeVeiculo);
        dados.arrayVeic.add(testeVeiculo);

        Municipio testeMunicipio = new Municipio("nomeMunicipio", "Minas Gerais", "Brasil");
        dados.arrayMuni.add(testeMunicipio);
        Municipio testeMunicipio2 = new Municipio("asdasdo", "axxxxxx", "cccccccccccc");
        dados.arrayMuni.add(testeMunicipio2);
        Municipio testeMunicipio3 = new Municipio("nwwwwwwwwwwwwo", "rrrrrrrrrrrrrrrrrs", "Brçççççil");
        dados.arrayMuni.add(testeMunicipio3);

        Endereco testeEndereco = new Endereco("nomeLogradouro", "25", "Bairro Prado", testeMunicipio, "Ao lado da praça", "3597000");
        dados.arrayEnde.add(testeEndereco);
        Endereco testeEndereco2 = new Endereco("asdasdo", "25", "Bairro asd", testeMunicipio, "Ao lado da praça", "3597000");
        dados.arrayEnde.add(testeEndereco2);
        Endereco testeEnderec3o = new Endereco("noxxxxxdouro", "25", "Bairxxxxxxxxxxxo", testeMunicipio, "Ao lado da praça", "3597000");
        dados.arrayEnde.add(testeEnderec3o);

        Servico servico = new Servico(null, null, 12, "Pegar Comida", 100.0);
        dados.arrayItem.add(servico);
        Servico servico2 = new Servico(null, null, 13, "Pegar agua", 200.0);
        dados.arrayItem.add(servico2);
        
        Produto produto = new Produto("Sprite",null,55,"Refrigerante",130.0);
        Produto produto2 = new Produto("Coca",null,56,"Refrigerante Coca",120.0);
        dados.arrayItem.add(produto);
        dados.arrayItem.add(produto2);
        
        PessoaFisica pessoaf= new PessoaFisica("123123",2,"Jose",testeEndereco,testeEndereco2,null,"312323","2525","111");
        dados.arrayClie.add(pessoaf);

    }
}
