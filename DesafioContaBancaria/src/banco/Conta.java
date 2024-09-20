package banco;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    private Banco banco;
    private Cliente cliente;
    private int numero;
    private final int agencia = 1;
    private String tipoConta;
    protected double saldo = 0.0;

    private List<Extrato> listaExtrato;
    private static int NUMERO_CONTA = 1;

    public Conta(Banco banco, Cliente cliente, String tipo) {
        this.banco = banco;
        this.numero = NUMERO_CONTA++;
        this.cliente = cliente;
        this.tipoConta = tipo;
        this.listaExtrato = new ArrayList<>();
        adicionaExtrato(new Extrato("Saldo Inicial", getSaldo()));
        banco.adicionaConta(this);
    }

    public Conta() {

    }

    protected void adicionaExtrato(Extrato e) {
        listaExtrato.add(e);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Valor depositado: R$ " + valor);
            adicionaExtrato(new Extrato("Depósito", valor));
            adicionaExtrato(new Extrato("Saldo", getSaldo()));
        } else {
            System.out.println("Valor inválido");
        }
    }

    protected void somar(double valor) {
        saldo += valor;
    }

    protected void diminuir(double valor) {
        saldo -= valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {

        if (this.getBanco().verificaConta(contaDestino.getNumero(), contaDestino.getAgencia()) != null) {
            // System.out.println("Conta origem: " + this);
            System.out.println("Valor a ser transferido: R$ " + valor);
            System.out.println("Conta destino: Agência: " + contaDestino.getAgencia() + " - Conta: "
                    + contaDestino.getNumero() + " - Cliente: " + contaDestino.getCliente().getNome());

            if (valor > 0 && valor <= getSaldo()) {
                this.diminuir(valor);
                adicionaExtrato(new Extrato("Transferência (Envio)", valor));
                adicionaExtrato(new Extrato("Saldo", this.getSaldo()));
                contaDestino.somar(valor);
                contaDestino.adicionaExtrato(new Extrato("Transferência (Recebimento)", valor));
                contaDestino.adicionaExtrato(new Extrato("Saldo", contaDestino.getSaldo()));
                System.out.println("Transferência realizada com sucesso!\n");
            } else {
                System.out.println("Valor inválido e/ou saldo insuficiente ");
            }

        } else {
            System.out.println("A conta informada não existe");
        }
    }

    public void extrato() {
        System.out.println("\n========================= EXTRATO =========================" + "\n");
        for (Extrato e : listaExtrato) {
            System.out.println((listaExtrato.indexOf(e) + 1) + " - " + e.getOperacao() + ": R$ " + e.getValor() + "\n");
        }
        System.out.println("===========================================================" + "\n");
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

    @Override
    public String toString() {
        return "\n================ INFORMAÇÕES DA CONTA: " + "================\n" +
                "\nBanco: " + banco +
                "\nCliente: " + cliente +
                "\nTipo: " + tipoConta +
                "\nAgência: " + agencia +
                "\nNúmero: " + numero + "\n";
    }

}
