/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.projeto_mvc.view.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import org.projeto_mvc.factory.FactoryConnector;
import org.projeto_mvc.model.Feriado;
import org.projeto_mvc.model.TipoFeriado;

/**
 *
 * @author carol
 */
public class DiasUteis {

    private Connection conn;

    public DiasUteis() {
        conn = FactoryConnector.getConection();
    }

    public ArrayList<Feriado> obterFeriados(LocalDate dataInicio, LocalDate dataFim) throws SQLException {
        ArrayList<Feriado> listaFeriados = new ArrayList<>();
        String sql = "SELECT feriado.*, tipoferiado.codigo AS codigo_tipoferiado,  tipoferiado.tipo AS nome_tipoferiado FROM feriado LEFT JOIN tipoferiado ON feriado.tipo = tipoferiado.codigo WHERE dia BETWEEN ? AND ?"; // Correto

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Definindo os parâmetros
            stmt.setDate(1, java.sql.Date.valueOf(dataInicio)); // Data de início
            stmt.setDate(2, java.sql.Date.valueOf(dataFim)); // Data de fim

            ResultSet res = stmt.executeQuery(); // Executando a consulta

            while (res.next()) {
                TipoFeriado tpFeriado = new TipoFeriado(res.getInt("codigo_tipoferiado"), res.getString("nome_tipoferiado"));
                Feriado feriado = new Feriado(res.getInt("codigo"),
                        res.getDate("dia").toLocalDate(),
                        res.getString("descricao"),
                        tpFeriado
                );
                listaFeriados.add(feriado);
            }
            res.close(); // Fecha o ResultSet
        } catch (SQLException e) {
            System.out.println(e.getErrorCode() + " - " + e.getMessage());
            // Retorna a lista mesmo em caso de erro
        } finally {
            // Considere gerenciar o ciclo de vida da conexão de outra forma
            // conn.close(); // Comente isso se a conexão for gerenciada externamente
        }

        return listaFeriados;
    }

    //calcular dias uteis
    public long contarDiasUteisComFeriados(LocalDate dataInicial, LocalDate dataFinal, ArrayList<Feriado> feriados) {
        long totalDias = ChronoUnit.DAYS.between(dataInicial, dataFinal) + 1; // Inclui a data final
        long diasUteis = 0;

        for (long i = 0; i < totalDias; i++) {
            LocalDate dataAtual = dataInicial.plusDays(i);
            DayOfWeek diaDaSemana = dataAtual.getDayOfWeek();

            // Verifica se o dia é entre segunda e sexta-feira
            if (diaDaSemana != DayOfWeek.SATURDAY && diaDaSemana != DayOfWeek.SUNDAY) {
                // Verifica se o dia não é feriado
                boolean isFeriado = false;
                for (Feriado feriado : feriados) {
                    if (feriado.getData().isEqual(dataAtual)) {
                        isFeriado = true;
                        System.out.println("Feriado detectado: " + dataAtual);
                        break;
                    }
                }
                if (!isFeriado) {
                    diasUteis++;
                }
            }
        }

        return diasUteis;
    }
}
