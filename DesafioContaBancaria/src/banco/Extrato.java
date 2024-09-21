package banco;
public class Extrato {
    private String operacao;
    private double valor;

    public String getOperacao() {
        return operacao;
    }

    public double getValor() {
        return valor;
    }

    public Extrato(String operacao, double valor) {
        this.operacao = operacao;
        this.valor = valor;
    }

    public String toString() {
        return "\n" + operacao + ": R$ " + valor + "\n";
    }

}
