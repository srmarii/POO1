import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("\nOlá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

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
