package map.Pesquisa.Palavras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContagemPalavras {
    private Map<String,Integer> palavrasRepetidas;

    public ContagemPalavras() {
        this.palavrasRepetidas = new HashMap<>();
    }

    public void adicionarPalavra ( String palavra, Integer contagem ) {
        this.palavrasRepetidas.put(palavra,contagem);
    }

    public void removerPalavra ( String palavra ) {
        if ( !this.palavrasRepetidas.isEmpty() ) {
            this.palavrasRepetidas.remove(palavra);
        }
    }

    public Map<String, Integer> exibirContagemPalavras () {
        return this.palavrasRepetidas;
    }

    public List<String> encontrarPalavraMaisFrequente () {
        List<String> palavrasMaisFrequentes = new ArrayList<>();
        Integer quantidadeRepetida = Integer.MIN_VALUE;
        if ( !this.palavrasRepetidas.isEmpty() ) {
            for ( Map.Entry<String,Integer> entry : this.palavrasRepetidas.entrySet() ) {
                if ( entry.getValue() == quantidadeRepetida ) {
                    palavrasMaisFrequentes.add(entry.getKey());
                } else if ( entry.getValue() > quantidadeRepetida ) {
                    if ( !palavrasMaisFrequentes.isEmpty() ) {
                        palavrasMaisFrequentes.clear();
                    }
                    quantidadeRepetida = entry.getValue();
                    palavrasMaisFrequentes.add(entry.getKey());
                }
            }
        }
        return palavrasMaisFrequentes;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 8);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        List<String> linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
