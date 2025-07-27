package com.aulas.maven.compartilhado;

public class UsuarioIncorretoException extends Exception {
    public UsuarioIncorretoException(String errorMessage) {
        super(errorMessage);
    }
}
