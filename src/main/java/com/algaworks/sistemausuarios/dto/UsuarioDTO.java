package com.algaworks.sistemausuarios.dto;

public class UsuarioDTO {

    private Integer id;

    private String login;

    private String nome;

    public UsuarioDTO(Integer id, String login, String nome) {
        this.id = id;
        this.login = login;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioDTO that = (UsuarioDTO) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
