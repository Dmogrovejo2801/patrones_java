package creacionales.factory_method.dto;

public class PersonaJuridicaDatos extends DatosComunesPersona {
    private String razonSocial;
    private String ruc;
    private String direccionFiscal;
    private String representanteLegal;;

    public PersonaJuridicaDatos() {
        // Constructor por defecto
    }

    // Setters
    public void setRazonSocial(String razonSocial) { this.razonSocial = razonSocial; }
    public void setRuc(String ruc) { this.ruc = ruc; }
    public void setDireccionFiscal(String direccionFiscal) { this.direccionFiscal = direccionFiscal; }
    public void setRepresentanteLegal(String representanteLegal) { this.representanteLegal = representanteLegal; }


    // Getters
    public String getRazonSocial() { return razonSocial; }
    public String getRuc() { return ruc; }
    public String getDireccionFiscal() { return direccionFiscal; }
    public String getRepresentanteLegal() { return representanteLegal; }


    @Override
    public String toString() {
        return "PersonaJuridicaDatos{" +
                "razonSocial='" + razonSocial + '\'' +
                ", ruc='" + ruc + '\'' +
                ", direccionFiscal='" + direccionFiscal + '\'' +
                ", representanteLegal='" + representanteLegal + '\'' +
                '}';
    }
}
