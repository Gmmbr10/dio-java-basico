package list.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> carrinhoCompras;

    public CarrinhoCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.carrinhoCompras.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome) {
        if ( carrinhoCompras.isEmpty() ) {
            System.out.println("A lista está vazia");
            return;
        }
        List<Item> removerCarrinho = new ArrayList<>();
        for ( Item produto : carrinhoCompras ) {
            if ( produto.getNome().equalsIgnoreCase(nome) ) {removerCarrinho.add(produto);}
        }
        carrinhoCompras.removeAll(removerCarrinho);
    }

    public void exibirItens() {
        if ( carrinhoCompras.isEmpty() ) {
            System.out.println("A lista está vazia");
            return;
        }
        System.out.println(carrinhoCompras);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if ( !carrinhoCompras.isEmpty() ) {
            for ( Item produto : carrinhoCompras ) {
                valorTotal = valorTotal + ( produto.getPreco() * produto.getQuantidade() );
            }
        }
        return valorTotal;
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        // Adicionando itens ao carrinho
        carrinhoCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());
    }
}
