
public class ContaCorrente extends Conta implements IContaCorrente {

    public ContaCorrente(Banco banco, Cliente cliente, int agencia) {
        super(banco, cliente, agencia, "Conta Corrente");
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {

        if (this.getBanco().verificaConta(contaDestino.getNumero(), contaDestino.getAgencia()) != null) {
            System.out.println("Conta origem: " + this);
            System.out.println("Valor a ser transferido: R$ " + valor);

            if (valor > 0 && valor <= super.getSaldo()) {
                this.sacar(valor);
                contaDestino.depositar(valor, 'T');
                System.out.println("Saldo atual: R$ " + this.getSaldo());
                System.out.println("\n*************");
                System.out.println("Conta destino: " + contaDestino);
            }else{
                System.out.println("Valor inválido e/ou saldo insuficiente ");
            }

        } else {
            System.out.println("A conta informada não existe");
        }

    }

    @Override
    public void extrato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'extrato'");
    }

}
