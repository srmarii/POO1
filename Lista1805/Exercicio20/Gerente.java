package exercicio20;

public class Gerente extends Funcionario {

    private double bonus;
    private int quantidadeFuncionarios;

    public Gerente(String nome, double salarioBase, String setor, double bonus, int quantidadeFuncionarios) {
        super(nome, salarioBase, setor);
        this.bonus = bonus;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public double calcularSalarioMensal() {
        return salarioBase + bonus;
    }

    public void mostrarEquipe() {
        System.out.println(quantidadeFuncionarios);
    }
}