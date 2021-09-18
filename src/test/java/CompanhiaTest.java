import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanhiaTest {

    @Test
    void deveValidarNome() {
        Pessoa pessoa = new Pessoa("Angelo", "11122233312", 21);

        assertEquals("Angelo", pessoa.getNome());
    }

    @Test
    void deveValidarCpf() {
        Pessoa pessoa = new Pessoa("Angelo", "11122233312", 21);

        assertEquals("11122233312", pessoa.getCpf());
    }

    @Test
    void deveValidarIdade() {
        Pessoa pessoa = new Pessoa("Angelo", "11122233312", 21);

        assertEquals(21, pessoa.getIdade());
    }



    @Test
    void deveRetonarExcecaoNomeNuloConstrutor() {
        try {
            Pessoa pessoa = new Pessoa(null, "1111111", 20);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoCpfNuloConstrutor() {
        try {
            Pessoa pessoa = new Pessoa("Joao", null, 20);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoNomeVazioConstrutor() {
        try {
            Pessoa pessoa = new Pessoa("","11111",null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoCpfVazioConstrutor() {
        try {
            Pessoa pessoa = new Pessoa("Marcos","",null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveMudarNomePessoa() {
        Pessoa pessoa = new Pessoa("Angelo","22222",20);
        pessoa.setNome("Gomes");

        assertEquals("Gomes", pessoa.getNome());
    }

    @Test
    void deveMudarCpfPessoa() {
        Pessoa pessoa = new Pessoa("Angelo","22222",20);
        pessoa.setCpf("11111");

        assertEquals("11111", pessoa.getCpf());
    }

    @Test
    void deveMudarIdadePessoa() {
        Pessoa pessoa = new Pessoa("Angelo","22222",20);
        pessoa.setIdade(30);

        assertEquals(30, pessoa.getIdade());
    }

    @Test
    void deveRetonarExcecaoSetNomeNulo() {
        try {
            Pessoa pessoa = new Pessoa("Angelo","22222",20);
            pessoa.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoSetNomeVazio() {
        try {
            Pessoa pessoa = new Pessoa("Angelo","22222",20);
            pessoa.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

}