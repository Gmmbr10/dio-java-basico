package map.Ordenacao.LivrariaOnline;

import java.util.*;

public class LivrariaOnline {
    private Map<String,Livro> livrosDisponiveis;

    public LivrariaOnline() {
        this.livrosDisponiveis = new HashMap<>();
    }

    public void adicionarLivro ( String link, String titulo, String autor, double preco ) {
        this.livrosDisponiveis.put(link,new Livro(titulo, autor, preco));
    }

    public void removerLivro ( String titulo ) {
        if ( !this.livrosDisponiveis.isEmpty() ) {
            Set<String> links = new HashSet<>();
            for (Map.Entry<String,Livro> entry : this.livrosDisponiveis.entrySet()) {
                if ( entry.getValue().getTitulo().equalsIgnoreCase( titulo ) ) {
                    links.add(entry.getKey());
                }
            }
            if ( !links.isEmpty() ) {
                for ( String link : links ) {
                    this.livrosDisponiveis.remove(link);
                }
            }
        }
    }

    public Map<String,Livro> exibirLivrosOrdenadosPorPreco() {

        if ( this.livrosDisponiveis.isEmpty() ) {
            return null;
        }

        List<Map.Entry<String,Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(this.livrosDisponiveis.entrySet());

        Collections.sort( livrosParaOrdenarPorPreco , new ComparatorLivroPorPreco() );

        /*
         * HashMap<>()
         *   organiza com base nas keys
         *
         * LinkedHashMap<>()
         *   organiza com base na ordem inserida
         * */

        Map<String,Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for ( Map.Entry<String,Livro> entry : livrosParaOrdenarPorPreco ) {
            livrosOrdenadosPorPreco.put(entry.getKey(),entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String,Livro> exibirLivrosOrdenadosPorAutor() {

        if ( this.livrosDisponiveis.isEmpty() ) {
            return null;
        }

        List<Map.Entry<String,Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(this.livrosDisponiveis.entrySet());

        Collections.sort( livrosParaOrdenarPorAutor , new ComparatorLivroPorAutor() );

        Map<String,Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
        for ( Map.Entry<String,Livro> entry : livrosParaOrdenarPorAutor ) {
            livrosOrdenadosPorAutor.put(entry.getKey(),entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public Map<String,Livro> exibirLivrosOrdenadosPorTitulo() {
        if ( this.livrosDisponiveis.isEmpty() ) {
            return null;
        }

        List<Map.Entry<String,Livro>> livrosParaOrdenarPorTitulo = new ArrayList<>(this.livrosDisponiveis.entrySet());

        Collections.sort( livrosParaOrdenarPorTitulo , new ComparatorLivroPorTitulo() );
        Map<String,Livro> livrosOrdenadosPorTitulo = new LinkedHashMap<>();
        for ( Map.Entry<String,Livro> entry : livrosParaOrdenarPorTitulo ) {
            livrosOrdenadosPorTitulo.put(entry.getKey(),entry.getValue());
        }

        return livrosOrdenadosPorTitulo;
    }

    public Map<String,Livro> pesquisarLivrosPorAutor(String autor) {
        if ( this.livrosDisponiveis.isEmpty() ) {
            return null;
        }

        Map<String,Livro> livrosPorAutor = new HashMap<>();

        for ( Map.Entry<String,Livro> entry : this.livrosDisponiveis.entrySet() ) {
            if ( entry.getValue().getAutor().equalsIgnoreCase(autor) ) {
                livrosPorAutor.put(entry.getKey(),entry.getValue());
            }
        }

        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        if ( this.livrosDisponiveis.isEmpty() ) {
            return null;
        }

        Livro livroMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;

        for ( Livro livro : this.livrosDisponiveis.values() ) {
            if ( livro.getPreco() > maiorValor ) {
                maiorValor = livro.getPreco();
                livroMaisCaro = livro;
            }
        }

        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        if ( this.livrosDisponiveis.isEmpty() ) {
            return null;
        }

        Livro livroMaisBarato = null;
        double menorValor = Double.MAX_VALUE;

        for ( Livro livro : this.livrosDisponiveis.values() ) {
            if ( livro.getPreco() < menorValor ) {
                menorValor = livro.getPreco();
                livroMaisBarato = livro;
            }
        }

        return livroMaisBarato;
    }

    public void exibirLivros() {
        System.out.println(this.livrosDisponiveis);
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        livrariaOnline.exibirLivros();

    }
}
