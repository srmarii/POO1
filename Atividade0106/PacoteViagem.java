import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PacoteViagem {
    private Cliente cliente;
    private String destino;
    private String dataInicio;
    private String dataFim;
    private int duracaoDias;
    private boolean internacional;
    private double temperatura;
    private ArrayList<Acompanhante> acompanhantes;

    public PacoteViagem(Cliente cliente, String destino, String dataInicio, int duracaoDias, boolean internacional) {
        this.cliente = cliente;
        this.destino = destino;
        this.dataInicio = dataInicio;
        this.duracaoDias = duracaoDias;
        this.internacional = internacional;
        this.acompanhantes = new ArrayList<>();
        calcularDataFim();
    }

    private void calcularDataFim() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate inicio = LocalDate.parse(dataInicio, formatter);
            this.dataFim = inicio.plusDays(duracaoDias).format(formatter);
        } catch (Exception e) {
            this.dataFim = "Data invalida";
        }
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void adicionarAcompanhante(Acompanhante a) {
        if (acompanhantes.size() < 4) {
            acompanhantes.add(a);
        } else {
            System.out.println("Limite maximo atingido.");
        }
    }

    public double calcularValor() {
        int totalPessoas = 1 + acompanhantes.size();
        double valorPassagens = 300 * totalPessoas;
        double desconto = 0;

        if (totalPessoas == 3) {
            desconto = valorPassagens * 0.10;
        } else if (totalPessoas == 4) {
            desconto = valorPassagens * 0.20;
        } else if (totalPessoas == 5) {
            desconto = valorPassagens * 0.30;
        }

        double valorComDesconto = valorPassagens - desconto;
        double taxaAdministrativa = 0;

        if (internacional) {
            taxaAdministrativa = 1000 * 1.6;
        } else {
            taxaAdministrativa = 1000 * 1.2;
        }

        double taxaAeroporto = 400;

        return valorComDesconto + taxaAdministrativa + taxaAeroporto;
    }

    public String gerarAvisoClima() {
        if (temperatura < 0) {
            return "Alerta: destino muito frio. Recomenda-se levar roupas termicas.";
        } else if (temperatura >= 0 && temperatura <= 10) {
            return "Aviso: destino frio. Recomenda-se levar casacos.";
        } else if (temperatura > 10 && temperatura <= 20) {
            return "Aviso: clima ameno. Recomenda-se levar roupas leves e uma blusa.";
        } else {
            return "Aviso: destino quente. Recomenda-se levar roupas leves.";
        }
    }

    public void apresentar() {
        System.out.println("Destino: " + destino);
        System.out.println("Data: " + dataInicio + " ate " + dataFim + " (" + duracaoDias + " dias)");
        System.out.println("Temperatura: " + temperatura + " graus");
        System.out.println(gerarAvisoClima());
        System.out.println("Total de pessoas: " + (1 + acompanhantes.size()));
        System.out.println("Valor Final do Pacote: USD " + calcularValor());
        
        for (int i = 0; i < acompanhantes.size(); i++) {
            acompanhantes.get(i).apresentar();
        }
    }
}