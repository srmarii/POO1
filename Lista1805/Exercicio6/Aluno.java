package exercicio6;

class Aluno extends Pessoa {
    String matricula;
    double nota1;
    double nota2;

    void apresentar() {
        System.out.println("\nNome: " + nome + ", idade: " + idade + ", matrícula: " + matricula);
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}
