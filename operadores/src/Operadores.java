public class Operadores {

    public static void main (String [] args) {
        // aritmético
        int soma = 1 + 1;

        System.out.println(soma);

        int subtracao = 2 - 1;

        System.out.println(subtracao);

        int divisao = 4 / 2;

        System.out.println(divisao);

        int multiplicacao = 2 * 2;

        System.out.println(multiplicacao);

        int modulo = 9 % 2;

        System.out.println(modulo);

        // com string
        String concatenacao = "concatenação";

        concatenacao = 1+1+1+"1"; // soma enquanto não encontrar a string

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1; // depois de encontrar uma string ele concatena

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); // quando se tem a expressão, primeiro realiza ela, para depois realizar a concatenação

        System.out.println(concatenacao);

        // unário
        int numero = 5;

        int numeroNegativo = - numero;
        // deixando o valor negativo

        System.out.println(numeroNegativo);
        System.out.println(numero);

        int numeroPositivo = numeroNegativo * - 1;
        // deixando o valor positivo

        System.out.println(numeroPositivo);

        numero++;
        // adicionando 1 ao valor da variável

        numero--;
        // tirando 1 ao valor da variável

        boolean trabalhando = true;

        trabalhando = !trabalhando;
        // inverte o valor booleano, o true vira false e o false vira true

        // ternário
        int a,b;

        a = 5;
        b = 5;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        // relacionais
        int numero1 = 4;
        int numero2 = 10;

        boolean verdadeiroFalso = numero1 == numero2;

        System.out.println("número 1 é igual ao número 2? " + verdadeiroFalso);

        verdadeiroFalso = numero1 != numero2;

        System.out.println("número 1 é diferente do número 2? " + verdadeiroFalso);

        verdadeiroFalso = numero1 > numero2;

        System.out.println("número 1 é maior que o número 2? " + verdadeiroFalso);

        verdadeiroFalso = numero1 >= numero2;

        System.out.println("número 1 é maior ou igual ao número 2? " + verdadeiroFalso);

        verdadeiroFalso = numero1 < numero2;

        System.out.println("número 1 é menor que o número 2? " + verdadeiroFalso);

        verdadeiroFalso = numero1 <= numero2;

        System.out.println("número 1 é menor ou igual ao número 2? " + verdadeiroFalso);

    }

}
