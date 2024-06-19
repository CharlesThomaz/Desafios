package com;

public class Conta {

    private static final int AGENCIA_PADRAO = 111;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;  // Atribuindo o cliente ao campo
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= this.saldo) { // Verificando saldo antes de transferir
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo Insuficiente para transferência!");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", cliente=" + cliente.getNome() + ", saldo=" + saldo + "]";
    }
}
