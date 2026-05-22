import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente();

        System.out.print("Digite o nome do gerente: ");
        gerente.nome = sc.nextLine();

        System.out.print("Digite o salário base: ");
        gerente.salario = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite o setor: ");
        gerente.setor = sc.nextLine();

        System.out.print("Digite o bônus: ");
        gerente.bonus = sc.nextDouble();

        gerente.apresentar();

        double salarioFinal = gerente.calcularSalarioFinal();
        System.out.println("Salário final: R$ " + salarioFinal);

        sc.close();
    }
}
