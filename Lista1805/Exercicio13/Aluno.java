class Aluno extends Pessoa {
    String matricula;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void mostrarSituacao() {
        double media = calcularMedia();
        System.out.println("\nAluno: " + nome + " - Matrícula: " + matricula);
        System.out.println("Nota 1: " + nota1 + " - Nota 2: " + nota2);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
