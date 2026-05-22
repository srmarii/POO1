import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro("Hp", 2020, 1, "Mari", 450);

        livro.mostrarDados();
        livro.mostrarAutor();
        livro.verificarGrande();

        Revista revista = new Revista("oioi", 2024, 2, 10, "Maio");

        revista.mostrarDados();
        revista.mostrarEdicao();
        revista.mostrarMes();

        sc.close();
    }
}