package creacionales.factory_method.producto;

import creacionales.factory_method.dto.PersonaNaturalDatos;

public class PersonaNaturalConNegocio implements Persona {
    private PersonaNaturalDatos datos;

    public PersonaNaturalConNegocio(PersonaNaturalDatos datos) {
        this.datos = datos;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Persona Natural con Negocio:");
        System.out.println("Nombre: " + datos.getNombre() + " " + datos.getApellido());
        System.out.println("DNI: " + datos.getDni());
        System.out.println("Negocio: " + datos.getNegocio());
        System.out.println("Dirección: " + datos.getDireccion());
        System.out.println("Teléfono: " + datos.getTelefono());
    }
}
