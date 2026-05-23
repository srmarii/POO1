package exercicio11;

class Livro extends Produto {
    String autor;
    int paginas;

    void apresentar() {
        System.out.println("\nLivro: " + nome + " - Preço: R$ " + preco + " - Páginas: " + paginas);
    }

    void mostrarAutor() {
        System.out.println("Autor: " + autor);
    }
}
