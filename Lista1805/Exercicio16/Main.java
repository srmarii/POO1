package exercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AlunoAcademia aluno = new AlunoAcademia();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        aluno.idade = sc.nextInt();

        System.out.print("Digite o peso (kg): ");
        aluno.peso = sc.nextDouble();

        System.out.print("Digite a altura (m): ");
        aluno.altura = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite o objetivo: ");
        aluno.objetivo = sc.nextLine();

        aluno.apresentar();

        sc.close();
    }
}
