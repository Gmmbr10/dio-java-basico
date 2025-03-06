package condicionais;

public class CaixaEletronico {

    /**
     * <h1>Demonstração de condicional simples</h1>
     *
     * <p>Neste programa temos o exemplo de uma condicional simples.</p>
     *
     * <p>Este tipo de condicional funciona da seguinte forma:</p>
     * <p>A condição é verdadeira? Se sim executa, se não continua o código.</p>
     * */

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);

    }

}
