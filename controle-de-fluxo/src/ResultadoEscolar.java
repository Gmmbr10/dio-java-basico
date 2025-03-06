public class ResultadoEscolar {

    /**
     * <h1>Demonstração de condicional composta</h1>
     *
     * <p>Neste sistema temos um exemplo de condicional composta.</p>
     *
     * <p>Este tipo de condicional funciona da seguinte forma:</p>
     * <p>A condição é verdadeira? Se sim executa, se não executa outro código.</p>
     * */

    /*public static void main(String[] args) {

        int nota = 6;

        if ( nota >= 7 ) {
            // verdadeiro
            System.out.println("Aprovado");
        } else {
            // falso
            System.out.println("Reprovado");
        }

    }*/

    /**
     * <h1>Demonstração de condicional encadeada</h1>
     *
     * <p>Neste sistema temos um exemplo de condicional encadeada.</p>
     *
     * <p>Este tipo de condicional funciona da seguinte forma:</p>
     * <p>A condição é verdadeira? Se sim executa, se não verifica essa outra condição e assim em diante.</p>
     * */

    /*public static void main(String[] args) {

        int nota = 6;

        if ( nota >= 7 ) {
            // verdadeiro
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            // apenas a segunda afirmação é verdadeira
            System.out.println("Recuperação");
        } else {
            // falso
            System.out.println("Reprovado");
        }

    }*/

    /**
     * <h1>Demonstração de condicional com operador ternário</h1>
     *
     * <p>Neste sistema temos um exemplo de condicional usando operador ternário.</p>
     *
     * <p>Este tipo de condicional funciona na mesma maneira que a condicional composta ou encadeada</p>
     * */

    public static void main(String[] args) {
        int nota = 6;
//        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado" ;

        System.out.println(resultado);
    }

}
