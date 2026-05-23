package exercicio18;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;
    private int cargaHoraria;

    public Professor(String nome, int idade, String cpf, String disciplina, double salario, int cargaHoraria) {
        super(nome, idade, cpf);
        this.disciplina = disciplina;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    @Override
    public void apresentar() {
        System.out.println("Professor: " + nome);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }
}