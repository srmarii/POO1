import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String telefone;
    private String cep;
    private String endereco;
    private String cidade;
    private String estado;
    private ArrayList<PacoteViagem> pacotes;

    public Cliente(String nome, String cpf, int idade, String telefone) {
        super(nome, cpf, idade);
        this.telefone = telefone;
        this.pacotes = new ArrayList<>();
    }

    public void setCep(String cep) { this.cep = cep; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setEstado(String estado) { this.estado = estado; }
    
    public String getCpf() { 
        return this.cpf; 
    }

    public void adicionarPacote(PacoteViagem pacote) {
        pacotes.add(pacote);
    }

    public void listarPacotes() {
        for (int i = 0; i < pacotes.size(); i++) {
            pacotes.get(i).apresentar();
        }
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco + ", " + cidade + " - " + estado + " CEP: " + cep);
    }
}