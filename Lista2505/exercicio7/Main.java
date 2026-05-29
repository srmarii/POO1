package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Filme> filmes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Filme filme = new Filme();

            System.out.print("Digite o titulo do filme " + (i + 1) + ": ");
            filme.titulo = sc.nextLine();

            System.out.print("Digite o genero do filme " + (i + 1) + ": ");
            filme.genero = sc.nextLine();

            System.out.print("Digite a duracao do filme " + (i + 1) + ": ");
            filme.duracao = sc.nextInt();
            sc.nextLine();

            filmes.add(filme);
        }

        System.out.println("\nFilmes cadastrados:");
        for (int i = 0; i < filmes.size(); i++) {
            filmes.get(i).apresentar();
        }

        sc.close();
    }
}
