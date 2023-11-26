import static org.junit.Assert.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

public class TransacaoTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    private Transacao transacao;

    @Before
    public void setUp() {
        transacao = new Transacao("FuncionarioTeste");
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
     public void testMostrarInformacoesTrans() {
        // Adiciona um item fictício à transação
        TransItem transItem = new TransItem(5, 10.0);
        transacao.getTransItens().add(transItem);

        // Simula a execução do método mostrarInformacoesTrans
        transacao.mostrarInformacoesTrans();
        

        // Verificações detalhadas 
        assertTrue("A saída esperada não contém a data.", outputStreamCaptor.toString().contains("Data:"));
        assertTrue("A saída esperada não contém o nome do funcionário responsável.", 
                   outputStreamCaptor.toString().contains("Funcionário Responsável: FuncionarioTeste"));
        assertTrue("A saída esperada não contém as informações de quantidade, custo e custo total.", 
                   outputStreamCaptor.toString().contains("Quantidade\tCusto\tCusto Total"));
        assertTrue("A saída esperada não contém as informações específicas do TransItem (5\t\t10.0\t50.0).", 
                   outputStreamCaptor.toString().contains("5\t\t10.0\t50.0"));
    }
}
