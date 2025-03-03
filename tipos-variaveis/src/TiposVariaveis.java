public class TiposVariaveis {
    public static void main(String [] args) {

        short numeroCurto1 = 3;
        int numeroNormal = numeroCurto1;
        short numeroCurto2 = (short) numeroNormal; // casting

        int numero = 5;

        numero = 10;

        System.out.println(numero); // 10

        final double VALOR_DE_PI = 3.14;

        // VALOR_DE_PI = 10.75 // não pode ser alterado

        System.out.println(VALOR_DE_PI);

        // STRING
        // declarando
        String nome = "Giovanne";
        String sobrenome = "Monteiro";

        // concatenando
        String nomeCompletoJunto = nome.concat(sobrenome);
        // ou
        String nomeCompletoSeparado = nome + " " + sobrenome;

        System.out.println(nomeCompletoJunto);
        System.out.println(nomeCompletoSeparado);

        // principais métodos
        int tamanhoNomeCompleto = nomeCompletoJunto.length(); // tamanho da String

        char letra = nomeCompletoJunto.charAt(0); // retorna o caractere na posição indicada, inicia no 0

        String parteNome = nomeCompletoJunto.substring(0,8); // retorna parte da string, remove parte da string

        String nomeMaiusculo = nome.toUpperCase(); // returna tudo em maiúscula

        String nomeMinusculo = nome.toLowerCase(); // retorna tudo em minúscula

        boolean mesmoNome = nome.equals("Monteiro"); // compara duas strings verificando se é igual ou não

        nome.trim(); // remove os espaços em branco no começo e no fim de uma string;

        String novoNome = nome.replace("va","be"); // substitui as ocorrências daquela parte por outra

        boolean contemLetraA = nome.contains("a"); // verifica se contém determinado conteúdo

        int posicaoLetraN = nome.indexOf("n"); // retorna a posição de determinada string

        String[] nomeCompletoArray = nomeCompletoSeparado.split(" "); // divide a string naquela determinada ocorrência

        boolean nomeVazio = nome.isEmpty(); // retorna se está vazio

        int cep = 12345678;
        String cepTexto = String.valueOf(cep); // converter outro tipo de dado para String

    }
}
