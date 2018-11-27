/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.control.DaoTurma;
import fatec.poo.model.Curso;
import fatec.poo.model.Turma;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme Sernajoto
 * @author Bárbara Sajo
 */
public class GuiTurma extends javax.swing.JFrame {

    /**
     * Creates new form GuiTurma
     */
    public GuiTurma() {
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

        jLblSiglaTurma = new javax.swing.JLabel();
        jTxtFSiglaTur = new javax.swing.JTextField();
        jLblNome = new javax.swing.JLabel();
        jTxtFDesc = new javax.swing.JTextField();
        jLblQtdeVagas = new javax.swing.JLabel();
        jLblCurso = new javax.swing.JLabel();
        jCbBxCurso = new javax.swing.JComboBox<>();
        jTxtFQtdeVagas = new javax.swing.JTextField();
        jLblPeriodo = new javax.swing.JLabel();
        jCbBxPeriodo = new javax.swing.JComboBox<>();
        jLblDataInicio = new javax.swing.JLabel();
        jLblDataTermino = new javax.swing.JLabel();
        jFrmtdTxtFDataInicio = new javax.swing.JFormattedTextField();
        jFrmtdTxtFDataTermino = new javax.swing.JFormattedTextField();
        jBtnInserir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnConsultar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastar Turma");
        setPreferredSize(new java.awt.Dimension(650, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLblSiglaTurma.setText("Sigla da Turma");

        jLblNome.setText("Descrição");

        jTxtFDesc.setEnabled(false);

        jLblQtdeVagas.setText("Qtde Vagas");

        jLblCurso.setText("Curso");

        jCbBxCurso.setEnabled(false);

        jTxtFQtdeVagas.setEnabled(false);

        jLblPeriodo.setText("Período");

        jCbBxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite", "Integral" }));
        jCbBxPeriodo.setEnabled(false);

        jLblDataInicio.setText("Data início");

        jLblDataTermino.setText("Data término");

        try {
            jFrmtdTxtFDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFrmtdTxtFDataInicio.setText("  /  /    ");
        jFrmtdTxtFDataInicio.setEnabled(false);

        try {
            jFrmtdTxtFDataTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFrmtdTxtFDataTermino.setText("  /  /    ");
        jFrmtdTxtFDataTermino.setEnabled(false);
        jFrmtdTxtFDataTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrmtdTxtFDataTerminoActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblDataInicio)
                    .addComponent(jLblQtdeVagas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLblSiglaTurma)
                        .addComponent(jLblCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLblNome, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCbBxCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtFSiglaTur)
                        .addComponent(jTxtFDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFrmtdTxtFDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLblDataTermino))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTxtFQtdeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(jLblPeriodo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCbBxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFrmtdTxtFDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCurso)
                    .addComponent(jCbBxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSiglaTurma)
                    .addComponent(jTxtFSiglaTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNome)
                    .addComponent(jTxtFDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblQtdeVagas)
                    .addComponent(jTxtFQtdeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblPeriodo)
                    .addComponent(jCbBxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblDataInicio)
                    .addComponent(jLblDataTermino)
                    .addComponent(jFrmtdTxtFDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFrmtdTxtFDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnConsultar)
                    .addComponent(jBtnInserir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnSair))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Cadastrar Turma");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarActionPerformed
        turma = null;
        turma = daoTurma.consultar(jTxtFSiglaTur.getText());
        
        if (turma == null){
            jTxtFSiglaTur.setEnabled(false);
            jCbBxCurso.setEnabled(true);
            jTxtFDesc.setEnabled(true);
            jTxtFDesc.requestFocus();
            jTxtFQtdeVagas.setEnabled(true);
            jCbBxPeriodo.setEnabled(true);
            jFrmtdTxtFDataInicio.setEnabled(true);
            jFrmtdTxtFDataTermino.setEnabled(true);
            
            jBtnConsultar.setEnabled(false);
            jBtnInserir.setEnabled(true);
            jBtnAlterar.setEnabled(false);
            jBtnExcluir.setEnabled(false);
        }else{
            jCbBxCurso.setSelectedItem(turma.getCurso().getSigla());
            jTxtFDesc.setText(turma.getDescricao());
            jTxtFQtdeVagas.setText(Integer.toString(turma.getQtdeVagas()));
            jCbBxPeriodo.setSelectedItem(turma.getPeriodo());
            jFrmtdTxtFDataInicio.setText(turma.getDataInicio());
            jFrmtdTxtFDataTermino.setText(turma.getDataTermino());
            
            jTxtFSiglaTur.setEnabled(false);
            jCbBxCurso.setEnabled(true);
            jTxtFDesc.setEnabled(true);
            jTxtFDesc.requestFocus();
            jTxtFQtdeVagas.setEnabled(true);
            jCbBxPeriodo.setEnabled(true);
            jFrmtdTxtFDataInicio.setEnabled(true);
            jFrmtdTxtFDataTermino.setEnabled(true);
            
            jBtnConsultar.setEnabled(false);
            jBtnInserir.setEnabled(false);
            jBtnAlterar.setEnabled(true);
            jBtnExcluir.setEnabled(true); 
        }
    }//GEN-LAST:event_jBtnConsultarActionPerformed

    private void jBtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInserirActionPerformed
        daoCurso = new DaoCurso(conexao.conectar());
        turma = new Turma(jTxtFSiglaTur.getText(), jTxtFDesc.getText());
        turma.setCurso(daoCurso.consultar(jCbBxCurso.getSelectedItem().toString()));
        turma.setQtdeVagas(Integer.parseInt(jTxtFQtdeVagas.getText()));
        turma.setPeriodo(jCbBxPeriodo.getSelectedItem().toString());
        turma.setDataInicio(jFrmtdTxtFDataInicio.getText());
        turma.setDataTermino(jFrmtdTxtFDataTermino.getText());
        
        daoTurma.inserir(turma);
        //jCbBxCurso.setSelectedIndex(0);
        jTxtFSiglaTur.setText("");
        jTxtFDesc.setText("");
        jTxtFQtdeVagas.setText("");
        //jCbBxPeriodo.setSelectedIndex(0);
        jFrmtdTxtFDataInicio.setText("");
        jFrmtdTxtFDataTermino.setText("");
        
        jTxtFSiglaTur.setEnabled(true);
        jCbBxCurso.setEnabled(false);
        jTxtFDesc.setEnabled(false);
        jTxtFQtdeVagas.setEnabled(false);
        jCbBxPeriodo.setEnabled(false);
        jFrmtdTxtFDataInicio.setEnabled(false);
        jFrmtdTxtFDataTermino.setEnabled(false);
        jTxtFSiglaTur.requestFocus();
        
        jBtnConsultar.setEnabled(true);
        jBtnInserir.setEnabled(false);
    }//GEN-LAST:event_jBtnInserirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("poo", "batata123");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoTurma = new DaoTurma(conexao.conectar());
        daoCurso = new DaoCurso(conexao.conectar());
        ArrayList<String> siglas = daoCurso.listarSiglas();
        
