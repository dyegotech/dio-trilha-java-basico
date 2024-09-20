package set;

public class ConvidadosTeste_ {
    public static void main(String[] args) {
        ConjuntoConvidados_ conjunto = new ConjuntoConvidados_();

        System.out.println(conjunto.contarConvidados());

        conjunto.adicionarConvidado("Dy", 10);
        conjunto.adicionarConvidado("Dye", 10);
        conjunto.adicionarConvidado("Dye", 12);

        System.out.println(conjunto.contarConvidados());

        conjunto.exibirConvidados();

        conjunto.removerConvidadoPorCodigo(10);
        conjunto.exibirConvidados();

    }
}
