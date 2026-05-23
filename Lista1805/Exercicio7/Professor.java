package exercicio7;

class Professor extends Pessoa {
    String disciplina;
    double salario;
    int cargaHoraria;
    public double salarioMensal;

    void apresentar() {
        System.out.println("\nNome: " + nome + ", idade: " + idade + ", disciplina: " + disciplina);
    }

    double calcularSalarioAnual() {
        return salario * 12;
    }
}
