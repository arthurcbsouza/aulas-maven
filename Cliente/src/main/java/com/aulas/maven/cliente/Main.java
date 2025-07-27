package com.aulas.maven.cliente;

import com.aulas.maven.compartilhado.DadosUsuario;
import com.aulas.maven.compartilhado.LoginController;
import com.aulas.maven.compartilhado.SenhaIncorretaException;
import com.aulas.maven.compartilhado.UsuarioIncorretoException;

public class Main {

    public static void main(String[] args) throws SenhaIncorretaException, UsuarioIncorretoException {
        DadosUsuario dados = new DadosUsuario();
        dados.setUsuario("onlineobject");
        dados.setSenha("12345678");

        LoginController loginValidator = new LoginController();
        if ( loginValidator.validarUsuario("onlineobject", "12345678", dados) ) {
            System.out.println("Senha correta");
        }
    }

}
