import java.util.Scanner;
public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] alunos = {"Adrian","Eduarda","Giovanne","Lara","Thalita"};

        double media = calcularMediaDaTurma(alunos,input);

        System.out.println("Média da turma é: " + media);
    }

    private static double calcularMediaDaTurma(String[] alunos, Scanner input) {
        double soma = 0;

        for (String aluno : alunos) {
            System.out.println("Nota do aluno " + aluno + " é: ");
            double nota = input.nextDouble();
            soma = soma + nota;
        }

        return soma / alunos.length;
    }
}
