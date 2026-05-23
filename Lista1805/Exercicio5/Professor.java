package exercicio5;

class Professor {
    String nome;
    int idade;
    String disciplina;
    double salario;

    void apresentar() {
        System.out.println("\nNome: " + nome + ", idade: " + idade + ", disciplina: " + disciplina);
    }

    double calcularSalarioAnual() {
        return salario * 12;
    }
}
