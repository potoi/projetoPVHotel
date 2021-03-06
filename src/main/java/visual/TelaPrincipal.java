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
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Victor
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private Data dados;

    public TelaPrincipal() {
        this.dados = new Data();
    //    dadosExemplos();
        initComponents();

    }

    public TelaPrincipal(Data dados) {
        this.dados = dados;
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
        jMenuAddMunicipio = new javax.swing.JMenuItem();
        jMenuAddConta = new javax.swing.JMenuItem();
        jMenuAddProduto = new javax.swing.JMenuItem();
        jMenuAddServico = new javax.swing.JMenuItem();
        jMenuAddEquipamento = new javax.swing.JMenuItem();
        jMenuAddFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuTelaPrincipal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

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

        jMenuShowEndereco.setText("Endere??o");
        jMenuShowEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowEnderecoActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowEndereco);

        jMenuShowMunicipio.setText("Munic??pio");
        jMenuShowMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowMunicipioActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuShowMunicipio);

        jMenuShowVeiculo.setText("Ve??culo");
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

        jMenuShowServico.setText("Servi??o");
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

        jMenuAddMunicipio.setText("Munic??pio");
        jMenuAddMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddMunicipioActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddMunicipio);

        jMenuAddConta.setText("Conta");
        jMenuAddConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddContaActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddConta);

        jMenuAddProduto.setText("Produto");
        jMenuAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAddProdutoActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuAddProduto);

        jMenuAddServico.setText("Servi??o");
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
        jMenuTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTelaPrincipalActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuTelaPrincipal);

        jMenuBarPrincipal.add(jMenu2);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        setBounds(0, 0, 750, 444);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jMenuAddMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddMunicipioActionPerformed
        CrudAddMunicipio crud = new CrudAddMunicipio(dados);
        crud.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuAddMunicipioActionPerformed

    private void jMenuAddContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAddContaActionPerformed
        CrudAddConta crud = new CrudAddConta(dados);
        crud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuAddContaActionPerformed

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
        this.setVisible(false);
        this.dispose();
        CrudFatura crud = new CrudFatura(dados);
        
    
        crud.setVisible(true);
        
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

    private void jMenuTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTelaPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuTelaPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAddClientePF;
    private javax.swing.JMenuItem jMenuAddClientePj;
    private javax.swing.JMenuItem jMenuAddConta;
    private javax.swing.JMenuItem jMenuAddEquipamento;
    private javax.swing.JMenuItem jMenuAddFuncionario;
    private javax.swing.JMenuItem jMenuAddMunicipio;
    private javax.swing.JMenuItem jMenuAddProduto;
    private javax.swing.JMenuItem jMenuAddServico;
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
        Municipio testeMunicipio3 = new Municipio("nwwwwwwwwwwwwo", "rrrrrrrrrrrrrrrrrs", "Br??????????il");
        dados.arrayMuni.add(testeMunicipio3);

        Endereco testeEndereco = new Endereco("nomeLogradouro", "25", "Bairro Prado", testeMunicipio, "Ao lado da pra??a", "3597000");
        dados.arrayEnde.add(testeEndereco);
        Endereco testeEndereco2 = new Endereco("asdasdo", "25", "Bairro asd", testeMunicipio, "Ao lado da pra??a", "3597000");
        dados.arrayEnde.add(testeEndereco2);
        Endereco testeEnderec3o = new Endereco("noxxxxxdouro", "25", "Bairxxxxxxxxxxxo", testeMunicipio, "Ao lado da pra??a", "3597000");
        dados.arrayEnde.add(testeEnderec3o);

        Servico servico = new Servico(null, null, 12, "Pegar Comida", 100.0);
        dados.arrayItem.add(servico);
        Servico servico2 = new Servico(null, null, 13, "Pegar agua", 200.0);
        dados.arrayItem.add(servico2);

        Produto produto = new Produto("Sprite", null, 55, "Refrigerante", 130.0);
        Produto produto2 = new Produto("Coca", null, 56, "Refrigerante Coca", 120.0);
        dados.arrayItem.add(produto);
        dados.arrayItem.add(produto2);

        PessoaFisica pessoaf = new PessoaFisica("123123", 2, "Jose", testeEndereco, testeEndereco2, null, "312323", "2525", "111");
        PessoaFisica pessoaf2 = new PessoaFisica("123123", 2, "Jose", testeEndereco, testeEndereco2, null, "312323", "2525", "111");
        dados.arrayClie.add(pessoaf);
        
        LocalDate date2 = LocalDate.of(2020, 7, 20);
        LocalDate date3 = LocalDate.of(2021, 7, 20);
        Conta conta = new Conta(null,date2,null,15.0,pessoaf,12,1);
        Conta conta2 = new Conta(null,date3,date2,15.0,pessoaf,12,2);
        dados.ficharioConta.add(conta);
        dados.ficharioConta.add(conta2);

    }
}
