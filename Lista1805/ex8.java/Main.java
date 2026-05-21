import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cachorro cachorro = new Cachorro();

        System.out.print("Digite o nome do cachorro: ");
        cachorro.nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        cachorro.idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a raça: ");
        cachorro.raca = sc.nextLine();

        System.out.print("Digite o peso (kg): ");
        cachorro.peso = sc.nextDouble();

        cachorro.apresentar();
        cachorro.emitirSom();

        sc.close();
    }
}
