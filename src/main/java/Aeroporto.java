public class Aeroporto {

    private String nome;
    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNomeEstado() {
        if (this.cidade == null) {
            return "Aeroporto sem cidade";
        }
        else {
            return this.cidade.getNomeEstado();
        }
    }

}
