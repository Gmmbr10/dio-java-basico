package list.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) { this.listaNumeros.add(numero); }

    public List<Integer> ordenarAscendente() {
        if ( this.listaNumeros.isEmpty() ) {
            return null;
        }
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        if ( this.listaNumeros.isEmpty() ) {
            return null;
        }
        List<Integer> numerosDescendente = new ArrayList<>(this.listaNumeros);
        numerosDescendente.sort(Collections.reverseOrder());
        return numerosDescendente;
    }

    public void exibirNumeros() {
        if ( this.listaNumeros.isEmpty() ) {
            System.out.println("A lista está vazia");
            return;
        }
        System.out.println(this.listaNumeros);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
