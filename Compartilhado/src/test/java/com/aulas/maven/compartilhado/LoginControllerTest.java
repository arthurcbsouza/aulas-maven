package com.aulas.maven.compartilhado;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class LoginControllerTest {

    LoginController loginController;

    /**
     * Executa antes de iniciar a suite de testes
     */
    @BeforeAll
    static void setUpClass() {

    }

    /**
     * Executa antes de cada teste
     */
    @BeforeEach
    void setUp() {
        loginController = new LoginController();
    }

    @Test
    public void validarUsuario_testSucess() throws SenhaIncorretaException, UsuarioIncorretoException {
        DadosUsuario dadosUsuario = mock(DadosUsuario.class);

        when(dadosUsuario.getUsuario()).thenReturn("usuario");
        when(dadosUsuario.getSenha()).thenReturn("senha");

        // Metodo com parametros
        when(dadosUsuario.usuarioPodeAcessar(anyString(), anyString())).thenReturn(true);

        boolean resultado = loginController.validarUsuario("usuario", "senha", dadosUsuario);

        assertTrue(resultado);
    }

    @Test
    public void validarUsuario_testSucessAssignedPermissions() throws SenhaIncorretaException, UsuarioIncorretoException {
        DadosUsuario dadosUsuario = mock(DadosUsuario.class);

        when(dadosUsuario.getUsuario()).thenReturn("usuario");
        when(dadosUsuario.getSenha()).thenReturn("senha");

        loginController.validarUsuario("usuario", "senha", dadosUsuario);

        // Verifica se passou no metodo "assignarPermissoes"
        verify(dadosUsuario).assignarPermissoes();

        // Verifica se passou um detemrinado numero de vezes "times" no metodo "assignarPermissoes"
        verify(dadosUsuario, times(1)).assignarPermissoes();
    }

    @Test
    public void validarUsuario_testErroSenha() throws SenhaIncorretaException, UsuarioIncorretoException {
        DadosUsuario dadosUsuario = mock(DadosUsuario.class);

        when(dadosUsuario.getUsuario()).thenReturn("usuario");
        when(dadosUsuario.getSenha()).thenReturn("senhaIcorreta");

        assertThrows(SenhaIncorretaException.class, () -> {
            loginController.validarUsuario("usuario", "senha", dadosUsuario);
        });
    }

    @Test
    public void validarUsuario_testErroUsuario() throws SenhaIncorretaException, UsuarioIncorretoException {
        LoginController loginController = new LoginController();

        DadosUsuario dadosUsuario = mock(DadosUsuario.class);

        when(dadosUsuario.getUsuario()).thenReturn("usuarioIncorreto");
        when(dadosUsuario.getSenha()).thenReturn("senha");

        assertThrows(UsuarioIncorretoException.class, () -> {
            loginController.validarUsuario("usuario", "senha", dadosUsuario);
        });
    }
}