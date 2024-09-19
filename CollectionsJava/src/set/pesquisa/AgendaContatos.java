package set.pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    private Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        this.conjuntoContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.conjuntoContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(conjuntoContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : conjuntoContatos) {
            if (c.getNome().toLowerCase().startsWith(nome.toLowerCase())) {
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato c : conjuntoContatos){
            if (c.getNome().equals(nome)){
                conjuntoContatos.remove(c);
                adicionarContato(nome, novoNumero);
                break;
            }
        }
    }
}
