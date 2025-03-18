package map.Ordenacao.LivrariaOnline;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}

class ComparatorLivroPorPreco implements Comparator<Map.Entry<String,Livro>> {
    @Override
    public int compare(Map.Entry<String,Livro> entry1, Map.Entry<String,Livro> entry2 ) {
        return Double.compare(entry1.getValue().getPreco(), entry2.getValue().getPreco());
    }
}

class ComparatorLivroPorAutor implements Comparator<Map.Entry<String,Livro>> {
    @Override
    public int compare(Map.Entry<String,Livro> entry1, Map.Entry<String,Livro> entry2 ) {
        return entry1.getValue().getAutor().compareToIgnoreCase(entry2.getValue().getAutor());
    }
}

class ComparatorLivroPorTitulo implements Comparator<Map.Entry<String,Livro>> {
    @Override
    public int compare(Map.Entry<String,Livro> entry1, Map.Entry<String,Livro> entry2 ) {
        return entry1.getValue().getTitulo().compareToIgnoreCase(entry2.getValue().getTitulo());
    }
}