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
        if (valor > 0) {
            if (getSaldo() >= valor) { // Saque normal
                super.sacar(valor);
                System.out.println("Valor sacado: R$ " + valor);
                adicionaExtrato(new Extrato("Saque", valor));
                adicionaExtrato(new Extrato("Saldo", getSaldo()));
            }
            else if (valor <= getSaldo() + getLimiteChequeEspecial() || valor <= getLimiteChequeEspecial()){ // Saque com limite 
                usaChequeEspecial(valor);
                adicionaExtrato(new Extrato("Saldo", getSaldo()));
            }else{
                System.out.println("Saldo insuficiente!");
            }                
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void usaChequeEspecial(double valor) {
        double s1 = getSaldo() - valor;
        if (saldo <= 0){
            saldo = s1;
        }
        limiteChequeEspecial = getLimiteChequeEspecial() - Math.abs(valor);
        adicionaExtrato(new Extrato("Uso do Cheque especial", valor));
        adicionaExtrato(new Extrato("Cheque especial disponível", limiteChequeEspecial));
    }

    public void depositar(double valor){
        if (valor > 0){
            super.depositar(valor);
            if (getLimiteChequeEspecial() < 1000 && getSaldo() > 0) {
                limiteChequeEspecial = 1000;
                adicionaExtrato(new Extrato("Cheque especial restaurado", limiteChequeEspecial));
            }
        }else{
            System.out.println("Valor inválido");
        }
    }

}
