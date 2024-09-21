package banco;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial = 1000.0;

    public ContaCorrente(Banco banco, Cliente cliente) {
        super(banco, cliente, "Conta Corrente");
    }

    public double getLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }

    public void extrato() {
        super.extrato();
    }

    public void sacar(double valor) {
        System.out.println("Valor solicitado: R$ " + valor);
        if (valor > 0 && valor <= getSaldo() + getLimiteChequeEspecial()) {
            if (valor <= getSaldo()) {
                super.sacar(valor);
                System.out.println("Valor sacado: R$ " + valor);
                adicionaExtrato(new Extrato("Saque", valor));
                adicionaExtrato(new Extrato("Saldo", getSaldo()));
            } else {
                double s1 = getSaldo() - valor;
                saldo = s1;
                limiteChequeEspecial = limiteChequeEspecial - Math.abs(valor);
                adicionaExtrato(new Extrato("Uso do Cheque especial", valor));
                adicionaExtrato(new Extrato("Saldo", getSaldo()));
            }
        } else {
            System.out.println("Valor inválido ou saldo insuficiente");
        }
    }

    public void usaChequeEspecial() {

    }

}
