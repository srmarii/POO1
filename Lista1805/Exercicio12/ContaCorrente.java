package exercicio12;

class ContaCorrente extends Conta {
    double limite;
    String agencia;

    void apresentar() {
        System.out.println("\nConta Corrente - Titular: " + titular + " - Agência: " + agencia + " - Saldo: R$ " + saldo);
    }

    void mostrarLimite() {
        System.out.println("Limite: R$ " + limite);
    }
}
