package fatec.poo.view;

/**
 *
 * @author Andre Constancio
 * @author Guilherme Sernajoto
 */
public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public GuiMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(650, 450);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuIteCadas = new javax.swing.JMenu();
        jMenuIteCurso = new javax.swing.JMenuItem();
        jMenuIteTurma = new javax.swing.JMenuItem();
        jMenuIteIntrutor = new javax.swing.JMenuItem();
        jMenuIteAluno = new javax.swing.JMenuItem();
        jSeparatorCadastro = new javax.swing.JPopupMenu.Separator();
        jMenuIteSair = new javax.swing.JMenuItem();
        jMenuTitOperacoes = new javax.swing.JMenu();
        jMenuIteAlocInstrutor = new javax.swing.JMenuItem();
        jMenuIteEfetMatricula = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho POO");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jMenuIteCadas.setText("Cadastro");

        jMenuIteCurso.setText("Curso");
        jMenuIteCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIteCursoActionPerformed(evt);
            }
        });
        jMenuIteCadas.add(jMenuIteCurso);

        jMenuIteTurma.setText("Turma");
        jMenuIteTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIteTurmaActionPerformed(evt);
            }
        });
        jMenuIteCadas.add(jMenuIteTurma);

        jMenuIteIntrutor.setText("Instrutor");
        jMenuIteIntrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIteIntrutorActionPerformed(evt);
            }
        });
        jMenuIteCadas.add(jMenuIteIntrutor);

        jMenuIteAluno.setText("Aluno");
        jMenuIteAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIteAlunoActionPerformed(evt);
            }
        });
        jMenuIteCadas.add(jMenuIteAluno);
        jMenuIteCadas.add(jSeparatorCadastro);

        jMenuIteSair.setText("Sair");
        jMenuIteSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIteSairActionPerformed(evt);
            }
        });
        jMenuIteCadas.add(jMenuIteSair);

        jMenuBar1.add(jMenuIteCadas);

        jMenuTitOperacoes.setText("Operações");

        jMenuIteAlocInstrutor.setText("Alocar Instrutor");
        jMenuIteAlocInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIteAlocInstrutorActionPerformed(evt);
            }
        });
        jMenuTitOperacoes.add(jMenuIteAlocInstrutor);

        jMenuIteEfetMatricula.setText("Efetuar Matrícula");
        jMenuIteEfetMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIteEfetMatriculaActionPerformed(evt);
            }
        });
        jMenuTitOperacoes.add(jMenuIteEfetMatricula);

        jMenuBar1.add(jMenuTitOperacoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuIteEfetMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIteEfetMatriculaActionPerformed

    }//GEN-LAST:event_jMenuIteEfetMatriculaActionPerformed

    private void jMenuIteSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIteSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuIteSairActionPerformed

    private void jMenuIteCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIteCursoActionPerformed
        GuiCurso guiCurso = new GuiCurso();
        guiCurso.setSize(650, 450);
        guiCurso.setLocationRelativeTo(null);
        guiCurso.setVisible(true);
    }//GEN-LAST:event_jMenuIteCursoActionPerformed

    private void jMenuIteIntrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIteIntrutorActionPerformed
        GuiInstrutor guiInstrutor = new GuiInstrutor();
        guiInstrutor.setSize(650, 450);
        guiInstrutor.setLocationRelativeTo(null);
        guiInstrutor.setVisible(true);
    }//GEN-LAST:event_jMenuIteIntrutorActionPerformed

    private void jMenuIteTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIteTurmaActionPerformed
        GuiTurma guiTurma = new GuiTurma();
        guiTurma.setSize(650, 450);
        guiTurma.setLocationRelativeTo(null);
        guiTurma.setVisible(true);
    }//GEN-LAST:event_jMenuIteTurmaActionPerformed

    private void jMenuIteAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIteAlunoActionPerformed
        GuiAluno guiAluno = new GuiAluno();
        guiAluno.setSize(650, 450);
        guiAluno.setLocationRelativeTo(null);
        guiAluno.setVisible(true);
    }//GEN-LAST:event_jMenuIteAlunoActionPerformed

    private void jMenuIteAlocInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIteAlocInstrutorActionPerformed

    }//GEN-LAST:event_jMenuIteAlocInstrutorActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuIteAlocInstrutor;
    private javax.swing.JMenuItem jMenuIteAluno;
    private javax.swing.JMenu jMenuIteCadas;
    private javax.swing.JMenuItem jMenuIteCurso;
    private javax.swing.JMenuItem jMenuIteEfetMatricula;
    private javax.swing.JMenuItem jMenuIteIntrutor;
    private javax.swing.JMenuItem jMenuIteSair;
    private javax.swing.JMenuItem jMenuIteTurma;
    private javax.swing.JMenu jMenuTitOperacoes;
    private javax.swing.JPopupMenu.Separator jSeparatorCadastro;
    // End of variables declaration//GEN-END:variables
}
