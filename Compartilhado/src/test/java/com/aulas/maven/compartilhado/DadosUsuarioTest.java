package com.aulas.maven.compartilhado;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DadosUsuarioTest {

    @Test
    public void somar_testEquals() {
        DadosUsuario dados = new DadosUsuario();
        int resultado = dados.somar(10, 15);

        assertEquals(resultado, 25);
    }

    @Test
    public void somar_testNotEquals() {
        DadosUsuario dados = new DadosUsuario();
        int resultado = dados.somar(10, 10);

        assertNotEquals(resultado, 25);
    }

    @Test
    public void somar_testIdade() {
        DadosUsuario dados = new DadosUsuario();
        dados.setIdade(22);
        assertEquals(dados.getIdade(), 22);
    }

    @Test
    public void somar_testNome() {
        DadosUsuario dados = new DadosUsuario();
        dados.setNome("Arthur");
        assertEquals(dados.getNome(), "Arthur");
    }
}
