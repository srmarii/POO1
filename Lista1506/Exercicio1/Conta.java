package Exercicio1;
public class Conta {
    private int numeroConta;
    private double saldo;

    public Conta(){
        numeroConta = 0;
        saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double depositar(double valor){
        saldo+= valor;
        return saldo;
    }

    public double sacar(double valor){
        if(valor<=saldo){
            saldo-=valor;
        } else {
            System.out.println("Saldo insuficiente para sacar este valor.");
        }

        return saldo;
    }
}
