package set.Ordenacao.Alunos;

import java.util.Comparator;
import java.util.Objects;
import java.lang.Comparable;

public class Aluno implements Comparable<Aluno> {
    private long matricula;
    private String nome;
    private double media;

    public Aluno(long matricula, String nome, double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.getNome().compareToIgnoreCase(aluno.getNome());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", media=" + media +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}

class ComparatorAlunoNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getMedia(),aluno2.getMedia());
    }
}