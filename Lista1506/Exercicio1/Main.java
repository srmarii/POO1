package Exercicio1;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        boolean ficar=true;
        double valor;

        Cliente cliente = new Cliente();
        System.out.println("Nome do cliente:");
        cliente.setNome(t.next());
        System.out.println("Cpf do cliente:");
        cliente.setCpf(t.nextInt());

        Conta conta = new Conta();
        System.out.println("Numero da conta:");
        conta.setNumeroConta(t.nextInt());

        while(ficar){
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("Qualquer outro - Sair");
            int opcao = t.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Qual valor vc deseja sacar?");
                    valor = t.nextDouble();
                    conta.sacar(valor);

                    System.out.println("Valor na sua conta: " + conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Qual valor vc deseja depositar?");
                    valor = t.nextDouble();
                    conta.depositar(valor);

                    System.out.println("Valor na sua conta: " + conta.getSaldo());
                    break;
                default:
                    ficar = false;
                    break;
            }
        }


     }
    
}
