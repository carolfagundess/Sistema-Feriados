/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.projeto_mvc.model;

import java.time.LocalDate;
/**
 *
 * @author carol
 */
public class Feriado {
    private int codFeriado;
    private LocalDate data;
    private String descricao;
    //FK que retorna o tipo do feriado
    private TipoFeriado tipoFeriado;

    public Feriado() {
    }

    //implementar com usuario depois
    public Feriado(LocalDate data, String descricao, TipoFeriado tipoFeriado) {
        this.data = data;
        this.descricao = descricao;
        this.tipoFeriado = tipoFeriado;
    }

    public Feriado(int codFeriado, LocalDate data, String descricao, TipoFeriado tipoFeriado) {
        this.codFeriado = codFeriado;
        this.data = data;
        this.descricao = descricao;
        this.tipoFeriado = tipoFeriado;
    }
    
    public int getCodFeriado() {
        return codFeriado;
    }

    public void setCodFeriado(int codFeriado) {
        this.codFeriado = codFeriado;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoFeriado getTipoFeriado() {
        return tipoFeriado;
    }

    public void setTipoFeriado(TipoFeriado tipoFeriado) {
        this.tipoFeriado = tipoFeriado;
    }

    @Override
    public String toString() {
        return "Feriados{" + "codFeriado=" + codFeriado + ", data=" + data + ", descricao=" + descricao + ", tipoFeriado=" + tipoFeriado + '}';
    }
}
