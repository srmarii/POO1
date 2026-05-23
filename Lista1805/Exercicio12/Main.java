package exercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente();

        System.out.print("Digite o nome do titular: ");
        conta.titular = sc.nextLine();

        System.out.print("Digite o saldo: ");
        conta.saldo = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a agência: ");
        conta.agencia = sc.nextLine();

        System.out.print("Digite o limite: ");
        conta.limite = sc.nextDouble();

        conta.apresentar();
        conta.mostrarLimite();

        sc.close();
    }
}
