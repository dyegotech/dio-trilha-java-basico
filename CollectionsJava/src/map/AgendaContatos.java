package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionaContato(String nome, int numero) {
        this.agendaContatosMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisaPorNome(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            return agendaContatosMap.get(nome);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionaContato("dyego", 123);
        agenda.adicionaContato("maria", 456);
        agenda.adicionaContato("dyego", 789);
        agenda.adicionaContato("Júlia", 147);

        agenda.exibirContatos();

        agenda.removerContato("dyego");

        agenda.exibirContatos();

    }
}