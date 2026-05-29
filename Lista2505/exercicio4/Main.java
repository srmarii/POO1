package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos.add(sc.nextLine());
        }

        System.out.println("\nAlunos cadastrados:");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }

        sc.close();
    }
}
