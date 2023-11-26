import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Transacao {
    private static List<Transacao> todasTransacoes = new ArrayList<>();
    private Date data;
    private List<TransItem> transItens;
    private String nomeFuncResponsavel;

    public Transacao(String nomeFuncResponsavel) {
        this.data = new Date();
        this.transItens = new ArrayList<>();
        this.nomeFuncResponsavel = nomeFuncResponsavel;
        todasTransacoes.add(this);
    }

    public void realizarTransacao(Estoque estoque) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do item:");
        String nome = scanner.nextLine();
        System.out.println("Digite a descrição do item:");
        String descricao = scanner.nextLine();
        System.out.println("Digite a quantidade do item:");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o fornecedor do item:");
        String fornecedor = scanner.nextLine();
        System.out.println("Digite o preço do item:");
        double preco = scanner.nextDouble();
        Item newItem = new Item(nome, descricao, quantidade, fornecedor, preco);
        estoque.adicionarItemEstoque(newItem);
        TransItem transItem = new TransItem(quantidade, preco);
        transItens.add(transItem);
        System.out.println("Transação realizada com sucesso!");
    }

  public void mostrarInformacoesTrans() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatoData.format(data);

        System.out.println("Data: " + dataFormatada);
        System.out.println("Funcionário Responsável: " + nomeFuncResponsavel);
        System.out.println("Quantidade\tCusto\tCusto Total");
        
        for (TransItem transItem : transItens) {
            double custoTotal = transItem.calcularCustoTotal();
            System.out.println(transItem.getQuantidade() + "\t\t" + transItem.getCusto() + "\t" + custoTotal);
        }
    }

    public static List<Transacao> getTodasTransacoes() {
        return todasTransacoes;
    }
    
     public List<TransItem> getTransItens() {
        return transItens;
    }
}