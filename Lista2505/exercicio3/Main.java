package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] medias = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a media do aluno " + (i + 1) + ": ");
            medias[i] = sc.nextDouble();
        }

        double maior = medias[0];
        double menor = medias[0];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            if (medias[i] > maior) {
                maior = medias[i];
            }
            if (medias[i] < menor) {
                menor = medias[i];
            }
            soma += medias[i];
        }

        double mediaGeral = soma / 4;

        System.out.println("\nMaior media: " + maior);
        System.out.println("Menor media: " + menor);
        System.out.println("Media geral da turma: " + mediaGeral);

        sc.close();
    }
}
