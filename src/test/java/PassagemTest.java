import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassagemTest {


    @Test
    void deveValidarOrigem() {
        Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");
        Aviao aviao = new Aviao("Mark25");
        Passagem passagem = new Passagem("123123","RJ","SP",passageiro,aviao);
        assertEquals("RJ", passagem.getOrigem());
    }

    @Test
    void deveValidarDestino() {
        Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");
        Aviao aviao = new Aviao("Mark25");
        Passagem passagem = new Passagem("123123","RJ","SP",passageiro,aviao);
        assertEquals("SP", passagem.getDestino());
    }

    @Test
    void deveValidarCodigo() {
        Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");
        Aviao aviao = new Aviao("Mark25");
        Passagem passagem = new Passagem("123123","RJ","SP",passageiro,aviao);
        assertEquals("123123", passagem.getCodigo());
    }
}