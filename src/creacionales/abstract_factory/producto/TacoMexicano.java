package creacionales.abstract_factory.producto;

public class TacoMexicano implements PlatoPrincipal{
    @Override
    public void preparar() {
        System.out.println("preparando un taco mexicano.");
    }

    @Override
    public void atender() {
        System.out.println("Sirviendo un taco mexicano.");
    }
}
