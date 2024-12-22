package creacionales.factory_method.builder;

import creacionales.factory_method.fabrica.Persona;
import creacionales.factory_method.fabrica.PersonaFactory;

public class PersonaBuilder{
    public static Persona build(String type, String ruc) {
        return PersonaFactory.createPersona(type, ruc);
    }
}
