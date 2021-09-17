public class Passageiro extends Pessoa {

    private String voo;

    public Passageiro(String nome,String voo) {
        super(nome);
        if ((voo == null) || (voo.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
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
