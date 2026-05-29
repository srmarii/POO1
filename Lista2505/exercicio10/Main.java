package exercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pedido> pedidos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Pedido pedido = new Pedido();

            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            pedido.produto = sc.nextLine();

            System.out.print("Digite a quantidade: ");
            pedido.quantidade = sc.nextInt();

            System.out.print("Digite o preco: ");
            pedido.preco = sc.nextDouble();
            sc.nextLine();

            pedidos.add(pedido);
        }

        double faturamento = 0;
        System.out.println("\nPedidos cadastrados:");
        for (int i = 0; i < pedidos.size(); i++) {
            pedidos.get(i).apresentar();
            faturamento += pedidos.get(i).calcularTotal();
        }

        System.out.println("\nFaturamento final: R$ " + faturamento);

        sc.close();
    }
}
