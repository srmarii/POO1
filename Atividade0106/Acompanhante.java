public class Acompanhante extends Pessoa {

    public Acompanhante(String nome, int idade) {
        super(nome, "", idade);
    }

    @Override
    public void apresentar() {
        System.out.println("Acompanhante: " + nome + " | Idade: " + idade);
    }
}