public interface IContaCorrente {
    void depositar(double valor);

    void sacar(double valor);

    void transferir(Conta contaDestino, double valor);

}
