/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.projeto_mvc.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.projeto_mvc.dao.UsuarioDAO;
import org.projeto_mvc.model.Usuario;
import org.projeto_mvc.view.tablemodel.UsuarioTableModel;

/**
 *
 * @author Geison Quevedo
 */
public class IFrameUsuarioLista extends javax.swing.JInternalFrame {

    private UsuarioTableModel usuarioModel;

    //ajustado
    private void atualizaTabela() {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        ArrayList<Usuario> listaUsuario = usuarioDao.lista();

        usuarioModel = new UsuarioTableModel(listaUsuario);
        jtblUsuario.setModel(usuarioModel);
    }

    /**
     * Creates new form IFrameUsuarioLista
     */
    public IFrameUsuarioLista() {
        initComponents();
        atualizaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblUsuario = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JToggleButton();

        setClosable(true);
        setTitle("Usuário Lista");

        jtblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblUsuario);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //NAO CRIEI 
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizaTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (jtblUsuario.getSelectedRow() >= 0) {
            if (JOptionPane.showConfirmDialog(this,
                    "Deseja realmente exluir o registro?",
                    this.getTitle(),
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {

                Usuario usuario = usuarioModel.getUsuario(jtblUsuario.getSelectedRow());
                if (usuario != null) {
                    UsuarioDAO usuarioDao = new UsuarioDAO();
                    usuarioDao.excluir(usuario.getCodUsuario());
                    atualizaTabela();
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        IFrameUsuarioCadastro ifUsuarioCadastro = new IFrameUsuarioCadastro(null);
        getParent().add(ifUsuarioCadastro);
        ifUsuarioCadastro.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jtblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblUsuarioMouseClicked
        Usuario usuario = usuarioModel.getUsuario(jtblUsuario.getSelectedRow());
        //frmCadastroMarca frmcadrac = new frmCadastroMarca(rc);

        //frmcadrac.setModal(true);
        // frmcadrac.setVisible(true);
        IFrameUsuarioCadastro ifUsuarioCadastro = new IFrameUsuarioCadastro(usuario);
        getParent().add(ifUsuarioCadastro);
        ifUsuarioCadastro.setVisible(true);

    }//GEN-LAST:event_jtblUsuarioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JToggleButton btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblUsuario;
    // End of variables declaration//GEN-END:variables
}