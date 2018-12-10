package fatec.poo.view;

import fatec.poo.control.DaoCurso;
import fatec.poo.model.Curso;
import fatec.poo.control.Conexao;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme Sernajoto
 * @author André Constancio
 */
public class GuiCurso extends javax.swing.JFrame {

    /**
     * Creates new form GuiCurso
     */
    public GuiCurso() {
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

        jLblSigla = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLblCargHor = new javax.swing.JLabel();
        jLblVal = new javax.swing.JLabel();
        jLblProg = new javax.swing.JLabel();
        jLblDataVig = new javax.swing.JLabel();
        jLblValHorInst = new javax.swing.JLabel();
        jTxtFSigla = new javax.swing.JTextField();
        jTxtFNome = new javax.swing.JTextField();
        jTxtFCargaHor = new javax.swing.JTextField();
        jTxtFVal = new javax.swing.JTextField();
        jTxtFProg = new javax.swing.JTextField();
        jFrmtdTxtFDataVig = new javax.swing.JFormattedTextField();
        jTxtFValHorInst = new javax.swing.JTextField();
        jBtnAlterar = new javax.swing.JButton();
        jBtnConsultar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jBtnInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Curso");
        setResizable(false);
        setSize(new java.awt.Dimension(650, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLblSigla.setText("Sigla curso");

        jLblNome.setText("Nome curso");

        jLblCargHor.setText("Carga horária");

        jLblVal.setText("Valor curso R$");

        jLblProg.setText("Programa do curso");

        jLblDataVig.setText("Data de vigência");

        jLblValHorInst.setText("Valor hora instutor R$");

        jTxtFNome.setEnabled(false);

        jTxtFCargaHor.setEnabled(false);

        jTxtFVal.setEnabled(false);

        jTxtFProg.setEnabled(false);

        try {
            jFrmtdTxtFDataVig.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFrmtdTxtFDataVig.setEnabled(false);

        jTxtFValHorInst.setEnabled(false);

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.setEnabled(false);
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        jBtnConsultar.setText("Consultar");
        jBtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.setEnabled(false);
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jBtnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        jBtnInserir.setText("Inserir");
        jBtnInserir.setEnabled(false);
        jBtnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblSigla, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblCargHor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblVal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblProg, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtFSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFCargaHor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFVal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFProg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblDataVig, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblValHorInst, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFrmtdTxtFDataVig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFValHorInst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblSigla)
                    .addComponent(jTxtFSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblNome)
                    .addComponent(jTxtFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblCargHor)
                    .addComponent(jTxtFCargaHor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblDataVig)
                    .addComponent(jFrmtdTxtFDataVig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblVal)
                    .addComponent(jTxtFVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLblProg)
                    .addComponent(jTxtFProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtFValHorInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLblValHorInst)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnConsultar)
                    .addComponent(jBtnInserir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarActionPerformed
        curso = null;
        curso = daoCurso.consultar(jTxtFSigla.getText());

        if (curso == null) {
            jBtnExcluir.setEnabled(false);
            jBtnInserir.setEnabled(true);
        } else {
            jTxtFNome.setText(curso.getNome());
            jTxtFCargaHor.setText(String.valueOf(curso.getCargaHoraria()));
            jTxtFVal.setText(String.valueOf(curso.getValor()));
            jTxtFProg.setText(curso.getPrograma());
            jFrmtdTxtFDataVig.setText(curso.getDataVigencia());
            jTxtFValHorInst.setText(String.valueOf(curso.getValorHoraInstrutor()));

            jBtnAlterar.setEnabled(true);
            jBtnExcluir.setEnabled(true);
        }
        jTxtFSigla.setEnabled(false);
        jTxtFNome.setEnabled(true);
        jTxtFCargaHor.setEnabled(true);
        jTxtFVal.setEnabled(true);
        jTxtFProg.setEnabled(true);
        jFrmtdTxtFDataVig.setEnabled(true);
        jTxtFValHorInst.setEnabled(true);
        jTxtFNome.requestFocus();

        jBtnConsultar.setEnabled(false);
    }//GEN-LAST:event_jBtnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("PrjFinal_POO", "150297");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoCurso = new DaoCurso(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void jBtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInserirActionPerformed
        curso = new Curso((jTxtFSigla.getText()), jTxtFNome.getText());
        curso.setCargaHoraria(Integer.parseInt(jTxtFCargaHor.getText()));
        curso.setDataVigencia(jFrmtdTxtFDataVig.getText());
        curso.setValor(Double.parseDouble(jTxtFVal.getText()));
        curso.setValorHoraInstrutor(Double.parseDouble(jTxtFValHorInst.getText()));
        curso.setPrograma(jTxtFProg.getText());

        daoCurso.inserir(curso);

        jBtnConsultar.setEnabled(true);
        jBtnInserir.setEnabled(false);

        jTxtFSigla.setText("");
        jTxtFNome.setText("");
        jTxtFCargaHor.setText("");
        jTxtFVal.setText("");
        jTxtFProg.setText("");
        jFrmtdTxtFDataVig.setText("");
        jTxtFValHorInst.setText("");

        jTxtFSigla.setEnabled(true);
        jTxtFNome.setEnabled(false);
        jTxtFCargaHor.setEnabled(false);
        jTxtFVal.setEnabled(false);
        jTxtFProg.setEnabled(false);
        jFrmtdTxtFDataVig.setEnabled(false);
        jTxtFValHorInst.setEnabled(false);
        jTxtFNome.requestFocus();
    }//GEN-LAST:event_jBtnInserirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            daoCurso.excluir(curso);

            jTxtFSigla.setText("");
            jTxtFNome.setText("");
            jTxtFCargaHor.setText("");
            jTxtFVal.setText("");
            jTxtFProg.setText("");
            jFrmtdTxtFDataVig.setText("");
            jTxtFValHorInst.setText("");

            jTxtFSigla.setEnabled(true);
            jTxtFNome.setEnabled(false);
            jTxtFCargaHor.setEnabled(false);
            jTxtFVal.setEnabled(false);
            jTxtFProg.setEnabled(false);
            jFrmtdTxtFDataVig.setEnabled(false);
            jTxtFValHorInst.setEnabled(false);

            jBtnConsultar.setEnabled(true);
            jBtnInserir.setEnabled(false);
            jBtnAlterar.setEnabled(false);
            jBtnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            curso.setNome(jTxtFNome.getText());
            curso.setCargaHoraria(Integer.parseInt(jTxtFCargaHor.getText()));
            curso.setDataVigencia(jFrmtdTxtFDataVig.getText());
            curso.setValor(Double.parseDouble(jTxtFVal.getText()));
            curso.setValorHoraInstrutor(Double.parseDouble(jTxtFValHorInst.getText()));
            curso.setPrograma(jTxtFProg.getText());

            daoCurso.alterar(curso);
        }

