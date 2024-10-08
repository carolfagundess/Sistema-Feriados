package org.projeto_mvc.view.tablemodel;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import org.projeto_mvc.model.Feriado;

/**
 *
 * @author carol
 */
public class FeriadoTableModel extends AbstractTableModel {

    private ArrayList<Feriado> listaFeriados;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public FeriadoTableModel(ArrayList<Feriado> lista) {
        this.listaFeriados = lista;
    }

    // sobrescrita do método que diz quantas LINHAS a tabela tem
    public int getRowCount() {
        return listaFeriados.size();
    }

    // sobrescrita do método que diz quantas COLUNAS a tabela tem
    public int getColumnCount() {
        return 4;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        Feriado feriado = listaFeriados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return feriado.getCodFeriado();
            case 1:
                return feriado.getData().format(DATE_FORMATTER);
            case 2:
                return feriado.getDescricao();
            case 3:
                return feriado.getTipoFeriado().getDescricao();
            default:
                return "";
        }
    }
    
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "Código";
            case 1:
                return "Data";
            case 2:
                return "Descrição";
            case 3:
                return "Tipo";
            default:
                throw new AssertionError();
        }
    }
    
    public Feriado getFeriado(int row){
        return listaFeriados.get(row);
    }

}
