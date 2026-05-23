package exercicio15;

class Computador extends Produto {
    int memoriaRAM;
    String processador;
    String placaVideo;

    void apresentar() {
        System.out.println("\nComputador: " + nome + " - Preço: R$ " + preco);
    }

    void mostrarConfiguracao() {
        System.out.println("Memória RAM: " + memoriaRAM + "GB");
        System.out.println("Processador: " + processador);
        System.out.println("Placa de Vídeo: " + placaVideo);
    }
}
