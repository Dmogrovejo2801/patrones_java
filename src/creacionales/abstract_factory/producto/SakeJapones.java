package creacionales.abstract_factory.producto;

public class SakeJapones implements Bebida{
    @Override
    public void preparar() {
        System.out.println("Preparando un sake japonés.");
    }

    @Override
    public void atender() {
        System.out.println("Sirviendo un sake japonés.");
    }
}
