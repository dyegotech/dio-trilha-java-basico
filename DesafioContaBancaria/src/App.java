public class App {
    public static void main(String[] args) throws Exception {
        Banco bb = new Banco(1, "Banco do Brasil");
        System.out.println(bb);

        ContaCorrente c = new ContaCorrente(bb, 23582, 1253280);
        System.out.println(c);

        System.out.println("******************\n");

        c.mostraSaldo();

        c.depositar(10);

        c.sacar(10.0);

        
    }
}
