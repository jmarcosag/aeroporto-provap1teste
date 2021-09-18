public class Passageiro extends Pessoa {

    private String voo;

    public Passageiro(String nome, String cpf, int idade, String voo) {
        super(nome, cpf, idade);
        if ((voo == null) || (voo.trim().equals(""))) {
            throw new NullPointerException("Voo é obrigatório");
        }
        this.voo = voo;
    }


    public String getVoo() {
        return voo;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }
}
