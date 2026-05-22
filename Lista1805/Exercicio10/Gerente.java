class Gerente extends Funcionario {
    String setor;
    double bonus;

    void apresentar() {
        System.out.println("\nGerente: " + nome + " - Setor: " + setor + " - Salário base: R$ " + salario);
    }

    double calcularSalarioFinal() {
        return salario + bonus;
    }
}