        for(String i: siglas){
            jCbBxCurso.addItem(i);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0){
            daoCurso = new DaoCurso(conexao.conectar());
            turma.setDescricao(jTxtFDesc.getText());
            turma.setCurso(daoCurso.consultar(jCbBxCurso.getSelectedItem().toString()));
            turma.setQtdeVagas(Integer.parseInt(jTxtFQtdeVagas.getText()));
            turma.setPeriodo(jCbBxPeriodo.getSelectedItem().toString());
            turma.setDataInicio(jFrmtdTxtFDataInicio.getText());
            turma.setDataInicio(jFrmtdTxtFDataTermino.getText());
           
           daoTurma.alterar(turma);
        }
        //jCbBxCurso.setSelectedIndex(0);
        jTxtFSiglaTur.setText("");
        jTxtFDesc.setText("");
        jTxtFQtdeVagas.setText("");
        //jCbBxPeriodo.setSelectedIndex(0);
        jFrmtdTxtFDataInicio.setText("");
        jFrmtdTxtFDataTermino.setText("");
        
        jTxtFSiglaTur.setEnabled(true);
        jCbBxCurso.setEnabled(false);
        jTxtFDesc.setEnabled(false);
        jTxtFQtdeVagas.setEnabled(false);
        jCbBxPeriodo.setEnabled(false);
        jFrmtdTxtFDataInicio.setEnabled(false);
        jFrmtdTxtFDataTermino.setEnabled(false);
        jTxtFSiglaTur.requestFocus();
        
        jBtnConsultar.setEnabled(true);
        jBtnInserir.setEnabled(false);
        jBtnAlterar.setEnabled(false);
        jBtnExcluir.setEnabled(false);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclsão?") == 0){
            daoTurma.excluir(turma); 
            //jCbBxCurso.setSelectedIndex(0);
            jTxtFSiglaTur.setText("");
            jTxtFDesc.setText("");
            jTxtFQtdeVagas.setText("");
            //jCbBxPeriodo.setSelectedIndex(0);
            jFrmtdTxtFDataInicio.setText("");
            jFrmtdTxtFDataTermino.setText("");

            jTxtFSiglaTur.setEnabled(true);
            jCbBxCurso.setEnabled(false);
            jTxtFDesc.setEnabled(false);
            jTxtFQtdeVagas.setEnabled(false);
            jCbBxPeriodo.setEnabled(false);
            jFrmtdTxtFDataInicio.setEnabled(false);
            jFrmtdTxtFDataTermino.setEnabled(false);
            jTxtFSiglaTur.requestFocus();

            jBtnConsultar.setEnabled(true);
            jBtnInserir.setEnabled(false);
            jBtnAlterar.setEnabled(false);
            jBtnExcluir.setEnabled(false);
        } 
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jFrmtdTxtFDataTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrmtdTxtFDataTerminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrmtdTxtFDataTerminoActionPerformed

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
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnConsultar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnInserir;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JComboBox<String> jCbBxCurso;
    private javax.swing.JComboBox<String> jCbBxPeriodo;
    private javax.swing.JFormattedTextField jFrmtdTxtFDataInicio;
    private javax.swing.JFormattedTextField jFrmtdTxtFDataTermino;
    private javax.swing.JLabel jLblCurso;
    private javax.swing.JLabel jLblDataInicio;
    private javax.swing.JLabel jLblDataTermino;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblPeriodo;
    private javax.swing.JLabel jLblQtdeVagas;
    private javax.swing.JLabel jLblSiglaTurma;
    private javax.swing.JTextField jTxtFDesc;
    private javax.swing.JTextField jTxtFQtdeVagas;
    private javax.swing.JTextField jTxtFSiglaTur;
    // End of variables declaration//GEN-END:variables
    private DaoTurma daoTurma = null;
    private Turma turma = null; 
    private Conexao conexao = null;
    private DaoCurso daoCurso = null;
}
