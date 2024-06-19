package com;

public class TesteConta {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("João");
        Conta cp = new ContaPoupanca(cliente);
        Conta conta = new ContaCorrente(cliente);
        
        conta.depositar(100);
        System.out.println(conta);
        
        conta.transferir(50, cp);
        
        System.out.println(cp);
        conta.sacar(30);
        System.out.println(conta);
    }
}