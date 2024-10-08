/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import org.projeto_mvc.model.Perfil;
import org.projeto_mvc.model.Usuario;

/**
 *
 * @author Geison Quevedo
 */
public class UsuarioDAO {

    private Connection conn;

    public UsuarioDAO() {
        conn = FactoryConnector.getConection();
    }

    public Usuario login(Usuario usr) {
        PreparedStatement stmt = null;
        Usuario usrReturn = null;
        Perfil perfil;

        try {
            String sql = " SELECT usuario.*, "
                    + "           perfil.codigo as codigo_perfil, perfil.perfil as nome_perfil "
                    + "      FROM usuario left join perfil on usuario.perfil = perfil.codigo "
                    + "     WHERE login = ? "
                    + "       AND senha = ? ";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usr.getLogin());
            stmt.setString(2, usr.getSenha());

            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                perfil = new Perfil(res.getInt("codigo_perfil"), res.getString("nome_perfil"));

                usrReturn = new Usuario(res.getInt("codigo"),
                        res.getString("nome"),
                        res.getString("login"),
                        res.getString("senha"),
                        res.getString("email"),
                        perfil);
            }

            res.close();
            stmt.close();

            return usrReturn;

        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "-" + e.getMessage());
            return usrReturn;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean insert(Usuario usr) {
        PreparedStatement stmt = null;

        try {
            String sql = "INSERT INTO usuario (nome, login, senha, email, perfil) "
                    + "         VALUES (?,?,?,?,?)";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usr.getNome());
            stmt.setString(2, usr.getLogin());
            stmt.setString(3, usr.getSenha());
            stmt.setString(4, usr.getEmail());
            stmt.setInt(5, usr.getPerfil().getCodigo());

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
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean update(Usuario usr) {
        PreparedStatement stmt = null;

        try {
            String sql = "UPDATE usuario SET nome = ?, login = ?, senha = ?, email = ?, perfil = ? WHERE  codigo = ?  ";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usr.getNome());
            stmt.setString(2, usr.getLogin());
            stmt.setString(3, usr.getSenha());
            stmt.setString(4, usr.getEmail());
            stmt.setInt(5, usr.getPerfil().getCodigo());
            stmt.setInt(6, usr.getCodUsuario());

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
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean excluir(int codigo) {

        PreparedStatement stmt = null;

        try {

            String sql = "DELETE FROM usuario where codigo = ?";
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //retornar lista
    public ArrayList<Usuario> lista() {
        Statement stmt = null;
        ArrayList<Usuario> listaUsuario = new ArrayList<>();

        try {
            String sql = "SELECT usuario.*, perfil.codigo as codigo_perfil, perfil.perfil as nome_perfil FROM usuario left join perfil on usuario.perfil = perfil.codigo";

            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                Usuario usuario;
                Perfil perfil;

                perfil = new Perfil(res.getInt("codigo_perfil"), res.getString("nome_perfil"));

                usuario = new Usuario(res.getInt("codigo"),
                        res.getString("nome"),
                        res.getString("login"),
                        res.getString("senha"),
                        res.getString("email"),
                        perfil);

                listaUsuario.add(usuario);

            }

            res.close();
            stmt.close();

            return listaUsuario;
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "-" + e.getMessage());
            return listaUsuario;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
