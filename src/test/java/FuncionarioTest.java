import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveValidarNome() {
        Funcionario funcionario = new Funcionario("Marcos","1111",21, null);

        assertEquals("Marcos", funcionario.getNome());
    }

    @Test
    void deveValidarCpf() {
        Funcionario funcionario = new Funcionario("Marcos","1111",21, null);

        assertEquals("1111", funcionario.getCpf());
    }

    @Test
    void deveValidarIdade() {
        Funcionario funcionario = new Funcionario("Marcos","1111",21, null);

        assertEquals(21, funcionario.getIdade());
    }

    @Test
    void deveAlterarCompanhia() {
        Companhia companhia = new Companhia("aaa");
        Funcionario funcionario = new Funcionario("Marcos","1111",21, companhia);
        companhia.setNomeCompanhia("bbb");

        assertEquals("bbb", funcionario.getCompanhia());
    }

    @Test
    void deveValidarCompanhia() {
        Companhia companhia = new Companhia("aaa");
        Funcionario funcionario = new Funcionario("Marcos","1111",21, companhia);

        assertEquals("aaa", funcionario.getCompanhia());
    }

    @Test
    void deveRetonarExcecaoNomeNuloConstrutor() {
        try {
            Funcionario funcionario = new Funcionario(null,"1111",21, null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoCpfNuloConstrutor() {
        try {
            Funcionario funcionario = new Funcionario("Marcos",null,21, null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoNomeVazioConstrutor() {
        try {
            Funcionario funcionario = new Funcionario("","1111",21, null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoCpfVazioConstrutor() {
        try {
            Funcionario funcionario = new Funcionario("Marcos","",21, null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveMudarNomePessoa() {
        Funcionario funcionario = new Funcionario("Marcos","11111",21, null);
        funcionario.setNome("Gomes");

        assertEquals("Gomes", funcionario.getNome());
    }

    @Test
    void deveMudarCpfPessoa() {
        Funcionario funcionario = new Funcionario("Marcos","11111",21, null);
        funcionario.setCpf("11111");

        assertEquals("11111", funcionario.getCpf());
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