package set.Ordenacao.Alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    public Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        this.alunosSet.add(new Aluno(matricula, nome, media));
    }

    public Aluno removerAlunoPorMatricula(long matricula) {
        Aluno alunoRemovido = null;
        if ( !this.alunosSet.isEmpty() ) {
            for ( Aluno aluno : this.alunosSet ) {
                if ( aluno.getMatricula() == matricula ) {
                    alunoRemovido = aluno;
                    break;
                }
            }
            this.alunosSet.remove(alunoRemovido);
        }
        return alunoRemovido;
    }

    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(this.alunosSet);
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunoNota());
        alunosPorNota.addAll(this.alunosSet);
        return alunosPorNota;
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }

}
