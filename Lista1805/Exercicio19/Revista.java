package exercicio19;

public class Revista extends Item {

    private int edicao;
    private String mesPublicacao;

    public Revista(String titulo, int anoPublicacao, int codigo, int edicao, String mesPublicacao) {
        super(titulo, anoPublicacao, codigo);
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }

    public void mostrarEdicao() {
        System.out.println(edicao);
    }

    public void mostrarMes() {
        System.out.println(mesPublicacao);
    }
}