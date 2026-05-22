class AlunoAcademia extends Pessoa {
    double peso;
    double altura;
    String objetivo;

    double calcularIMC() {
        return peso / (altura * altura);
    }

    void apresentar() {
        System.out.println("\nAluno: " + nome + " - Idade: " + idade);
        System.out.println("Peso: " + peso + "kg - Altura: " + altura + "m");
        System.out.println("Objetivo: " + objetivo);
        System.out.println("IMC: " + calcularIMC());
    }
}
