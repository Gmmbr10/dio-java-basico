package repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome: ");
            String nome = input.next();

            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();

            System.out.println("Digite sua altura(coloque ponto no lugar de vírgula): ");
            double altura = input.nextDouble();

            System.out.println("Olá " + nome + ", sua você tem " + idade + " anos e " + altura + "m de altura");
        } catch ( InputMismatchException error ) {
            System.out.println("Os campos idade e altura devem ser númericos.");
        }
    }
}
