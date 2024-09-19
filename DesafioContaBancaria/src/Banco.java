import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int codigo;
    private String nome;
    private List<Conta> listaContas;

    public Banco(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        listaContas = new ArrayList<Conta>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }

    public String toString() {
        return codigo + " - " + nome;
    }

    public void mostraContas(){
        listaContas.stream().forEach(System.out::println);
    }

    public void adicionaConta(){

    };


}
