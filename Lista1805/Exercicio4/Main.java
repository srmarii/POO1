package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        aluno.idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a matrícula: ");
        aluno.matricula = sc.nextLine();

        aluno.apresentar();

        sc.close();
    }
}
