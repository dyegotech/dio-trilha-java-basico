package map;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap = null;

    public AgendaEventos() {
        agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        this.agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    // O TreeMap já ordena o map pela data, pois o LocalDate implementa um
    // Comparable
    public void exibirAgendaPorData() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public void exibir() {
        System.out.println(agendaEventosMap);
    }

    public void proximoEvento(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEventosMap);
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataAnalisada = null;
        Evento proximoEvento = null;

        for (Map.Entry<LocalDate,Evento> entry: eventoTreeMap.entrySet()){
            dataAnalisada = entry.getKey();
            
            if(dataAnalisada.equals(dataAtual) || dataAnalisada.isAfter(dataAtual)){
                proximoEvento = entry.getValue();
                System.out.println("Proximo evento: " + proximoEvento + " em: " + dataAnalisada);
                break;
            }
        }


    }

}

class AgendaEventosTeste {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.now().plusDays(50), "Rock n rio", "Show");
        agendaEventos.adicionarEvento(LocalDate.now().plusDays(5), "Rock n rio2",
        "Show");
        agendaEventos.adicionarEvento(LocalDate.now().plusDays(2), "Rock n rio3",
        "Show");
        agendaEventos.adicionarEvento(LocalDate.now().plusDays(1), "Rock n rio4",
        "Show");
        
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.APRIL, 15), "Guns n roses",
        "Show");


        agendaEventos.exibirAgendaPorData();

        // System.out.println(agendaEventos);
        agendaEventos.exibir();

        agendaEventos.proximoEvento();
    }
}