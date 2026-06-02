//Grupo: Ana Seibert, Gabriel Pereira e Mariana Ramos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaAgencia sistema = new SistemaAgencia();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar pacote para cliente");
            System.out.println("3 - Listar clientes");
            System.out.println("4 - Listar pacotes de um cliente");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                sistema.cadastrarCliente();
            } else if (opcao == 2) {
                sistema.cadastrarPacote();
            }    
        } while (opcao != 5);
        
        scanner.close();
    }
}