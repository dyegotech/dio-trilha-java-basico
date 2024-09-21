package banco;
public interface IConta {
    void depositar(double valor);
    
    void sacar(double valor);
    
    void transferir(Conta contaDestino, double valor);

    void extrato();

}
