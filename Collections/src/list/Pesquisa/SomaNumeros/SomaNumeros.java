package list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int somaTotal = 0;
        if ( !this.listaNumeros.isEmpty() ) {
            for ( int numero : this.listaNumeros ) { somaTotal = somaTotal + numero; }
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if ( !this.listaNumeros.isEmpty() ) {
            for ( Integer numero : this.listaNumeros ) {
                if ( numero > maiorNumero ) { maiorNumero = numero; }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 0;
        if ( !this.listaNumeros.isEmpty() ) {
            for ( Integer numero : this.listaNumeros ) {
                if ( numero < menorNumero ) { menorNumero = numero; }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if ( this.listaNumeros.isEmpty() ) {
            System.out.println("A lista está vazia");
            return;
        }
        System.out.println(this.listaNumeros);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
