import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main (String [] args) {
        // criando o objeto scanner
        Scanner entradaDados = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = entradaDados.next();

        System.out.println("Digite sua altura: ");
        double altura = entradaDados.nextDouble();

        System.out.println("Digite sua idade: ");
        int idade = entradaDados.nextInt();
    }
}
