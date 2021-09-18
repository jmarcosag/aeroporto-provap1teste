import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AviaoTest {


    @Test
    void deveValidarModelo() {
        Aviao aviao = new Aviao("Mark25");

        assertEquals("Mark25", aviao.getModelo());
    }

    @Test
    void deveRetonarExcecaoModeloNuloConstrutor() {
        try {
            Aviao aviao = new Aviao(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Modelo é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoModeloVazioConstrutor() {
        try {
            Aviao aviao = new Aviao("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Modelo é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveMudarModeloAviao() {
        Aviao aviao = new Aviao("Mark25");
        aviao.setModelo("Mk67");

        assertEquals("Mk67", aviao.getModelo());
    }

    @Test
    void deveRetornarExcecaoSetModeloNulo() {
        try {
            Aviao aviao = new Aviao("Mark25");
            aviao.setModelo(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Modelo é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomeVazio() {
        try {
            Aviao aviao = new Aviao("Mark25");
            aviao.setModelo("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Modelo é obrigatório", e.getMessage());
        }
    }
}