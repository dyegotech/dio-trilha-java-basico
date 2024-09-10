import list.operacoesBasicas.ListaTarefa;
import list.pesquisa.CatalogoLivros;

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
        
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Clean Code em java", "José da Silva", 2015);
        catalogo.adicionarLivro("Java para Iniciantes", "Marcos Oliveira", 2020);

        catalogo.obterLivros();

        System.out.println(catalogo.buscarPorAutor("José da silva"));
        
        System.out.println(catalogo.buscarPorIntervaloDeAno(2021,2030));
        
        // System.out.println(catalogo.buscarPorTitulo("java"));
        System.out.println(catalogo.buscarTodosPorTitulo("java"));

    }
}
