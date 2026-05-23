package exercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.print("Digite o nome do livro: ");
        livro.nome = sc.nextLine();

        System.out.print("Digite o preço: ");
        livro.preco = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite o autor: ");
        livro.autor = sc.nextLine();

        System.out.print("Digite a quantidade de páginas: ");
        livro.paginas = sc.nextInt();

        livro.apresentar();
        livro.mostrarAutor();

        sc.close();
    }
}
