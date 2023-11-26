import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FinanceiroTest {

    @Test
    public void testVisualizarInformacoesTrans() {
        // Redefine a saída padrão para capturar a impressão no console
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    

        // Chama o método que imprime no console
        Financeiro.visualizarInformacoesTrans();

        // Verifica se a saída no console contém as informações esperadas
        String expectedOutput = "Nenhuma transação realizada ainda.";
        assertTrue(outputStreamCaptor.toString().contains(expectedOutput));

        // Restaura a saída padrão
        System.setOut(System.out);
    }
}
