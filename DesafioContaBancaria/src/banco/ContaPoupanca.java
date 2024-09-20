package banco;

public class ContaPoupanca extends Conta {

    private final double TAXA_JUROS = 0.05;
    private static double rendimentoTotal = 0;
    private final String JUROS = (TAXA_JUROS * 100) + "%";

    public ContaPoupanca(Banco banco, Cliente cliente, int agencia) {
        super(banco, cliente, "Poupança");
    }

    public double getTAXA_JUROS() {
        return TAXA_JUROS;
    }

    private void render(double valor) {
        double rendimento = valor * TAXA_JUROS;
        adicionaExtrato(new Extrato(
                "Rendimento ( " + JUROS +
                        " x " + valor +
                        " )",
                rendimento));
        somar(rendimento);
        rendimentoTotal += rendimento;
        adicionaExtrato(new Extrato("Saldo", getSaldo()));
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
        render(valor);
    }

    public void sacar(double valor) {
        if (valor <= getSaldo() && valor > 0) {
            super.sacar(valor);
            System.out.println("Valor sacado: R$ " + valor);
            adicionaExtrato(new Extrato("Saque", valor));
            adicionaExtrato(new Extrato("Saldo", getSaldo()));
        } else {
            System.out.println("Valor inválido e/ou saldo insuficiente");
        }
    }

    public void extrato() {
        System.out.println("\nTaxa de juros: " + JUROS +
                "\nRendimento até agora: R$ " + rendimentoTotal + "\n");
        super.extrato();
    }

}
