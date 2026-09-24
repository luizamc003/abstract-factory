package padroescriacao.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RestauranteTest {

    @Test
    void deveMostrarMenuTradicional() {
        FabricaAbstrata fabrica = new FabricaMenuTradicional();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("lasanha vegetariana ou normal", restaurante.opcaoPrincipal());
    }
    @Test
    void deveMostrarMenuLeve() {
        FabricaAbstrata fabrica = new FabricaMenuLeve();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("opcao com carne ou vegetais", restaurante.opcaoPrincipal());
    }

    @Test
    void deveMostrarSobremesaTrad() {
        FabricaAbstrata fabrica = new FabricaMenuTradicional();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("opcao normal ou diet", restaurante.opcaoSobremesa());
    }

    @Test
    void deveMostrarSobremesaLeve() {
        FabricaAbstrata fabrica = new FabricaMenuLeve();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("chocolate ou creme", restaurante.opcaoSobremesa());
    }

}