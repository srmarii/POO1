package exercicio20;

public class Vendedor extends Funcionario {

    private double valorVendas;
    private double percentualComissao;

    public Vendedor(String nome, double salarioBase, String setor, double valorVendas, double percentualComissao) {
        super(nome, salarioBase, setor);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    public double calcularComissao() {
        return valorVendas * percentualComissao / 100;
    }

    @Override
    public double calcularSalarioMensal() {
        return salarioBase + calcularComissao();
    }
}