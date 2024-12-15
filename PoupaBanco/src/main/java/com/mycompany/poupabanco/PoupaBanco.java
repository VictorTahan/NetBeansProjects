/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poupabanco;

/**
 *
 * @author victo
 */
public class PoupaBanco {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    // Construtor
    public PoupaBanco(String numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }
    }

    // Método para realizar saque
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Valor de saque inválido. O valor deve ser positivo.");
        }
    }

    // Método para exibir o saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        PoupaBanco conta = new PoupaBanco("123456", "João Silva", 1000.0);
        conta.exibirSaldo();
        conta.depositar(500.0);
        conta.exibirSaldo();
        conta.sacar(200.0);
        conta.exibirSaldo();
        conta.sacar(2000.0);  // Tentativa de saque maior que o saldo
        conta.exibirSaldo();
    }
}
