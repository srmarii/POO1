package exercicio9;

class Livro {
    String titulo;
    String autor;
    int paginas;

    void apresentar() {
        System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | Paginas: " + paginas);
    }

    void verificarGrande() {
        if (paginas > 300) {
            System.out.println("O livro \"" + titulo + "\" tem mais de 300 paginas.");
        }
    }
}
