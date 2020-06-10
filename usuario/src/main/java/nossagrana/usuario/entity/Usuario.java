package nossagrana.usuario.entity;

import nossagrana.usuario.dto.UsuarioDTO;
import org.springframework.data.annotation.Id;

import java.time.ZonedDateTime;

public class Usuario {


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    private String id;
    private String nome;
    private String email;
    private String senha;

    public ZonedDateTime getDataDesativacao() {
        return dataDesativacao;
    }

    public void setDataDesativacao(ZonedDateTime dataDesativacao) {
        this.dataDesativacao = dataDesativacao;
    }

    private ZonedDateTime dataDesativacao;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    private boolean ativo;

    public Usuario() {

    }

    public Usuario(String nome, String email, String senha, ZonedDateTime dataDesativacao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataDesativacao = dataDesativacao;
    }

    public Usuario(UsuarioDTO usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
    }
}
