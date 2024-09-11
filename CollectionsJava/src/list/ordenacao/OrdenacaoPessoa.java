package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    public List<Pessoa> listaPessoa;

    public OrdenacaoPessoa(){
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.listaPessoa.add(new Pessoa(nome, altura, idade));
    }

    public List<Pessoa> ordenaPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoa); // Faz uma cópia da lista original
        Collections.sort(pessoasPorIdade); // Ordena a lista. Implicitamente, o método sabe que será usada a interface comparable, usando o método CompareTo

        return pessoasPorIdade;
    }
    
    public List<Pessoa> ordenaPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); // Deve passar o Comparator, caso contrário, ele utilizará o Comparable

        return pessoasPorAltura;
    }
}
