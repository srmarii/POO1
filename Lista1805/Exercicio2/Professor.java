package exercicio2;

class Professor {
    String nome;
    double salarioMensal;
    String disciplina;

    double calcularSalarioAnual() {
        return salarioMensal * 12;
    }
}
