package desafioExtra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> linhas = new ArrayList<>();

        try {
            File arquivo = new File("Lista2505/desafioExtra/dados.txt");
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                linhas.add(leitor.nextLine());
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado.");
            return;
        }

        System.out.println("Conteudo do arquivo:");
        for (int i = 0; i < linhas.size(); i++) {
            System.out.println(linhas.get(i));
        }
    }
}
