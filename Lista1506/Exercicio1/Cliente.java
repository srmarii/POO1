package Exercicio1;

public class Cliente {
    private String nome;
    private int cpf;

    public Cliente(){
        nome = "";
        cpf = 0;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    

}