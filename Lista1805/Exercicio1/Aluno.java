import java.util.Scanner;

class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        aluno.nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = sc.nextDouble();

        double media = aluno.calcularMedia();

        System.out.println("\nNome do aluno: " + aluno.nome);
        System.out.println("Média final: " + media);

        sc.close();
    }
}