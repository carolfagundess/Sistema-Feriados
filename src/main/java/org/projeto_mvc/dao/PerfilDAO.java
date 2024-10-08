/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.projeto_mvc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.projeto_mvc.factory.FactoryConnector;
import org.projeto_mvc.model.Perfil;

/**
 *
 * @author Geison Quevedo
 */
public class PerfilDAO {

    private Connection conn;

    public PerfilDAO() {
        conn = FactoryConnector.getConection();
    }

    public ArrayList<Perfil> lista() {
        Statement stmt = null;
        ArrayList<Perfil> listaPerfil = new ArrayList<>();

        try {
            String sql = " SELECT * FROM perfil";

            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                Perfil perfil;

                perfil = new Perfil(res.getInt("codigo"),
                        res.getString("perfil"));

                listaPerfil.add(perfil);

            }

            res.close();
            stmt.close();

            return listaPerfil;
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "-" + e.getMessage());
            return listaPerfil;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
