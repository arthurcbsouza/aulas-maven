package com.aulas.maven.compartilhado;

public class SenhaIncorretaException extends Exception {
    public SenhaIncorretaException(String errorMessage) {
        super(errorMessage);
    }
}
