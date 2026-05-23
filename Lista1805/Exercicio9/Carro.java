package exercicio9;

class Carro extends Veiculo {
    String modelo;
    int quantidadePortas;

    void apresentar() {
        System.out.println("\nEste carro é um " + marca + " " + modelo + ", ano " + ano + ".");
    }

    void mostrarPortas() {
        System.out.println("Quantidade de portas: " + quantidadePortas);
    }
}
