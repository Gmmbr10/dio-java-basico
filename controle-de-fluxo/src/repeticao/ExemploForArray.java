package repeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = {"Adrian","Eduarda","Giovanne","Lara","Thalita"};

        System.out.println("Lista de alunos:");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        for ( int indice = 0 ; indice < alunos.length ; indice ++ ) {
            System.out.println("O aluno no índice " + indice + " é " + alunos[indice]);
        }
    }
}
