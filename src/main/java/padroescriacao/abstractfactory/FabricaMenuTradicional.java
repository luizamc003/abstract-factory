package padroescriacao.abstractfactory;

public class FabricaMenuTradicional implements FabricaAbstrata {

    @Override
    public PratoPrincipal mostrarMenuPrincipal() { return new Lasanha(); }

    @Override
    public Sobremesa mostrarMenuSobremesa() { return new Tiramisu(); }
}