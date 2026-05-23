package exercicio21;

public class Moto extends Veiculo {

    private int cilindradas;
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, int velocidadeAtual, int cilindradas, boolean partidaEletrica) {
        super(marca, modelo, ano, velocidadeAtual);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
    }

    public void mostrarCilindradas() {
        System.out.println(cilindradas);
    }

    public void verificarPartida() {
        System.out.println(partidaEletrica);
    }
}