/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.projeto_mvc.model;

/**
 *
 * @author carol
 */
public class TipoFeriado {

    private Integer codTpFeriado;
    private String descricao;

    public TipoFeriado() {
    }

    public TipoFeriado(Integer codTpFeriado) {
        this.codTpFeriado = codTpFeriado;
    }

    public TipoFeriado(Integer codTpFeriado, String descricao) {
        this.codTpFeriado = codTpFeriado;
        this.descricao = descricao;
    }

    public int getCodTpFeriado() {
        return codTpFeriado;
    }

    public void setCodTpFeriado(Integer codTpFeriado) {
        this.codTpFeriado = codTpFeriado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TipoFeriado{" + "codTpFeriado=" + codTpFeriado + ", descricao=" + descricao + '}';
    }
}
