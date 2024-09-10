import list.operacoesBasicas.ListaTarefa;

public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefa lista = new ListaTarefa();

        
        lista.adicionarTarefa("Limpar ventilador");
        lista.adicionarTarefa("Limpar ventilador");
        lista.adicionarTarefa("Limpar ventilador");
        lista.adicionarTarefa("Limpar ventilador");
        lista.adicionarTarefa("Limpar escada");
        
        lista.obterDescricoes();
        System.out.println(lista.obterNumeroTarefas());

        lista.removerTarefa("Limpar Ventilador");
        lista.obterDescricoes();
        System.out.println(lista.obterNumeroTarefas());
        

    }
}
