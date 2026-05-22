public class ContaPoupanca extends Conta {

    private double rendimento;
    private int aniversario;

    public ContaPoupanca(String titular, int numero, double saldo, double rendimento, int aniversario) {
        super(titular, numero, saldo);
        this.rendimento = rendimento;
        this.aniversario = aniversario;
    }

    public void aplicarRendimento() {
        saldo += saldo * rendimento / 100;
        System.out.println(saldo);
    }

    public void mostrarAniversario() {
        System.out.println(aniversario);
    }
}