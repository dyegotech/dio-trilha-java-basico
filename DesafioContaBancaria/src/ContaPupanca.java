public class ContaPupanca extends Conta implements IContaPoupanca {

    public ContaPupanca(Banco banco, int numero, int agencia) {
        super(banco, numero, agencia);
    }

    private double taxaJuros;

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void render(double taxa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'render'");
    }

}
