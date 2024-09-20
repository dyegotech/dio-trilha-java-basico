package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados_ {
    Set<Convidado_> conjuntoConvidados;

    public ConjuntoConvidados_() {
        conjuntoConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        conjuntoConvidados.add(new Convidado_(nome, codigo));
    }

    public void removerConvidadoPorCodigo(int codigo) {
        Convidado_ convidadoParaRemover = null;

        for (Convidado_ c : conjuntoConvidados) {
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
