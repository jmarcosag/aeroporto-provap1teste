import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanhiaTest {

    @Test
    void deveValidarNome() {
        Companhia companhia = new Companhia("bababa");

        assertEquals("bababa", companhia.getNomeCompanhia());
    }

    @Test
    void deveMudarNomeCompanhia() {
        Companhia companhia = new Companhia("bababa");
        companhia.setNomeCompanhia("tatata");

        assertEquals("tatata", companhia.getNomeCompanhia());
    }

}