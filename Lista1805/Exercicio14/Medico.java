class Medico extends Pessoa {
    String especialidade;
    double salario;
    String crm;

    void apresentar() {
        System.out.println("\nMédico: " + nome + " - Idade: " + idade + " - CRM: " + crm);
        System.out.println("Salário: R$ " + salario);
    }

    void mostrarEspecialidade() {
        System.out.println("Especialidade: " + especialidade);
    }
}
