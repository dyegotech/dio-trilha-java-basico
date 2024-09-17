package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double valorTotalEstoque() {
        double valorTotal = 0;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }
}

class EstoqueProdutosTeste {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();


        estoqueProdutos.adicionarProduto(1L, "Caderno", 2, 10.99);

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(2L, "Livro", 3, 9.99);
        estoqueProdutos.adicionarProduto(3L, "Mochila", 1, 105.99);
        estoqueProdutos.adicionarProduto(4L, "Lápis", 5, 1.99);

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.valorTotalEstoque());

        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

    }
}
