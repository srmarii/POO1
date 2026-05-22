import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente("Mari", 5000, "RH", 2000, 15);

        gerente.apresentar();
        System.out.println(gerente.calcularSalarioMensal());
        gerente.mostrarEquipe();

        Vendedor vendedor = new Vendedor("Ana", 2500, "Vendas", 10000, 10);

        vendedor.apresentar();
        System.out.println(vendedor.calcularComissao());
        System.out.println(vendedor.calcularSalarioMensal());

        sc.close();
    }
}