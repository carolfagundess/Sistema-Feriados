/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.projeto_mvc.view;

/**
 *
 * @author Geison Quevedo
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormUsuario
     */
    public FormPrincipal() {
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

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuTools = new javax.swing.JMenu();
        jMenuCalc = new javax.swing.JMenuItem();
        jMenuCalend = new javax.swing.JMenu();
        jMenuItemCad = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jdpPrincipal.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenu1.setText("Usuários");

        jMenuItem1.setText("Usuário Lista");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Usuário Cadastro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenuTools.setText("Ferramentas");

        jMenuCalc.setText("Calcular dias");
        jMenuCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCalcActionPerformed(evt);
            }
        });
        jMenuTools.add(jMenuCalc);

        jMenuBar1.add(jMenuTools);

        jMenuCalend.setText("Calendário");

        jMenuItemCad.setText("Cadastrar Feriado");
        jMenuItemCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadActionPerformed(evt);
            }
        });
        jMenuCalend.add(jMenuItemCad);

        jMenuBar1.add(jMenuCalend);

        jMenu4.setText("Sair");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jdpPrincipal)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        IFrameUsuarioLista ifUsuarioLista = new IFrameUsuarioLista();
        jdpPrincipal.add(ifUsuarioLista);
        ifUsuarioLista.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        IFrameUsuarioCadastro ifUsuarioCadastro = new IFrameUsuarioCadastro(null);
        jdpPrincipal.add(ifUsuarioCadastro);
        ifUsuarioCadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadActionPerformed
        IFrameFeriadoCadastro ifFeriadoCadastro = new IFrameFeriadoCadastro(null);
        jdpPrincipal.add(ifFeriadoCadastro);
        ifFeriadoCadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadActionPerformed

    private void jMenuCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCalcActionPerformed
        IFrameCalcularDias ifDiasCalcular = new IFrameCalcularDias();
        jdpPrincipal.add(ifDiasCalcular);
        ifDiasCalcular.setVisible(true);
    }//GEN-LAST:event_jMenuCalcActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCalc;
    private javax.swing.JMenu jMenuCalend;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCad;
    private javax.swing.JMenu jMenuTools;
    private javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables
}
