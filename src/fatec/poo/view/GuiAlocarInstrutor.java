package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.control.DaoInstrutor;
import fatec.poo.control.DaoTurma;
import fatec.poo.model.Curso;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Turma;
import java.util.ArrayList;

/**
 *
 * @author Guilherme Sernajoto
 * @author Bárbara Sajo
 */
public class GuiAlocarInstrutor extends javax.swing.JFrame {

    /**
     * Creates new form GuiAlocarInstrutor
     */
    public GuiAlocarInstrutor() {
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

        jLabel1 = new javax.swing.JLabel();
        jCbBxCurso = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jCbBxTurma = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCbBxInstrutor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLblSituacao = new javax.swing.JLabel();
        jBtnAlocar = new javax.swing.JButton();
        jBtnLiberar = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alocar Instrutor");
        setPreferredSize(new java.awt.Dimension(650, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Curso");

        jCbBxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbBxCursoActionPerformed(evt);
            }
        });

        jLabel2.setText("Turma");

        jCbBxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbBxTurmaActionPerformed(evt);
            }
        });

        jLabel3.setText("Instrutor");

        jLabel4.setText("Situação");

        jLblSituacao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jBtnAlocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        jBtnAlocar.setText("Alocar");
        jBtnAlocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlocarActionPerformed(evt);
            }
        });

        jBtnLiberar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        jBtnLiberar.setText("Liberar");
        jBtnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLiberarActionPerformed(evt);
            }
        });

        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLblSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCbBxInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCbBxCurso, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCbBxTurma, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(jBtnAlocar)
                .addGap(18, 18, 18)
                .addComponent(jBtnLiberar)
                .addGap(18, 18, 18)
                .addComponent(jBtnSair)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCbBxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCbBxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCbBxInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLblSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAlocar)
                    .addComponent(jBtnLiberar)
                    .addComponent(jBtnSair))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("BD1711035", "BD1711035");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");

        daoTurma = new DaoTurma(conexao.conectar());
        daoCurso = new DaoCurso(conexao.conectar());
        daoInstrutor = new DaoInstrutor(conexao.conectar());

        instrutores = daoInstrutor.listarInstrutores();
        cursos = daoCurso.listarCursos();

        jBtnAlocar.setEnabled(false);
        jBtnLiberar.setEnabled(false);
        jLblSituacao.setText("");

        for (Instrutor i : instrutores) {
            jCbBxInstrutor.addItem(i.getNome());
        }

        for (Curso i : cursos) {
            jCbBxCurso.addItem(i.getSigla());
        }

    }//GEN-LAST:event_formWindowOpened

    private void jBtnAlocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlocarActionPerformed
        turma = turmas.get(jCbBxTurma.getSelectedIndex());
        instrutor = instrutores.get(jCbBxInstrutor.getSelectedIndex());

        jBtnAlocar.setEnabled(false);
        jBtnLiberar.setEnabled(true);
        jLblSituacao.setText("Alocado");
        instrutor.addTurma(turma);
        daoTurma.alterar(turma);
    }//GEN-LAST:event_jBtnAlocarActionPerformed

    private void jBtnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLiberarActionPerformed
        turma = turmas.get(jCbBxTurma.getSelectedIndex());
        instrutor = instrutores.get(jCbBxInstrutor.getSelectedIndex());

        jBtnAlocar.setEnabled(true);
        jBtnLiberar.setEnabled(false);
        jLblSituacao.setText("Liberado");

        instrutor.remTurma(turma);
        daoTurma.alterar(turma);
    }//GEN-LAST:event_jBtnLiberarActionPerformed

    private void jCbBxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbBxCursoActionPerformed
        jCbBxTurma.removeAllItems();
        turmas = daoTurma.listarTurmasCurso(jCbBxCurso.getSelectedItem().toString());
        for (Turma i : turmas) {
            jCbBxTurma.addItem(i.getSiglaTurma());
        }
    }//GEN-LAST:event_jCbBxCursoActionPerformed

    private void jCbBxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbBxTurmaActionPerformed
        if (jCbBxTurma.getSelectedIndex() != -1 && jCbBxInstrutor.getSelectedIndex() != -1) {
            turma = turmas.get(jCbBxTurma.getSelectedIndex());
            if (turma.getInstrutor() == null) {
                jBtnAlocar.setEnabled(true);
                jBtnLiberar.setEnabled(false);
                jLblSituacao.setText("");
            } else {
                jBtnAlocar.setEnabled(false);
                jBtnLiberar.setEnabled(true);
                jLblSituacao.setText("Alocado");
            }
        }
    }//GEN-LAST:event_jCbBxTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(GuiAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAlocarInstrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlocar;
    private javax.swing.JButton jBtnLiberar;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JComboBox<String> jCbBxCurso;
    private javax.swing.JComboBox<String> jCbBxInstrutor;
    private javax.swing.JComboBox<String> jCbBxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblSituacao;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao = null;
    private DaoCurso daoCurso = null;
    private DaoTurma daoTurma = null;
    private DaoInstrutor daoInstrutor = null;
    private Instrutor instrutor = null;
    private Turma turma = null;
    ArrayList<Instrutor> instrutores;
    ArrayList<Curso> cursos;
    ArrayList<Turma> turmas;
}