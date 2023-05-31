package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Usuario usuario = new Usuario();
        usuario.setMilhasComprasSiteAssociado(1000);
        usuario.setMilhasCartaoCredito(2500);


        assertEquals(6500.0, usuario.calcularQuantidadeMilhas());
    }
}
