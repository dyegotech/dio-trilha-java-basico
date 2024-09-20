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
        System.out.println(listaContas);
    }

    public void adicionaConta(Conta c){
        listaContas.add(c);
    };

    public Conta verificaConta(int numero, int agencia){
        Conta c = null;

        for (Conta cc : listaContas){
            if(cc.getAgencia() == agencia && cc.getNumero() == numero){
                c = cc;
                break;
            }
        }

        return c;
    }

}
