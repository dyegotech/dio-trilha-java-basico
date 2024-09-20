public class App {
    public static void main(String[] args) throws Exception {
        Banco bb = new Banco(1, "Banco do Brasil");
        // System.out.println(bb);
        Cliente cliente1 = new Cliente("Dyego", "028.773.892-27");

        ContaCorrente cc = new ContaCorrente(bb, cliente1, 1);
        ContaPupanca cp = new ContaPupanca(bb, cliente1, 1);
        // System.out.println(c);

        // System.out.println("******************\n");

        // c.mostraSaldo();

        // c.depositar(10);

        // c.sacar(10.0);

        Banco n = new Banco(2, "Nubank");

        Conta ca = new ContaCorrente(n, cliente1, 3);

        System.out.println("Contas do banco: ");
        bb.adicionaConta(cc);
        bb.adicionaConta(cp);
        bb.mostraContas();

        System.out.println("\nConta Corrente:\n");
        cc.depositar(10);
        cc.mostraSaldo();
        cc.sacar(5);
        cc.mostraSaldo();

        System.out.println("\nConta Poupança:\n");
        cp.mostraSaldo();
        cp.depositar(999);
        cp.mostraSaldo();
        cp.sacar(999);
        cp.mostraSaldo();
        cp.depositar(50);
        cp.mostraSaldo();
        cp.sacar(1000);
        cp.mostraSaldo();
        cp.render();
        cp.mostraSaldo();

        System.out.println("\nTransferir");
        cc.transferir(cp, 4.9);

    }
}
