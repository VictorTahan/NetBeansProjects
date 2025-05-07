/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author victo
 */
public class Banco {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setTitular("João");
        conta1.setNumeroConta("123");
        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.exibirSaldo();
        
        System.out.println("----------------");
        
        ContaPoupanca conta2 = new ContaPoupanca();
        conta2.setTitular("Maria");
        conta2.setNumeroConta("456");
        conta2.depositar(1000);
        conta2.sacar(100);
        conta2.exibirSaldo();
    }
}
