package exercicio22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaCorrente cc = new ContaCorrente("Carlos", 1, 1000, 500, 20);

        cc.depositar(200);
        cc.sacar(100);
        cc.mostrarSaldo();
        cc.usarLimite();
        cc.cobrarTaxa();

        ContaPoupanca cp = new ContaPoupanca("Ana", 2, 2000, 5, 10);

        cp.depositar(300);
        cp.sacar(150);
        cp.mostrarSaldo();
        cp.aplicarRendimento();
        cp.mostrarAniversario();

        sc.close();
    }
}