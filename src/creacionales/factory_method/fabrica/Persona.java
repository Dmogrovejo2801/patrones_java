package creacionales.factory_method.fabrica;

public abstract class Persona {
    private String ruc;

    public Persona(String ruc) {
        this.ruc = ruc;
    }

    public String getRuc() {
        return ruc;
    }

}
