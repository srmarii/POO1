class Vendedor extends Funcionario {
    double vendasMes;
    double comissao;

    double calcularComissao() {
        return vendasMes * (comissao / 100);
    }

    void mostrarSalarioFinal() {
        double valorComissao = calcularComissao();
        double salarioFinal = salario + valorComissao;
        System.out.println("\nVendedor: " + nome);
        System.out.println("Salário base: R$ " + salario);
        System.out.println("Vendas do mês: R$ " + vendasMes);
        System.out.println("Comissão (" + comissao + "%): R$ " + valorComissao);
        System.out.println("Salário final: R$ " + salarioFinal);
    }
}
