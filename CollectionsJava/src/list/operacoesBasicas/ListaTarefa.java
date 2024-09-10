package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaLista;

    public ListaTarefa() {
        this.tarefaLista = new ArrayList<>();
    }    
    
    // Recebe a descrição da tarefa que instanciará a tarefa para só então inserir na lista
    public void adicionarTarefa(String descricao){
        this.tarefaLista.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaLista){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        this.tarefaLista.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTarefas(){
        return tarefaLista.size();
    }

    public void obterDescricoes(){
        System.out.println(tarefaLista);
    }
}
