package com.aulas.maven.compartilhado;

public class DadosUsuario {

    private String nome;

    private int idade;

    private String usuario;

    private String senha;

    private boolean ativo;

    public void loadLogin() {
        this.usuario = "onlineobject";
        this.senha = "12345678";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int somar(int valorUm, int valorDois) {
        return valorUm + valorDois;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    protected void assignarPermissoes() {
        System.out.println("Permissoes assignadas com sucesso");
    }

    protected boolean usuarioPodeAcessar(String usuario, String senha) {
        return true;
    }
}
