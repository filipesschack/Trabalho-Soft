import java.util.List;

public class Financeiro extends Funcionario {
    public Financeiro(String nome, int id) {
        super(nome, id);
    }

    public static void visualizarInformacoesTrans() {
        List<Transacao> todasTransacoes = Transacao.getTodasTransacoes();
        if (todasTransacoes.isEmpty()) {
            System.out.println("Nenhuma transação realizada ainda.");
        } else {
            for (Transacao transacao : todasTransacoes) {
                transacao.mostrarInformacoesTrans();
                System.out.println("==========================");
            }
        }
    }
}