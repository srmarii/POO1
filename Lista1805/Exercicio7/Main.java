import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor professor = new Professor();

        System.out.print("Digite o nome do professor: ");
        professor.nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        professor.idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a disciplina: ");
        professor.disciplina = sc.nextLine();

        System.out.print("Digite o salário mensal: ");
        professor.salario = sc.nextDouble();

        System.out.print("Digite a carga horária: ");
        professor.cargaHoraria = sc.nextInt();

        professor.apresentar();

        double salarioAnual = professor.calcularSalarioAnual();
        System.out.println("Carga horária: " + professor.cargaHoraria + "h");
        System.out.println("Salário anual: R$ " + salarioAnual);

        sc.close();
    }
}
