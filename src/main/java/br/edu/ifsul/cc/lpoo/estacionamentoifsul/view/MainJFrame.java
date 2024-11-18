
package br.edu.ifsul.cc.lpoo.estacionamentoifsul.view;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        miPessoa = new javax.swing.JMenuItem();
        miVeiculo = new javax.swing.JMenuItem();
        menuMovimentacoes = new javax.swing.JMenu();
        miEntradaVeiculo = new javax.swing.JMenuItem();
        miSaidaVeiculo = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastro.setText("Cadastro");

        miPessoa.setText("Pessoa");
        miPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPessoaActionPerformed(evt);
            }
        });
        menuCadastro.add(miPessoa);

        miVeiculo.setText("Veículo");
        miVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVeiculoActionPerformed(evt);
            }
        });
        menuCadastro.add(miVeiculo);

        jMenuBar1.add(menuCadastro);

        menuMovimentacoes.setText("Movimentações");

        miEntradaVeiculo.setText("Entrada");
        menuMovimentacoes.add(miEntradaVeiculo);

        miSaidaVeiculo.setText("Saída");
        menuMovimentacoes.add(miSaidaVeiculo);

        jMenuBar1.add(menuMovimentacoes);

        menuAjuda.setText("Ajuda");

        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(miSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miVeiculoActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        TelaSobre telaSobre = new TelaSobre(this, rootPaneCheckingEnabled);
        telaSobre.setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPessoaActionPerformed
        TelaPessoa telaPessoa = new TelaPessoa();
        telaPessoa.setVisible(true);
    }//GEN-LAST:event_miPessoaActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuMovimentacoes;
    private javax.swing.JMenuItem miEntradaVeiculo;
    private javax.swing.JMenuItem miPessoa;
    private javax.swing.JMenuItem miSaidaVeiculo;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miVeiculo;
    // End of variables declaration//GEN-END:variables
}
