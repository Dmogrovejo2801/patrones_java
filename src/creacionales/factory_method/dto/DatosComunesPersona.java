package creacionales.factory_method.dto;

public class DatosComunesPersona {
    private String telefono;
    private String email;

    public DatosComunesPersona() {
        // Constructor por defecto
    }

    // Setter y Getter
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getTelefono() { return telefono; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
