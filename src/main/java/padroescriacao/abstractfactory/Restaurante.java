package padroescriacao.abstractfactory;

public class Restaurante {

    private Sobremesa sobremesa;
    private PratoPrincipal pratoPrincipal;

    public Restaurante (FabricaAbstrata fabrica) {
        this.sobremesa = fabrica.mostrarMenuSobremesa();
        this.pratoPrincipal = fabrica.mostrarMenuPrincipal();
    }

    public String opcaoSobremesa() {
        return this.sobremesa.mostrarMenuSobremesa();
    }

    public String opcaoPrincipal() {
        return this.pratoPrincipal.mostrarMenuPrincipal();
    }
}
