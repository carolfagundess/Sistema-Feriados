package org.projeto_mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.projeto_mvc.factory.FactoryConnector;
import org.projeto_mvc.model.Feriado;
import org.projeto_mvc.model.TipoFeriado;

/**
 *
 * @author carol
 */
public class FeriadoDao {

    private Connection conn;

    public FeriadoDao() {
        conn = FactoryConnector.getConection();
    }

    //metodo novo registro no banco
    public boolean insert(Feriado feriado) {
        PreparedStatement stmt = null;
        java.sql.Date datesql = java.sql.Date.valueOf(feriado.getData());
        System.out.println("DATA:" + datesql);
        try {
            String sql = "INSERT INTO feriado (dia, descricao, tipo) "
                    + "         VALUES (?,?,?)";

            stmt = conn.prepareStatement(sql);
            stmt.setDate(1, datesql);
            stmt.setString(2, feriado.getDescricao());
            stmt.setInt(3, feriado.getTipoFeriado().getCodTpFeriado());
            stmt.executeUpdate();
            System.out.println("Entrou no bloco");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "-" + e.getMessage());
            return false;
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FeriadoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //metodo para update de feriado
    public boolean updateFeriado(Feriado feriado) {
        PreparedStatement stmt = null;

        java.sql.Date date = java.sql.Date.valueOf(feriado.getData());

        try {
            String sql = "UPDATE feriado SET dia = ?, descricao = ?, tipo = ? WHERE  codigo = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setDate(1, (java.sql.Date) date);
            stmt.setString(2, feriado.getDescricao());
            stmt.setInt(3, feriado.getTipoFeriado().getCodTpFeriado());
            stmt.setInt(4, feriado.getCodFeriado());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "-" + e.getMessage());
            return false;
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FeriadoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //metodo para excluir do banco de dados
    public boolean excluirFeriado(int codigo) {
        PreparedStatement stmt = null;
        try {
            String sql = "DELETE FROM feriado where codigo = ?";
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FeriadoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FeriadoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //retorna lista de Feriados//retornou deu certo// jogar dentro de um Jtable agora
    public ArrayList<Feriado> lista() {
        Statement stmt = null;
        ArrayList<Feriado> listaFeriados = new ArrayList<>();

        try {
            String sql = "SELECT feriado.*, tipoferiado.codigo as codigo_tipoferiado, tipoferiado.tipo as nome_tipoferiado from feriado left join tipoferiado on feriado.tipo = tipoferiado.codigo;";

            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                TipoFeriado tpFeriado = new TipoFeriado(res.getInt("codigo_tipoferiado"),
                        res.getString("nome_tipoferiado"));
                Feriado feriado = new Feriado(res.getInt("codigo"),
                        res.getDate("dia").toLocalDate(),
                        res.getString("descricao"),
                        tpFeriado);

                listaFeriados.add(feriado);

            }

            res.close();
            stmt.close();

            return listaFeriados;
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "-" + e.getMessage());
            return listaFeriados;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FeriadoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
