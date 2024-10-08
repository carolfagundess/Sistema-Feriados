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
import org.projeto_mvc.model.TipoFeriado;

/**
 *
 * @author carol
 */
public class TipoFeriadoDao {

    private Connection conn;

    public TipoFeriadoDao() {
        conn = FactoryConnector.getConection();

    }

    public ArrayList<TipoFeriado> lista() {
        Statement stmt = null;
        ArrayList<TipoFeriado> listaTipoFeriado = new ArrayList<>();

        try {
            String sql = "SELECT * FROM tipoferiado";
            
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            
            while (res.next()) {
                TipoFeriado tpFeriado = new TipoFeriado(res.getInt("codigo"), res.getString("tipo"));
                listaTipoFeriado.add(tpFeriado);

            }
            res.close();
            stmt.close();
            
            return listaTipoFeriado;
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + "-" + e.getMessage());
            return listaTipoFeriado;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TipoFeriadoDao.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

}
