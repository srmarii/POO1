public class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;
    protected int velocidadeAtual;

    public Veiculo(String marca, String modelo, int ano, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void mostrarDados() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(velocidadeAtual);
    }

    public void acelerar(int valor) {
        velocidadeAtual += valor;
        System.out.println(velocidadeAtual);
    }

    public void frear(int valor) {
        velocidadeAtual -= valor;
        System.out.println(velocidadeAtual);
    }
}