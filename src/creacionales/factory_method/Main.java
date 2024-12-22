package creacionales.factory_method;

import creacionales.factory_method.builder.PersonaBuilder;
import creacionales.factory_method.fabrica.Persona;
import creacionales.factory_method.modelo.PersonaJuridica;
import creacionales.factory_method.modelo.PersonaNaturalConNegocio;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = PersonaBuilder.build("PNN", "123456789");
        Persona persona2 = PersonaBuilder.build("PJ", "987654321");

        // Mostrar resultados
        System.out.println("Persona 1: " + persona1.getClass().getSimpleName() + " - RUC: " + persona1.getRuc());
        System.out.println("Persona 2: " + persona2.getClass().getSimpleName() + " - RUC: " + persona2.getRuc());
    }
}