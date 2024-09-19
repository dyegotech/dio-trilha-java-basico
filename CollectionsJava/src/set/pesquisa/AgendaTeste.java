package set.pesquisa;

public class AgendaTeste {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Dyego", 123456);
        agenda.adicionarContato("Dyego Oliveira", 1234567);
        agenda.adicionarContato("Dyego", 1234568);
        agenda.adicionarContato("Maria", 1234568);

        agenda.exibirContatos();

            System.out.println("\n**********");
        
        AgendaContatos agenda2 = new AgendaContatos();

        System.out.println(agenda.pesquisarPorNome("Dyego"));

        agenda.atualizarNumeroContato("Dyego Oliveira", 11);

        System.out.println("\n**********");

        agenda.exibirContatos();

    }   
}
