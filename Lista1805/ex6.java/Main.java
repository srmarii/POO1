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

        System.out.print("Digite a primeira nota: ");
        aluno.nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = sc.nextDouble();

        aluno.apresentar();

        double media = aluno.calcularMedia();
        System.out.println("Média final: " + media);

        sc.close();
    }
}
