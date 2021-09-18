public class Funcionario extends Pessoa {

    private Companhia companhia;

    public Funcionario(String nome, String cpf, int idade, Companhia companhia) {
        super(nome, cpf, idade);
        this.companhia = companhia;
    }

    public Companhia getCompanhia() {
        return this.companhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }
}
