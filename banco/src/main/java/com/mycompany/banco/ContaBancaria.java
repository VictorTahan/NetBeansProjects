/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;
/**
 *
 * @author victo
 */
public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;
    
    public void depositar(double valor){
        if (valor > 0){
            this.exibirDados();
            System.out.println("Valor depositado com sucesso!");
            double saldo_anterior = this.getSaldo();
            String saldo_antigo = String.format("%.2f", saldo_anterior);
            System.out.println("Saldo anterior: " + saldo_antigo);
            this.setSaldo(valor + saldo);
            String valor_depositado = String.format("%.2f", valor);
            System.out.println("Valor depositado: " + valor_depositado);
            System.out.println("---------------");
        }else{
            System.out.println("Não é possível depositar este valor. Deposite um valor válido!");
        }
    }
    
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            this.exibirDados();
            System.out.println("Saque realizado com sucesso!");
            double saldo_anterior = this.getSaldo();
            String saldo_antigo = String.format("%.2f", saldo_anterior);
            System.out.println("Saldo anterior: " + saldo_antigo);
            this.setSaldo(saldo - valor);
            String valor_sacado = String.format("%.2f",valor);
            System.out.println("Valor sacado: " + valor_sacado);
            System.out.println("---------------");
        } else if (valor > saldo){
            System.out.println("Você não possui saldo suficiente para sacar este valor!");
            System.out.println("Seu saldo: " + saldo); 
        } else {
            System.out.println("Não é possível sacar este valor. Digite um valor válido!");
        }
    }
    
    public void exibirSaldo(){
        this.exibirDados();
        String saldo_formatado = String.format("%.2f", this.getSaldo());
        System.out.println("Seu saldo atual é: " + saldo_formatado);
    }
    
    protected void exibirDados(){
        System.out.println("Titular: " + getTitular() + " Nº da conta: " + getNumeroConta());
        System.out.println("..........................");
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
}
