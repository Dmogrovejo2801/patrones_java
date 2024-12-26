package creacionales.abstract_factory.producto;

public class RamenJapones implements PlatoPrincipal{
    @Override
    public void preparar() {
        System.out.println(" Preparando un ramen japonés.");}

    @Override
    public void atender() {
        System.out.println("Sirviendo un ramen japonés.");
    }
}
