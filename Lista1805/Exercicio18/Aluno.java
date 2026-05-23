package exercicio18;

public class Aluno extends Pessoa {
    private int matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int idade, String cpf, int matricula, double nota1, double nota2) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void mostrarSituacao() {
        double media = calcularMedia();

        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
