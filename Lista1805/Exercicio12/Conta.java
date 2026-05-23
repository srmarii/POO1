package exercicio12;

class Conta {
    String titular;
    double saldo;

    void apresentar() {
        System.out.println("\nTitular: " + titular + " - Saldo: R$ " + saldo);
    }
}
