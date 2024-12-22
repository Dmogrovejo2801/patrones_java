package creacionales.factory_method.dto;

public class PersonaNaturalDatos extends DatosComunesPersona{
    private String nombre;
    private String apellido;
    private String dni;
    private String negocio;
    private String direccion;

    public PersonaNaturalDatos() {
        // Constructor por defecto
    }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDni(String dni) { this.dni = dni; }
    public void setNegocio(String negocio) { this.negocio = negocio; }
    public void setDireccion(String direccion) { this.direccion = direccion; }


    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDni() { return dni; }
    public String getNegocio() { return negocio; }
    public String getDireccion() { return direccion; }


    @Override
    public String toString() {
        return "PersonaNaturalDatos{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", negocio='" + negocio + '\'' +
                '}';
    }
}
