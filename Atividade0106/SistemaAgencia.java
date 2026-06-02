import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAgencia {
    private ArrayList<Cliente> clientes;
    private Scanner scanner;

    public SistemaAgencia() {
        clientes = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void cadastrarCliente() {
        System.out.print("\nNome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        
        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, idade, telefone);

        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        cliente.setCep(cep);

        CepService cepService = new CepService();
        String dadosCep = cepService.consultarCep(cep);
        System.out.println(dadosCep);

        System.out.print("\nRua: ");
        cliente.setEndereco(scanner.nextLine());
        System.out.print("Cidade: ");
        cliente.setCidade(scanner.nextLine());
        System.out.print("Estado: ");
        cliente.setEstado(scanner.nextLine());

        clientes.add(cliente);
        System.out.println("\nCliente cadastrado.");
    }

    public void cadastrarPacote() {
        System.out.print("\nCPF do cliente: ");
        String cpf = scanner.nextLine();

        Cliente cliente = null;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(cpf)) {
                cliente = clientes.get(i);
            }
        }

        if (cliente == null) {
            System.out.println("\nNao encontrado.");
            return;
        }

        System.out.print("\nDestino: ");
        String destino = scanner.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String dataInicio = scanner.nextLine();
        System.out.print("Duracao (7, 15 ou 30): ");
        int duracao = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Internacional (1-Sim, 2-Nao): ");
        boolean intl = scanner.nextLine().equals("1");

        PacoteViagem pacote = new PacoteViagem(cliente, destino, dataInicio, duracao, intl);

        ClimaService climaService = new ClimaService();
        double temp = climaService.consultarTemperatura(destino);
        pacote.setTemperatura(temp);

        System.out.print("Acompanhantes (max 4): ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        if (qtd > 4) {
            qtd = 4;
        }

        for (int i = 0; i < qtd; i++) {
            System.out.print("Nome: ");
            String n = scanner.nextLine();
            System.out.print("Idade: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            pacote.adicionarAcompanhante(new Acompanhante(n, id));
        }

        cliente.adicionarPacote(pacote);
        System.out.println("\nPacote salvo.");
    }

    public void listarClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            clientes.get(i).apresentar();
            System.out.println("-----");
        }
    }

    public void listarPacotesCliente() {
        System.out.print("\nCPF do cliente: ");
        String cpf = scanner.nextLine();
        
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(cpf)) {
                clientes.get(i).listarPacotes();
                return;
            }
        }
        System.out.println("\nNao encontrado.");
    }
}