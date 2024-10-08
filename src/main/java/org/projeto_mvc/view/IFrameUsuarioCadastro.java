
package org.projeto_mvc.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.projeto_mvc.dao.PerfilDAO;
import org.projeto_mvc.dao.UsuarioDAO;
import org.projeto_mvc.model.Perfil;
import org.projeto_mvc.model.Usuario;
import org.projeto_mvc.view.util.ComboboxPerfil;

/**
 *
 * @author Geison Quevedo
 */
public class IFrameUsuarioCadastro extends javax.swing.JInternalFrame {

    private int codigo;

    /**
     * Creates new form IFrameUsuarioCadastro
     *
     * @param usuario
     */
    public IFrameUsuarioCadastro(Usuario usuario) {
        initComponents();
        populaFormulario(usuario);

    }

    private void montaComboboxPerfil(int codPerfil) {
        ArrayList<Perfil> perfilLista = new ArrayList<>();
        PerfilDAO perfilDao = new PerfilDAO();
        perfilLista = perfilDao.lista();

        ComboboxPerfil.preencheComboBoxPerfil(codPerfil, cmbPerfil, perfilLista, false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        cmbPerfil = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Cadastro de Usuário");

        jLabel1.setText("Nome");

        jLabel2.setText("Login");

        jLabel3.setText("Senha");

        jLabel4.setText("E-mail");

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel5.setText("Perfil");

        jLabel6.setText("Código");

        txtCodigo.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        txtCodigo.setEnabled(false);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome)
                    .addComponent(txtLogin)
                    .addComponent(txtSenha)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        boolean retornoDb = false;

        if (validaForm()) {

            Usuario usuario = new Usuario();
            usuario.setNome(txtNome.getText());
            usuario.setLogin(txtLogin.getText());
            usuario.setSenha(txtSenha.getText());
            usuario.setEmail(txtEmail.getText());
            usuario.setPerfil(new Perfil(ComboboxPerfil.getSelectedIndex(cmbPerfil)));

            UsuarioDAO usuarioDao = new UsuarioDAO();

            if (!txtCodigo.getText().equals("")) {
                usuario.setCodUsuario(Integer.valueOf(txtCodigo.getText()));
                retornoDb = usuarioDao.update(usuario);
            } else {
                retornoDb = usuarioDao.insert(usuario);
            }

            if (retornoDb) {
                limpaCampos();
                JOptionPane.showMessageDialog(this,
                        "Usuário salvo com sucesso!",
                        this.getTitle(),
                        JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Erro ao salvar usuário!",
                        this.getTitle(),
                        JOptionPane.ERROR_MESSAGE);

            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private boolean validaForm() {
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Preencha o campo Nome!",
                    this.getTitle(),
                    JOptionPane.ERROR_MESSAGE);
            txtNome.requestFocus();
            return false;
        }

        if (txtLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Preencha o campo Login!",
                    this.getTitle(),
                    JOptionPane.ERROR_MESSAGE);
            txtLogin.requestFocus();
            return false;
        }

        if (txtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Preencha o campo Senha!",
                    this.getTitle(),
                    JOptionPane.ERROR_MESSAGE);
            txtSenha.requestFocus();
            return false;
        }

        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Preencha o campo E-mail!",
                    this.getTitle(),
                    JOptionPane.ERROR_MESSAGE);
            txtEmail.requestFocus();
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtLogin.setText("");
        txtSenha.setText("");
        txtEmail.setText("");
        //perfil
        txtNome.requestFocus();
    }

    private void populaFormulario(Usuario usuario) {
        if (usuario == null) { // cadastro NOVO
            txtCodigo.setText("");
            montaComboboxPerfil(-1);
        } else {
            txtCodigo.setText(String.valueOf(usuario.getCodUsuario()));
            txtNome.setText(usuario.getNome());
            txtLogin.setText(usuario.getLogin());
            txtSenha.setText(usuario.getSenha());
            txtEmail.setText(usuario.getEmail());
            System.out.println("ssss" + usuario.getPerfil());
            
            montaComboboxPerfil(usuario.getPerfil().getCodigo());

        }
    }
}
