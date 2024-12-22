package creacionales.factory_method.fabrica;

import creacionales.factory_method.modelo.PersonaJuridica;
import creacionales.factory_method.modelo.PersonaNaturalConNegocio;

import java.util.HashMap;
import java.util.Map;

public class PersonaFactory {
    private static final Map<String, PersonaCreator> creators = new HashMap<>();

    static {
        // Registro de tipos
        register("PNN", PersonaNaturalConNegocio::new);
        register("PJ", PersonaJuridica::new);
    }

    // Método para registrar un tipo
    public static void register(String type, PersonaCreator creator) {
        creators.put(type, creator);
    }

    // Método para crear una instancia
    public static Persona createPersona(String type, String ruc) {
        PersonaCreator creator = creators.get(type);
        if (creator == null) {
            throw new IllegalArgumentException("Tipo de persona no soportado: " + type);
        }
        return creator.create(ruc);
    }
}
