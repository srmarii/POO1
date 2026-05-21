class Aluno extends Pessoa {
    String matricula;
    double nota1;
    double nota2;

    void apresentar() {
        System.out.println("\nOlá, meu nome é " + nome + ", tenho " + idade + " anos e minha matrícula é " + matricula + ".");
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}
