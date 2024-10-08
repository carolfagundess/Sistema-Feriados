
package org.projeto_mvc.model;

/**
 *
 * @author carol
 */
public class Usuario {
    private Integer codUsuario;
    private String nome;
    private String login;
    private String senha;
    private String email;
    //FK para retornar o tipo de perfil
    private Perfil perfil;

    public Usuario() {
    }

    public Usuario(Integer codUsuario, String nome, String login, String senha, String email, Perfil perfil) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.perfil = perfil;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    
    
}
