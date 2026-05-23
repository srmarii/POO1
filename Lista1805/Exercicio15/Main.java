package exercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Computador pc = new Computador();

        System.out.print("Digite o nome do computador: ");
        pc.nome = sc.nextLine();

        System.out.print("Digite o preço: ");
        pc.preco = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a memória RAM (GB): ");
        pc.memoriaRAM = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o processador: ");
        pc.processador = sc.nextLine();

        System.out.print("Digite a placa de vídeo: ");
        pc.placaVideo = sc.nextLine();

        pc.apresentar();
        pc.mostrarConfiguracao();

        sc.close();
    }
}
