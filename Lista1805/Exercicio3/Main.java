package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o nome da pessoa: ");
        pessoa.nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        pessoa.idade = sc.nextInt();

        pessoa.apresentar();

        sc.close();
    }
}
