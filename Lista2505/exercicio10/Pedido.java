package exercicio10;

class Pedido {
    String produto;
    int quantidade;
    double preco;

    double calcularTotal() {
        return quantidade * preco;
    }

    void apresentar() {
        System.out.println("Produto: " + produto + " | Quantidade: " + quantidade + " | Total: R$ " + calcularTotal());
    }
}
