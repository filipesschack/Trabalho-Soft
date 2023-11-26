import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TransItemTest {

    @Test
    public void testCalcularCustoTotal() {
        // Cria um TransItem com quantidade 5 e custo unitário 10.0
        TransItem transItem = new TransItem(5, 10.0);

        // Calcula o custo total esperado (quantidade * custo unitário)
        double expectedCustoTotal = 5 * 10.0;

        // Verifica se o método calcularCustoTotal retorna o valor esperado
        assertEquals(expectedCustoTotal, transItem.calcularCustoTotal(), 0.001); /* 0.001 é a tolerância ou margem de erro  
                                                                                                     permitida ao comparar dois valores*/ 
    }
}
