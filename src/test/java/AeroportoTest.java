import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AeroportoTest {

    @Test
    void deveRetornarNomeEstado() {
        Cidade cidade = new Cidade("Rio de Janeiro", new Estado("RJ"));
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.setCidade(cidade);

        assertEquals("RJ", aeroporto.getNomeEstado());
    }

    @Test
    void deveRetornarSemCidade() {
        Aeroporto aeroporto = new Aeroporto();

        assertEquals("Aeroporto sem cidade", aeroporto.getNomeEstado());
    }
}