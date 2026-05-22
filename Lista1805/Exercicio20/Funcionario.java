public class Funcionario {

    protected String nome;
    protected double salarioBase;
    protected String setor;

    public Funcionario(String nome, double salarioBase, String setor) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.setor = setor;
    }

    public void apresentar() {
        System.out.println(nome);
        System.out.println(salarioBase);
        System.out.println(setor);
    }

    public double calcularSalarioMensal() {
        return salarioBase;
    }
}