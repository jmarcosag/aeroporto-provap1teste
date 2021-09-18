public class Passagem {

    private String codigo;
    private String origem;
    private String destino;

    private Passageiro passageiro;
    private Aviao aviao;

    public Passagem(Passageiro passageiro, Aviao aviao) {
        if ((passageiro == null) || (passageiro.equals(""))) {
            throw new NullPointerException("Passageiro é obrigatório");
        }
        this.passageiro = passageiro;
        if ((aviao == null) || (aviao.equals(""))) {
            throw new NullPointerException("Avião é obrigatório");
        }
        this.aviao = aviao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
}
