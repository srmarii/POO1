package exercicio22;

public class ContaCorrente extends Conta {

    private double limite;
    private double taxaMensal;

    public ContaCorrente(String titular, int numero, double saldo, double limite, double taxaMensal) {
        super(titular, numero, saldo);
        this.limite = limite;
        this.taxaMensal = taxaMensal;
    }

    public void usarLimite() {
        saldo += limite;
        System.out.println(saldo);
    }

    public void cobrarTaxa() {
        saldo -= taxaMensal;
        System.out.println(saldo);
    }
}