public abstract class Conta implements IConta {
    private Banco banco;
    private Cliente cliente;
    private int numero;
    private int agencia;
    private String tipoConta;
    protected double saldo = 0.0;

    private static int NUMERO_CONTA = 1;

    public Conta(Banco banco, Cliente cliente, int agencia, String tipo) {
        this.banco = banco;
        this.numero = NUMERO_CONTA++;
        this.agencia = agencia;
        this.cliente = cliente;
        this.tipoConta = tipo;
    }

    public Conta() {

    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Valor depositado: R$ " + valor);
        } else {
            System.out.println("O valor não pode ser zero e nem negativo");
        }
    }

    public void depositar(double valor, char o) {
        if (o == 'T')
            depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() && valor != 0 && valor > 0) {
            this.saldo -= valor;
            System.out.println("Valor sacado: R$ " + valor);
        } else {
            System.out.println("Valor inválido e/ou saldo insuficiente");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void mostraSaldo() {
        System.out.println("Saldo: R$ " + getSaldo());
    }

    public void setSaldoTotal(double valor) {
        this.saldo = valor;
    }

    @Override
    public String toString() {
        return "\n\nBanco: " + banco +
                "\nCliente: " + cliente +
                "\nTipo: " + tipoConta +
                "\nNúmero: " + numero +
                "\nAgência: " + agencia +
                "\nSaldo: R$ " + saldo;
    }

}
