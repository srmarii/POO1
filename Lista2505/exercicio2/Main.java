package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("\nNomes cadastrados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i]);
        }

        sc.close();
    }
}
