package exercicio21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro("kk", "p", 2022, 0, 4, true);

        carro.mostrarDados();
        carro.acelerar(50);
        carro.frear(20);
        carro.mostrarPortas();
        carro.verificarCambio();

        Moto moto = new Moto("honda", "o", 2021, 0, 500, true);

        moto.mostrarDados();
        moto.acelerar(80);
        moto.frear(30);
        moto.mostrarCilindradas();
        moto.verificarPartida();

        sc.close();
    }
}