import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Medico medico = new Medico();

        System.out.print("Digite o nome do médico: ");
        medico.nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        medico.idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o CRM: ");
        medico.crm = sc.nextLine();

        System.out.print("Digite a especialidade: ");
        medico.especialidade = sc.nextLine();

        System.out.print("Digite o salário: ");
        medico.salario = sc.nextDouble();

        medico.apresentar();
        medico.mostrarEspecialidade();

        sc.close();
    }
}
