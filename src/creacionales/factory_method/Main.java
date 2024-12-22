package creacionales.factory_method;

import creacionales.factory_method.dto.PersonaJuridicaDatos;
import creacionales.factory_method.dto.PersonaNaturalDatos;
import creacionales.factory_method.fabrica.FabricaPersonaJuridica;
import creacionales.factory_method.fabrica.FabricaPersonaNaturalConNegocio;
import creacionales.factory_method.fabrica.FabricadePersona;
import creacionales.factory_method.producto.Persona;

public class Main {

    public static void main(String[] args) {
        // Crear y configurar los datos para Persona Natural con Negocio
        PersonaNaturalDatos datosPNN = new PersonaNaturalDatos();
        datosPNN.setNombre("Juan");
        datosPNN.setApellido("Pérez");
        datosPNN.setDni("12345678");
        datosPNN.setNegocio("Tienda de Ropa");
        datosPNN.setDireccion("Calle Falsa 123");
        datosPNN.setTelefono("987654321");

        // Crear y configurar los datos para Persona Jurídica
        PersonaJuridicaDatos datosPJ = new PersonaJuridicaDatos();
        datosPJ.setRazonSocial("TechCorp S.A.");
        datosPJ.setRuc("RUC123456789");
        datosPJ.setDireccionFiscal("Av. Industrial 456");
        datosPJ.setRepresentanteLegal("Ana Gómez");
        datosPJ.setTelefono("123456789");
        datosPJ.setEmail("contacto@techcorp.com");

        // Crear instancias de las fábricas
        FabricadePersona fabricaPNN = new FabricaPersonaNaturalConNegocio();
        FabricadePersona fabricaPJ = new FabricaPersonaJuridica();

        // Crear y mostrar información de las personas
        Persona pnn = fabricaPNN.crearPersona(datosPNN);
        Persona pj = fabricaPJ.crearPersona(datosPJ);

        pnn.mostrarInformacion();
        pj.mostrarInformacion();
    }
}