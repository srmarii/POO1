package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Aluno aluno = new Aluno();

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            aluno.nome = sc.nextLine();

            System.out.print("Digite a media do aluno " + (i + 1) + ": ");
            aluno.media = sc.nextDouble();
            sc.nextLine();

            alunos.add(aluno);
        }

        System.out.println("\nAlunos cadastrados:");
        for (int i = 0; i < alunos.size(); i++) {
            alunos.get(i).apresentar();
        }

        sc.close();
    }
}
