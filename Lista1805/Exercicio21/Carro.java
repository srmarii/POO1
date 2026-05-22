public class Carro extends Veiculo {

    private int quantidadePortas;
    private boolean cambioAutomatico;

    public Carro(String marca, String modelo, int ano, int velocidadeAtual, int quantidadePortas, boolean cambioAutomatico) {
        super(marca, modelo, ano, velocidadeAtual);
        this.quantidadePortas = quantidadePortas;
        this.cambioAutomatico = cambioAutomatico;
    }

    public void mostrarPortas() {
        System.out.println(quantidadePortas);
    }

    public void verificarCambio() {
        System.out.println(cambioAutomatico);
    }
}