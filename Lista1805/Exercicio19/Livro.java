package exercicio19;

public class Livro extends Item {

    private String autor;
    private int paginas;

    public Livro(String titulo, int anoPublicacao, int codigo, String autor, int paginas) {
        super(titulo, anoPublicacao, codigo);
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarAutor() {
        System.out.println(autor);
    }

    public void verificarGrande() {
        if (paginas > 300) {
            System.out.println("Livro grande");
        } else {
            System.out.println("Livro pequeno");
        }
    }
}