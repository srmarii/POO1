import java.util.Scanner;

class Professor {
    String nome;
    double salarioMensal;
    String disciplina;

    double calcularSalarioAnual() {
        return salarioMensal * 12;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor professor = new Professor();

        System.out.print("Digite o nome do professor: ");
        professor.nome = sc.nextLine();

        System.out.print("Digite a disciplina: ");
        professor.disciplina = sc.nextLine();

        System.out.print("Digite o salário mensal: ");
        professor.salarioMensal = sc.nextDouble();

        double salarioAnual = professor.calcularSalarioAnual();

        System.out.println("\nNome: " + professor.nome);
        System.out.println("Disciplina: " + professor.disciplina);
        System.out.println("Salário anual: R$ " + salarioAnual);

        sc.close();
    }
}