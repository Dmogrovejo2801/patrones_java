package creacionales.factory_method.fabrica;

import creacionales.factory_method.dto.PersonaJuridicaDatos;
import creacionales.factory_method.dto.PersonaNaturalDatos;
import creacionales.factory_method.producto.Persona;

public abstract class FabricadePersona {
    public abstract Persona crearPersona(PersonaNaturalDatos datos);
    public abstract Persona crearPersona(PersonaJuridicaDatos datos);

}
