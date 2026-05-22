public class Item {

    protected String titulo;
    protected int anoPublicacao;
    protected int codigo;

    public Item(String titulo, int anoPublicacao, int codigo) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.codigo = codigo;
    }

    public void mostrarDados() {
        System.out.println(titulo);
        System.out.println(anoPublicacao);
        System.out.println(codigo);
    }
}