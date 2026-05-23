package exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.print("Digite a marca: ");
        carro.marca = sc.nextLine();

        System.out.print("Digite o ano: ");
        carro.ano = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o modelo: ");
        carro.modelo = sc.nextLine();

        System.out.print("Digite a quantidade de portas: ");
        carro.quantidadePortas = sc.nextInt();

        carro.apresentar();
        carro.mostrarPortas();

        sc.close();
    }
}
