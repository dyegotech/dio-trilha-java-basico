package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> conjuntoProdutos;

    public CadastroProdutos() {
       this.conjuntoProdutos = new HashSet<>();
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade ){
        conjuntoProdutos.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> listaPorNome = new TreeSet<>(conjuntoProdutos); // Recebe a lista original como parâmetro e ordena por nome, pois utiliza o método CompareTo da classe Produto.
        return listaPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> listaPorPreco = new TreeSet<>(new ComparatorPorPreco());
        listaPorPreco.addAll(conjuntoProdutos);
        return listaPorPreco;
    }

    @Override
    public String toString() {
        return "\nCadastroProdutos [conjuntoProdutos=" + conjuntoProdutos + "]";
    }  

    
}
