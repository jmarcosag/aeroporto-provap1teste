public class Aviao {

    private String modelo;

    public Aviao(String modelo) {
        if ((modelo == null) || (modelo.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
        }
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if ((modelo == null) || (modelo.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
        }
        this.modelo = modelo;
    }
}
