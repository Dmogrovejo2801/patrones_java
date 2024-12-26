package creacionales.abstract_factory.producto;

public class SodaMexicana implements Bebida{
    @Override
    public void preparar() {
        System.out.println("Preparando una soda mexicana.");
    }

    @Override
    public void atender() {
        System.out.println("Sirviendo una soda mexicana.");
    }
}
