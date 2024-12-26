package creacionales.abstract_factory.fabrica;

import creacionales.abstract_factory.producto.Bebida;
import creacionales.abstract_factory.producto.PlatoPrincipal;
import creacionales.abstract_factory.producto.RamenJapones;
import creacionales.abstract_factory.producto.SakeJapones;

public class JaponMenuFactory extends AbstractMenuFactory {
    @Override
    public Bebida crearBebida() {
        return new SakeJapones();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new RamenJapones();
    }
}
