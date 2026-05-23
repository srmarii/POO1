package exercicio10;

class Gerente extends Funcionario {
    String setor;
    double bonus;

    public void apresentar() {
        System.out.println("\nGerente: " + nome + " - Setor: " + setor + " - Salário base: R$ " + salario);
    }

    public double calcularSalarioFinal() {
        return salario + bonus;
    }
}
