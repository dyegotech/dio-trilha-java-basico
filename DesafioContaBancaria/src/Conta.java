public abstract class Conta {
    private Banco banco;
    private int numero;
    private int agencia;
    private double saldo = 0.0;

    public Conta(Banco banco, int numero, int agencia) {
        this.banco = banco;
        this.numero = numero;
        this.agencia = agencia;
    }

    public Conta(){
        
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

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void mostraSaldo(){
        System.out.println("Saldo: R$ " + getSaldo());
    }

    @Override
    public String toString() {
        return "\nBanco: " + banco + ", \nNúmero: " + numero + ", \nAgência: " + agencia + ", \nSaldo: R$" + saldo;
    }

}
