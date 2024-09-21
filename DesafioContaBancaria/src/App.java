import banco.Banco;
import banco.Cliente;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Banco bb = new Banco(1, "Banco do Brasil");
        // System.out.println(bb);

        Cliente cliente1 = new Cliente("Dyego", "123.456.789-10");
        // System.out.println(cliente1);

        /* Teste da conta corrente */

        ContaCorrente cc = new ContaCorrente(bb, cliente1);
        System.out.println(cc);
        
        cc.extrato();
        System.out.println("Cheque especial R$ " + cc.getLimiteChequeEspecial());
        // cc.depositar(1000);
        // cc.extrato();
        cc.sacar(500);
        cc.extrato();
        System.out.println("Cheque especial R$ " + cc.getLimiteChequeEspecial());
        
        cc.sacar(200);
        cc.extrato();
        System.out.println("Cheque especial R$ " + cc.getLimiteChequeEspecial());

        cc.sacar(200);
        cc.extrato();
        System.out.println("Cheque especial R$ " + cc.getLimiteChequeEspecial());

        cc.sacar(200);
        cc.extrato();
        System.out.println("Cheque especial R$ " + cc.getLimiteChequeEspecial());
        
        // cc.sacar(700);
        // cc.extrato();
        // System.out.println("Cheque especial R$ " + cc.getLimiteChequeEspecial());

        /* Teste da conta poupança */

        ContaPoupanca cp = new ContaPoupanca(bb, cliente1, 1);
        // System.out.println(cp);
        
        // cp.depositar(95);
        // cp.extrato();
        // System.out.println(cp);
        
        // cp.depositar(100);
        // cp.extrato();
        // System.out.println(cp);
        
        /* Contas do banco */
        
        // System.out.println("\nContas do banco: \n");
        // bb.mostraContas();
        
        /* Teste de transferência entre contas */

        // cc.transferir(cp, 10);
        // cc.extrato();
        // cp.extrato();
        

    }
}
