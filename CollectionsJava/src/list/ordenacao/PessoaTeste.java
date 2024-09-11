package list.ordenacao;

public class PessoaTeste {
    public static void main(String[] args) {
        OrdenacaoPessoa o = new OrdenacaoPessoa();

        o.adicionarPessoa("Dyego", 28, 1.6);
        o.adicionarPessoa("Maria", 32, 1.71);
        o.adicionarPessoa("José", 35, 1.59);
        o.adicionarPessoa("João", 27, 1.75);
        o.adicionarPessoa("Júlia", 29, 1.93);

        System.out.println(o.ordenaPorAltura());

        System.out.println("\n");  

        System.out.println(o.ordenaPorIdade());

        System.out.println(o.listaPessoa);
    }
}
