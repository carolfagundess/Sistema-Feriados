/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.projeto_mvc.app;

import java.sql.SQLException;
import java.time.LocalDate;
import org.projeto_mvc.dao.FeriadoDao;
import org.projeto_mvc.model.TipoFeriado;
import org.projeto_mvc.model.Usuario;
import org.projeto_mvc.view.FormLogin;

/**
 *
 * @author carol
 */
public class App {

    public static Usuario usuarioLogado = new Usuario();

    public static void main(String[] args) throws SQLException {
        FeriadoDao teste = new FeriadoDao();

        FormLogin frmLogin = new FormLogin();
        frmLogin.setVisible(true);
        System.out.println(teste.lista());
    }

    public App(int aInt, LocalDate toLocalDate, String string, TipoFeriado tpFeriado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
