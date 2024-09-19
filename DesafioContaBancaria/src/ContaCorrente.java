
public class ContaCorrente extends Conta implements IContaCorrente{
    
    private double saldo;
    
    public double getSaldo() {
        return saldo;
    }
    
    public ContaCorrente(Banco banco, int numero, int agencia) {
        super(banco, numero, agencia);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Valor depositado: R$ " + valor);
            mostraSaldo();
        }else{
            System.out.println("O valor não pode ser zero e nem negativo");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() && valor != 0 && valor > 0){
            this.saldo -= valor;
            System.out.println("Valor sacado: R$ " + valor);
            mostraSaldo();
        }else{
            System.out.println("Valor inválido e/ou saldo insuficiente");
        }
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }

    
}
