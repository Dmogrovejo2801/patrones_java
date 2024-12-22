package creacionales.factory_method.fabrica;

import creacionales.factory_method.dto.PersonaJuridicaDatos;
import creacionales.factory_method.dto.PersonaNaturalDatos;
import creacionales.factory_method.producto.Persona;
import creacionales.factory_method.producto.PersonaNaturalConNegocio;


public class FabricaPersonaNaturalConNegocio extends FabricadePersona {

    @Override
    public Persona crearPersona(PersonaNaturalDatos datos) {
        return new PersonaNaturalConNegocio(datos);
    }

    @Override
    public Persona crearPersona(PersonaJuridicaDatos datos) {
        throw new UnsupportedOperationException("No soporta creación de Persona Jurídica");
    }
}
