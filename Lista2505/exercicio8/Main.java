package exercicio8;

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

            System.out.print("Digite a primeira nota: ");
            aluno.nota1 = sc.nextDouble();

            System.out.print("Digite a segunda nota: ");
            aluno.nota2 = sc.nextDouble();
            sc.nextLine();

            alunos.add(aluno);
        }

        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).calcularMedia() >= 7) {
                alunos.get(i).apresentar();
            }
        }

        sc.close();
    }
}
