import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno("Mariana", 20, "123.456.789-00", 101, 8.5, 7.0);
        
        aluno.apresentar();
        aluno.mostrarCpf();
        System.out.println(aluno.calcularMedia());
        aluno.mostrarSituacao();

        Professor professor = new Professor("Carlos", 40, "987.654.321-00", "Matemática", 3500, 40);

        professor.apresentar();
        professor.mostrarCpf();
        System.out.println(professor.calcularSalarioAnual());

        sc.close();
    }
}