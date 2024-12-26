package creacionales.abstract_factory;

import creacionales.abstract_factory.fabrica.AbstractMenuFactory;
import creacionales.abstract_factory.producto.Bebida;
import creacionales.abstract_factory.producto.PlatoPrincipal;

public class Restaurante {
    private final Bebida bebida;
    private final PlatoPrincipal platoPrincipal;

    public Restaurante(AbstractMenuFactory factory) {
        // Llamamos a métodos de la fábrica para crear productos
        this.bebida = factory.crearBebida();
        this.platoPrincipal = factory.crearPlatoPrincipal();
    }

    public void serveMenu() {
        bebida.preparar();
        bebida.atender();
        platoPrincipal.preparar();
        platoPrincipal.atender();
    }
}
