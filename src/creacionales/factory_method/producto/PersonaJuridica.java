package creacionales.factory_method.producto;


import creacionales.factory_method.dto.PersonaJuridicaDatos;

public class PersonaJuridica implements Persona {
    private PersonaJuridicaDatos datos;

    public PersonaJuridica(PersonaJuridicaDatos datos) {
        this.datos = datos;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Persona Jurídica:");
        System.out.println("Razón Social: " + datos.getRazonSocial());
        System.out.println("RUC: " + datos.getRuc());
        System.out.println("Dirección Fiscal: " + datos.getDireccionFiscal());
        System.out.println("Representante Legal: " + datos.getRepresentanteLegal());
        System.out.println("Teléfono: " + datos.getTelefono());
        System.out.println("Email: " + datos.getEmail());
    }
}