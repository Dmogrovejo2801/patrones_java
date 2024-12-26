package creacionales.abstract_factory.fabrica;

import creacionales.abstract_factory.producto.Bebida;
import creacionales.abstract_factory.producto.PlatoPrincipal;

public abstract class AbstractMenuFactory {
    public abstract Bebida crearBebida();
    public abstract PlatoPrincipal crearPlatoPrincipal();

    public void impimirEncabezadoDelMenu() {
        System.out.println("---- Menú del Restaurante ----");
    }
}
