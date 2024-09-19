package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados() {
        conjuntoConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        conjuntoConvidados.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigo(int codigo) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : conjuntoConvidados) {
            if (c.getCodigo() == codigo) {
                convidadoParaRemover = c;
                break;
            }
        }
        conjuntoConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return conjuntoConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(conjuntoConvidados);
    }
}
