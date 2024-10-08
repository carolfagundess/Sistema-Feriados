package org.projeto_mvc.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.projeto_mvc.dao.FeriadoDao;
import org.projeto_mvc.dao.TipoFeriadoDao;
import org.projeto_mvc.model.Feriado;
import org.projeto_mvc.model.TipoFeriado;
import org.projeto_mvc.view.tablemodel.FeriadoTableModel;
import org.projeto_mvc.view.util.ComboBoxTipoFeriado;

/**
 *
 * @author carol
 */
public class IFrameFeriadoCadastro extends javax.swing.JInternalFrame {

    private int codigo;
    private FeriadoTableModel feriadoModel;

    /**
     * Creates new form IFramaFeriadoCadastro
     *
     * @param feriado
     */
    public IFrameFeriadoCadastro(Feriado feriado) {
        initComponents();
        atualizaTabela();
        setClosable(true);
        preencheFormulario(feriado);
    }

    //montaComboBox PERFIL
    private void criarCMBtpFeriado(int codTPferiado) {
        ArrayList<TipoFeriado> tpFeriadoLista = new ArrayList<>();
        TipoFeriadoDao tpFeriadoDao = new TipoFeriadoDao();
        tpFeriadoLista = tpFeriadoDao.lista();

        ComboBoxTipoFeriado.preencheCBtipoFeriado(codTPferiado, cmbTipo, tpFeriadoLista, false);
    }

    private void atualizaTabela() {
        FeriadoDao feriadoDao = new FeriadoDao();
        ArrayList<Feriado> listaFeriado = feriadoDao.lista();

        feriadoModel = new FeriadoTableModel(listaFeriado);
        jTableFeriados.setModel(feriadoModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFcad = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jFormatData = new javax.swing.JFormattedTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        jPanelTabela = new javax.swing.JPanel();
        jSPaneFeriados = new javax.swing.JScrollPane();
        jTableFeriados = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Cadastro de Feriados");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelFcad.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFcad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelFcad.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFcad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Data");

        txtDescricao.setBackground(new java.awt.Color(255, 255, 255));
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descrição");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo");

        cmbTipo.setBackground(new java.awt.Color(255, 255, 255));
        cmbTipo.setForeground(new java.awt.Color(0, 0, 0));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(0, 69, 0));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(153, 51, 0));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jFormatData.setBackground(new java.awt.Color(255, 255, 255));
        jFormatData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormatData.setToolTipText("Data");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Código");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFcadLayout = new javax.swing.GroupLayout(jPanelFcad);
        jPanelFcad.setLayout(jPanelFcadLayout);
        jPanelFcadLayout.setHorizontalGroup(
            jPanelFcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFcadLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanelFcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanelFcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFcadLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormatData, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelFcadLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar)))
                .addGap(258, 258, 258))
        );
        jPanelFcadLayout.setVerticalGroup(
            jPanelFcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFcadLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanelFcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormatData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanelFcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar))
                .addGap(21, 21, 21))
        );

        jPanelTabela.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Feriados Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelTabela.setForeground(new java.awt.Color(0, 0, 0));
        jPanelTabela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jTableFeriados.setBackground(new java.awt.Color(227, 227, 227));
        jTableFeriados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTableFeriados.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableFeriados.setCellSelectionEnabled(true);
        jTableFeriados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFeriadosMouseClicked(evt);
            }
        });
        jSPaneFeriados.setViewportView(jTableFeriados);

        javax.swing.GroupLayout jPanelTabelaLayout = new javax.swing.GroupLayout(jPanelTabela);
        jPanelTabela.setLayout(jPanelTabelaLayout);
        jPanelTabelaLayout.setHorizontalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPaneFeriados)
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jSPaneFeriados, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFcad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 778, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean retornoDB = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if (validarFomr()) {
            Feriado feriado = new Feriado();
            feriado.setData(LocalDate.parse(jFormatData.getText(), formatter));
            feriado.setDescricao(txtDescricao.getText());
            System.out.println(ComboBoxTipoFeriado.getSelectIndex(cmbTipo));
            feriado.setTipoFeriado(new TipoFeriado(ComboBoxTipoFeriado.getSelectIndex(cmbTipo)));

            FeriadoDao feriadoDao = new FeriadoDao();
            
            //testa se for um update ou insert
            if (!txtCodigo.getText().equals("")) {
                feriado.setCodFeriado(Integer.parseInt(txtCodigo.getText()));
                retornoDB = feriadoDao.updateFeriado(feriado);
            } else {
                retornoDB = feriadoDao.insert(feriado);
            }

            if (retornoDB) {
                limparCampos();
                JOptionPane.showMessageDialog(this, "Feriado Salvo com Sucesso", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar feriado!", this.getTitle(), JOptionPane.ERROR_MESSAGE);
            }
        }
        atualizaTabela();
        limparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (jTableFeriados.getSelectedRow() >= 0) {
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este registro?", this.getTitle(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                Feriado feriado = feriadoModel.getFeriado(jTableFeriados.getSelectedRow());
                if (feriado != null) {
                    FeriadoDao feriadoDao = new FeriadoDao();
                    feriadoDao.excluirFeriado(feriado.getCodFeriado());
                    atualizaTabela();
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        limparCampos();
        atualizaTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jTableFeriadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFeriadosMouseClicked
        if (evt.getClickCount() == 2 && jTableFeriados.getSelectedColumn() != -1) {
            int selectedRow = jTableFeriados.getSelectedRow();

            Feriado feriadoSelected = feriadoModel.getFeriado(selectedRow);
            txtCodigo.setText(String.valueOf(feriadoSelected.getCodFeriado()));
            txtDescricao.setText(String.valueOf(feriadoSelected.getDescricao()));
            jFormatData.setText(feriadoSelected.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            criarCMBtpFeriado(feriadoSelected.getTipoFeriado().getCodTpFeriado());
        }
    }//GEN-LAST:event_jTableFeriadosMouseClicked

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
            java.util.logging.Logger.getLogger(IFrameFeriadoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IFrameFeriadoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IFrameFeriadoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IFrameFeriadoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IFrameFeriadoCadastro(null).setVisible(true);
        });
    }

    //validar o formulario
    private boolean validarFomr() {
        if (jFormatData.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preenche o campo Data!", this.getTitle(), JOptionPane.ERROR_MESSAGE);
            jFormatData.requestFocus();
            return false;
        }
        if (txtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo descrição!", this.getTitle(), JOptionPane.ERROR_MESSAGE);
            txtDescricao.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JFormattedTextField jFormatData;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelFcad;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JScrollPane jSPaneFeriados;
    private javax.swing.JTable jTableFeriados;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        txtCodigo.setText("");
        jFormatData.setText("");
        txtDescricao.setText("");
        cmbTipo.setSelectedIndex(-1);
        jFormatData.requestFocus();
    }

    private void preencheFormulario(Feriado feriado) {
        if (feriado == null) {
            txtCodigo.setText("");
            criarCMBtpFeriado(-1);
        } else {
            //pega infos pra editar
            txtCodigo.setText(String.valueOf(feriado.getCodFeriado()));
            jFormatData.setText(String.valueOf(feriado.getData()));
            txtDescricao.setText(feriado.getDescricao());
            System.out.println("SSS" + feriado.getTipoFeriado());

            criarCMBtpFeriado(feriado.getTipoFeriado().getCodTpFeriado());
        }
    }
}
