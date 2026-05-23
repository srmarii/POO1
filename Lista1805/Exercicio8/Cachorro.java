package exercicio8;

class Cachorro extends Animal {
    String raca;
    double peso;

    void apresentar() {
        System.out.println("\nEste cachorro se chama " + nome + ", tem " + idade + " anos, é da raça " + raca + " e pesa " + peso + " kg.");
    }

    void emitirSom() {
        System.out.println("Au au!");
    }
}
