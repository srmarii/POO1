import java.util.Scanner;

class Aluno {
    String nome;
    int idade;
    String matricula;

    void apresentar() {
        System.out.println("\nOlá, meu nome é " + nome + ", tenho " + idade + " anos e minha matrícula é " + matricula + ".");
    }
}

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
