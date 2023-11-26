import static org.junit.Assert.*;
import org.junit.Test;

public class ItemTest {

    @Test
    public void testItem() {
        // Cria um item
        Item item = new Item("Agua", "Com gas", 50, "Coca-cola", 2.50);

        // Verifica se os métodos de acesso estão funcionando corretamente
        assertEquals("O nome do item não corresponde ao esperado.", "Agua", item.getNome());
        assertEquals("A descrição do item não corresponde ao esperado.", "Com gas", item.getDescricao());
        assertEquals("A quantidade do item não corresponde ao esperado.", 50, item.getQuantidade());
        assertEquals("O fornecedor do item não corresponde ao esperado.", "Coca-cola", item.getFornecedor());
        assertEquals("O preço do item não corresponde ao esperado.", 2.50, item.getPreco(), 0.001);

   
    }
}
