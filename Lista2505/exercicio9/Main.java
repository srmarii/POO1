package exercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Livro livro = new Livro();

            System.out.print("Digite o titulo do livro " + (i + 1) + ": ");
            livro.titulo = sc.nextLine();

            System.out.print("Digite o autor do livro " + (i + 1) + ": ");
            livro.autor = sc.nextLine();

            System.out.print("Digite o numero de paginas: ");
            livro.paginas = sc.nextInt();
            sc.nextLine();

            livros.add(livro);
        }

        System.out.println("\nLivros cadastrados:");
        for (int i = 0; i < livros.size(); i++) {
            livros.get(i).apresentar();
        }

        System.out.println("\nLivros com mais de 300 paginas:");
        for (int i = 0; i < livros.size(); i++) {
            livros.get(i).verificarGrande();
        }

        sc.close();
    }
}
