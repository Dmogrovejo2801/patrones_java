package creacionales.prototype;

public class Main {
    public static void main(String[] args) {
        // Crear contrato empresarial base
        BusinessContract baseContract = new BusinessContract(
                "Contrato Empresarial Base",
                "Este es un contrato estándar para empresas.",
                "Empresa Base"
        );

        // Clonar el contrato empresarial para personalizarlo
        BusinessContract client1Contract = baseContract.clone();
        client1Contract.setTitle("Contrato Empresarial Cliente 1");
        client1Contract.setBusinessName("Cliente Empresa 1");

        BusinessContract client2Contract = baseContract.clone();
        client2Contract.setTitle("Contrato Empresarial Cliente 2");
        client2Contract.setBusinessName("Cliente Empresa 2");

        // Imprimir los contratos generados
        System.out.println(baseContract);
        System.out.println(client1Contract);
        System.out.println(client2Contract);
    }

}
