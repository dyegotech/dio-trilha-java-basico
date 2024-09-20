public class ContaPupanca extends Conta implements IContaPoupanca {

    private final double taxaJuros = 0.05;

    public ContaPupanca(Banco banco, Cliente cliente, int agencia) {
        super(banco, cliente, agencia, "Poupança");
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    @Override
    public void render() {
        super.saldo += super.saldo * getTaxaJuros();
    }

    @Override
    public void depositar(double valor) {
        if (valor >= 50.0) {
            super.depositar(valor);
        } else {
            System.out.println("O valor mínimo para depósito é R$ 50,00");
        }
    }

    @Override
    public void depositar(double valor, char o) {

        super.depositar(valor);

    }

    @Override
    public void sacar(double valor) {
        if (saldo < 1000.0) {
            System.out.println("O saldo deve estar acima de R$ 1.000,00");
            System.out.println("Saldo: R$ " + saldo);
        } else {
            super.sacar(valor);
        }
    }

}
