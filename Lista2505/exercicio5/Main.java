package exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> produtos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos.add(sc.nextLine());
        }

        System.out.println("\nProdutos cadastrados:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }

        sc.close();
    }
}
