package com.aulas.maven.compartilhado;

public class LoginController {

    public boolean validarUsuario(String usuario, String senha, DadosUsuario dados) throws SenhaIncorretaException, UsuarioIncorretoException{
        boolean retorno = false;
        if (dados.getUsuario().equals(usuario) && dados.getSenha().equals(senha)) {
            dados.assignarPermissoes();
            retorno = dados.usuarioPodeAcessar(usuario, senha);
        } else if (!dados.getSenha().equals(senha)) {
            throw new SenhaIncorretaException("Senha incorreta");
        } else if (!dados.getUsuario().equals(usuario)) {
            throw new UsuarioIncorretoException("Usuario incorreto");
        }
        return retorno;
    }

    public void metodoteste() {

    }



}
