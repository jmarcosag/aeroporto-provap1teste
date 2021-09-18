public class Pessoa {

    private String nome;
    private String cpf;
    private Integer idade;

    public Pessoa(String nome, String cpf, Integer idade) {
        if ((nome == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
        }
        else {
            if ((cpf == null) || (cpf.trim().equals(""))) {
                throw new NullPointerException("CPF é obrigatório");
            }
        }
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if ((nome == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if ((cpf == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("CPF é obrigatório");
        }
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
