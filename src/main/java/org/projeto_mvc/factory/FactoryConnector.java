package org.projeto_mvc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author carol
 */
public class FactoryConnector {
    //conectar com o banco de dados
    private static Connection conn = null;
    
        public static Connection getConection() {

        try { conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/feriados_jdbc", "root", "");
                return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