        jTxtFSigla.setText("");
        jTxtFNome.setText("");
        jTxtFCargaHor.setText("");
        jTxtFVal.setText("");
        jTxtFProg.setText("");
        jFrmtdTxtFDataVig.setText("");
        jTxtFValHorInst.setText("");

        jTxtFSigla.setEnabled(true);
        jTxtFNome.setEnabled(false);
        jTxtFCargaHor.setEnabled(false);
        jTxtFVal.setEnabled(false);
        jTxtFProg.setEnabled(false);
        jFrmtdTxtFDataVig.setEnabled(false);
        jTxtFValHorInst.setEnabled(false);

        jBtnConsultar.setEnabled(true);
        jBtnInserir.setEnabled(false);
        jBtnAlterar.setEnabled(false);
        jBtnExcluir.setEnabled(false);

    }//GEN-LAST:event_jBtnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnConsultar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnInserir;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JFormattedTextField jFrmtdTxtFDataVig;
    private javax.swing.JLabel jLblCargHor;
    private javax.swing.JLabel jLblDataVig;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblProg;
    private javax.swing.JLabel jLblSigla;
    private javax.swing.JLabel jLblVal;
    private javax.swing.JLabel jLblValHorInst;
    private javax.swing.JTextField jTxtFCargaHor;
    private javax.swing.JTextField jTxtFNome;
    private javax.swing.JTextField jTxtFProg;
    private javax.swing.JTextField jTxtFSigla;
    private javax.swing.JTextField jTxtFVal;
    private javax.swing.JTextField jTxtFValHorInst;
    // End of variables declaration//GEN-END:variables
    private DaoCurso daoCurso = null;
    private Curso curso = null;
    private Conexao conexao = null;

}
