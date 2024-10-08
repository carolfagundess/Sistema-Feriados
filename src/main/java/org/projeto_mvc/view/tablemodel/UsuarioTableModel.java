
package org.projeto_mvc.view.tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import org.projeto_mvc.model.Usuario;

/**
 *
 * @author Geison Quevedo
 */
public class UsuarioTableModel extends AbstractTableModel {

    private ArrayList<Usuario> listaUsuarios;

    // método construtor que recebe como parâmetro a lista de Bikes
    public UsuarioTableModel(ArrayList<Usuario> listausr) {
        this.listaUsuarios = listausr;
    }

    // sobrescrita do método que diz quantas LINHAS a tabela tem
    @Override
    public int getRowCount() {
        return listaUsuarios.size();
    }

    // sobrescrita do método que diz quantas COLUNAS a tabela tem
    @Override
    public int getColumnCount() {
        return 6;
    }

    // sobrescrita do método que retorna o valor de cada coluna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usr = listaUsuarios.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return usr.getCodUsuario();
            case 1:
                return usr.getNome();
            case 2:
                return usr.getLogin();
            case 3:
                return "***"; // senha
            case 4:
                return usr.getEmail();
            case 5:
                return usr.getPerfil().getDescricao();
            default:
                return "";
        }
    }

    // sobrescrita do método que retorna o nome de cada coluna
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Código";
            case 1:
                return "Nome";
            case 2:
                return "Login";
            case 3:
                return "Senha";
            case 4:
                return "E-mail";
            case 5:
                return "Perfil";
            default:
                return "NoName";
        }
    }

    public Usuario getUsuario(int row) {
        return listaUsuarios.get(row);
    }
}
