package exercicio18;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void mostrarCpf() {
        System.out.println("CPF: " + cpf);
    }
}