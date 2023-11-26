public class TransItem {
    private int quantidade;
    private double custo;

    public TransItem(int quantidade, double custo) {
        this.quantidade = quantidade;
        this.custo = custo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getCusto() {
        return custo;
    }

    public double calcularCustoTotal() {
        return quantidade * custo;
    }
}
