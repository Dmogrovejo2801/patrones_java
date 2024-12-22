package creacionales.factory_method.fabrica;

import creacionales.factory_method.dto.PersonaJuridicaDatos;
import creacionales.factory_method.dto.PersonaNaturalDatos;
import creacionales.factory_method.producto.Persona;
import creacionales.factory_method.producto.PersonaJuridica;

public class FabricaPersonaJuridica extends FabricadePersona {

    @Override
    public Persona crearPersona(PersonaNaturalDatos datos) {
        throw new UnsupportedOperationException("No soporta creación de Persona Natural");
    }

    @Override
    public Persona crearPersona(PersonaJuridicaDatos datos) {
        return new PersonaJuridica(datos);
    }
}