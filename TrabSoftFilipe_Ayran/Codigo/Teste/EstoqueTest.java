import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class EstoqueTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Estoque estoque;

    @Before
    public void setUp() {
        estoque = new Estoque();
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testAdicionarItemEstoque() {
        // Simula a entrada do usuário
        Item item = new Item("Agua", "Com gas", 10, "Coca-Cola", 3.50);
        estoque.adicionarItemEstoque(item);

        // Verifica se o item foi adicionado corretamente
        assertTrue(estoque.getItens().contains(item));

    }
    
     @Test
    public void testRemoverItemEstoque() {
        // Adiciona um item fictício ao estoque
        Item item = new Item("Agua", "Com gas", 20, "Coca-Cola", 3.50);
        estoque.adicionarItemEstoque(item);

        // Simula a remoção do item
        estoque.removerItemEstoque("Agua", 10);

        // Verifica se o item foi removido corretamente
        assertTrue("O item deveria ter sido removido do estoque.", estoque.getItens().contains(item));
        assertEquals("A quantidade restante do item no estoque deveria ser 10.", 10, item.getQuantidade());
   
    }
    
  
}
