public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Idade: " + idade);
    }
}