package set;

public class ConvidadosTeste {
    public static void main(String[] args) {
        ConjuntoConvidados lista = new ConjuntoConvidados();

        lista.adicionarConvidado("Dyego", 123);
        
        lista.exibirConvidados();

        lista.removerConvidadoPorCodigo(123);
        lista.adicionarConvidado("Oliver", 123);

        System.out.println(lista.contarConvidados());
        lista.exibirConvidados();
    }
    
}
