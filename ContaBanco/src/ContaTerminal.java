import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
                
        int numero;
        String agencia;
        String nome;
        float saldo;

        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        agencia = s.nextLine();
        
        System.out.print("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(s.nextLine());
        
        System.out.print("Por favor, digite seu nome: ");
        nome = s.nextLine();
        
        System.out.print("Por favor, digite seu saldo: ");
        saldo = Float.parseFloat(s.nextLine());

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, " +  
        "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", nome, agencia, numero, saldo);

        s.close();
    }
}
