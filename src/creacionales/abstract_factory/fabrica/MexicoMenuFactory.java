package creacionales.abstract_factory.fabrica;

import creacionales.abstract_factory.producto.Bebida;
import creacionales.abstract_factory.producto.PlatoPrincipal;
import creacionales.abstract_factory.producto.SodaMexicana;
import creacionales.abstract_factory.producto.TacoMexicano;

public class MexicoMenuFactory extends AbstractMenuFactory{
    @Override
    public Bebida crearBebida() {
        return new SodaMexicana();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new TacoMexicano();
    }
}
