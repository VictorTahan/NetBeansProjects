/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author victo
 */
public class ContaPoupanca extends ContaBancaria{
    
        @Override
        public void sacar(double valor){
            double taxa = valor * 0.5/100;
            double valorDoSaque = valor + taxa;
            if (valorDoSaque > 0 && valorDoSaque <= getSaldo()){
            this.exibirDados();
            System.out.println("Saque realizado com sucesso!");
            double saldo_anterior = this.getSaldo();
            String saldo_antigo = String.format("%.2f", saldo_anterior);
            System.out.println("Saldo anterior: " + saldo_antigo);
            this.setSaldo(getSaldo() - valorDoSaque);
            String valor_sacado = String.format("%.2f",valorDoSaque);
            String taxaFormatada = String.format("%.2f", taxa);
            System.out.println("Taxa: " + taxaFormatada);
            System.out.println("Valor sacado: " + valor_sacado);
            System.out.println("---------------");
        } else if (valorDoSaque > getSaldo()){
            System.out.println("Você não possui saldo suficiente para sacar este valor!");
            System.out.println("Seu saldo: " + getSaldo()); 
        } else {
            System.out.println("Não é possível sacar este valor. Digite um valor válido!");
        }
    }
}

