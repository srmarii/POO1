class Professor extends Pessoa {
    String disciplina;
    double salario;
    int cargaHoraria;

    void apresentar() {
        System.out.println("\nOlá, meu nome é " + nome + ", tenho " + idade + " anos e leciono " + disciplina + ".");
    }

    double calcularSalarioAnual() {
        return salario * 12;
    }
}
