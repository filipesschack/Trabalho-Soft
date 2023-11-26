public class Item {
    private String nome;
    private String descricao;
    private int quantidade;
    private String fornecedor;
    private double preco;

    public Item(String nome, String descricao, int quantidade, String fornecedor, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public double getPreco() {
        return preco;
    }
}
