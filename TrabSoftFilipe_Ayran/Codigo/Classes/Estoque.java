import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Estoque {
    private List<Item> itens;

    public Estoque() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItemEstoque(Item item) {
        itens.add(item);
    }

    public void removerItemEstoque(String nome, int quantidade) {
    Iterator<Item> iterator = itens.iterator();
    boolean itemEncontrado = false;
    while (iterator.hasNext()) {
        Item item = iterator.next();
        if (item.getNome().equals(nome)) {
            itemEncontrado = true;
            if (quantidade <= item.getQuantidade()) {
                item.setQuantidade(item.getQuantidade() - quantidade);
                if (item.getQuantidade() == 0) {
                    iterator.remove();
                }
                System.out.println("Item removido com sucesso!");
            } else {
                System.out.println("Erro: Quantidade desejada maior do que a disponível no estoque.");
            }
            break;
        }
    }
    if (!itemEncontrado) {
        System.out.println("Erro: Item não encontrado no estoque.");
    }
}



    public void visualizarEstoque() {
        if (itens.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            for (Item item : itens) {
                System.out.println("Nome: " + item.getNome());
                System.out.println("Descrição: " + item.getDescricao());
                System.out.println("Quantidade: " + item.getQuantidade());
                System.out.println("Fornecedor: " + item.getFornecedor());
                System.out.println("Preço: " + item.getPreco());
                System.out.println("==========================");
            }
        }
    }
    
     public List<Item> getItens() {
        return itens;
    }

   
}