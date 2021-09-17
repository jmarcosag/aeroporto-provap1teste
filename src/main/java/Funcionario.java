public class Funcionario extends Pessoa {

    private Companhia companhia;

    public Funcionario(String nome, Companhia companhia) {
        super(nome);
        this.companhia = companhia;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }

    public String getNomeEstadoCurso() {
        return this.companhia.getNomeCompanhia();
    }
}
