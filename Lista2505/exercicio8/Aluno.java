package exercicio8;

class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void apresentar() {
        System.out.println("Nome: " + nome + " | Media: " + calcularMedia());
    }
}
