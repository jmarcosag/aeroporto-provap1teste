import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassageiroTest {


    @Test
    void deveValidarNome() {
        Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");

        assertEquals("Marcos", passageiro.getNome());
    }

    @Test
    void deveValidarCpf() {
        Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");

        assertEquals("1111", passageiro.getCpf());
    }

    @Test
    void deveValidarIdade() {
        Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");

        assertEquals(21, passageiro.getIdade());
    }

    @Test
    void deveValidarVoo() {
        Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");

        assertEquals("ABC-123", passageiro.getVoo());
    }



    @Test
    void deveRetonarExcecaoNomeNuloConstrutor() {
        try {
            Passageiro passageiro = new Passageiro(null,"1111",21, "ABC-123");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoCpfNuloConstrutor() {
        try {
            Passageiro passageiro = new Passageiro("Marcos",null,21, "ABC-123");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoVooNuloConstrutor() {
        try {
            Passageiro passageiro = new Passageiro("Marcos","1111",21, null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Voo é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoNomeVazioConstrutor() {
        try {
            Passageiro passageiro = new Passageiro("","1111",21, "ABC-123");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoCpfVazioConstrutor() {
        try {
            Passageiro passageiro = new Passageiro("Marcos","",21, "ABC-123");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoVooVazioConstrutor() {
        try {
            Passageiro passageiro = new Passageiro("Marcos","1111",21, "");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Voo é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveMudarNomePassageiro() {
        Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");
        passageiro.setNome("Gomes");

        assertEquals("Gomes", passageiro.getNome());
    }

    @Test
    void deveMudarCpfPassageiro() {
        Passageiro passageiro = new Passageiro("Marcos","2222",21, "ABC-123");
        passageiro.setCpf("11111");

        assertEquals("11111", passageiro.getCpf());
    }

    @Test
    void deveMudarIdadePassageiro() {
        Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");
        passageiro.setIdade(30);

        assertEquals(30, passageiro.getIdade());
    }

    @Test
    void deveRetornarExcecaoSetNomeNulo() {
        try {
            Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");
            passageiro.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomeVazio() {
        try {
            Passageiro passageiro = new Passageiro("","1111",21, "ABC-123");
            passageiro.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetCpfNulo() {
        try {
            Passageiro passageiro = new Passageiro("Marcos","1111",21, "ABC-123");
            passageiro.setCpf(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }


}