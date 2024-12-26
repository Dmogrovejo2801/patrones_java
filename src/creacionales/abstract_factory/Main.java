package creacionales.abstract_factory;

import creacionales.abstract_factory.fabrica.AbstractMenuFactory;
import creacionales.abstract_factory.fabrica.JaponMenuFactory;
import creacionales.abstract_factory.fabrica.MexicoMenuFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Registro de fábricas
        Map<String, AbstractMenuFactory> factories = new HashMap<>();
        factories.put("México", new MexicoMenuFactory());
        factories.put("Japon", new JaponMenuFactory());

        // Selección de país
        String country = "Japon";

        // Obtener fábrica correspondiente
        AbstractMenuFactory factory = factories.get(country);
        if (factory == null) {
            System.out.println("No hay menú disponible para este país.");
            return;
        }

        // Configuración del restaurante
        Restaurante restaurant = new Restaurante(factory);
        factory.impimirEncabezadoDelMenu();
        restaurant.serveMenu();
    }
}
