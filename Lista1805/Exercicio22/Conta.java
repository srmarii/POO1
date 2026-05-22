public class Conta {

    protected String titular;
    protected int numero;
    protected double saldo;

    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void mostrarSaldo() {
        System.out.println(saldo);
    }
}