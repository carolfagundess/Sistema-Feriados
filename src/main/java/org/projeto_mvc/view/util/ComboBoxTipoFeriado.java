/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.projeto_mvc.view.util;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import org.projeto_mvc.model.TipoFeriado;

/**
 *
 * @author carol
 */
public class ComboBoxTipoFeriado {
        
    private String value;
    private int key;
    
    public ComboBoxTipoFeriado(int key, String value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public int getKey() {
        return key;
    }    
    
    //deve retornar a chave primaria da opcao selecionada pelo usuario
    public static int getSelectIndex(JComboBox combo){
        Object obj = combo.getSelectedItem();
        if(obj == null){
            return -1;
        }else{
            return ((ComboBoxTipoFeriado)obj).getKey();
        }
    }
    
    //metodo para preencher o combobox com 
    public static void preencheCBtipoFeriado(int selCodigo, JComboBox combo, ArrayList<TipoFeriado> lista, Boolean addTodos){
        Vector vLista = new Vector();
        int x = 0;
        int selecionarCodigo = -1;
        
        if (addTodos) {
            vLista.add(new ComboBoxTipoFeriado(0, "Todas"));
        }
        
        for(TipoFeriado tpFeriado : lista){
            ComboBoxTipoFeriado cmb = new ComboBoxTipoFeriado(tpFeriado.getCodTpFeriado(), tpFeriado.getDescricao());
            vLista.add(cmb);
            if (cmb.getKey() == selCodigo) {
                selecionarCodigo = x;
            }
            x++;
        }
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(vLista);
        combo.setModel(modelo);
        if (selecionarCodigo >= 0) {
            combo.setSelectedIndex(selecionarCodigo);
        }
    }
}
