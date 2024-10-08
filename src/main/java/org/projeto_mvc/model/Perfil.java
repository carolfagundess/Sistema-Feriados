/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.projeto_mvc.model;

/**
 *
 * @author carol
 */
public class Perfil {

    private Integer codPerfil;
    private String descricao;

    public Perfil() {

    }

    public Perfil(int codigo) {
        this.codPerfil = codigo;
    }

    public Perfil(int codigo, String perfil) {
        this.codPerfil = codigo;
        this.descricao = perfil;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codPerfil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
