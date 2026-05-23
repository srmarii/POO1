package exercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vendedor vendedor = new Vendedor();

        System.out.print("Digite o nome do vendedor: ");
        vendedor.nome = sc.nextLine();

        System.out.print("Digite o salário base: ");
        vendedor.salario = sc.nextDouble();

        System.out.print("Digite o total de vendas do mês: ");
        vendedor.vendasMes = sc.nextDouble();

        System.out.print("Digite o percentual de comissão (%): ");
        vendedor.comissao = sc.nextDouble();

        vendedor.mostrarSalarioFinal();

        sc.close();
    }
}
