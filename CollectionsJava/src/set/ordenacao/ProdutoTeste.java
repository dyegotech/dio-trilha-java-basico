package set.ordenacao;

public class ProdutoTeste {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarProduto(1, "Caderno", 25.99, 2);
        produtos.adicionarProduto(2, "Borracha", 12.99, 3);
        produtos.adicionarProduto(3, "Lápis", 3.99, 1);
        produtos.adicionarProduto(4, "Apontador", 2.99, 7);
        produtos.adicionarProduto(5, "Pincel", 5.99, 8);

        System.out.println(produtos);
        
        System.out.println(produtos.exibirPorPreco());

        System.out.println(produtos.exibirProdutoPorNome());

}
}