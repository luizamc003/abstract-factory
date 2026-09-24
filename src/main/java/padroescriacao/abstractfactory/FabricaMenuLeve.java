package padroescriacao.abstractfactory;

public class FabricaMenuLeve implements FabricaAbstrata {

    @Override
    public PratoPrincipal mostrarMenuPrincipal() { return new Ravioli(); }

    @Override
    public Sobremesa mostrarMenuSobremesa() { return new Sorvete(); }
}