/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adicionar;
import javax.swing.JOptionPane; 
/**
 *
 * @author victo
 */
public class Adicionar {

    public static void main(String[] args) {
        String firstNumber; //texto da caixa de entrada 1
        String secondNumber;//texto da caixa de entrada 2
        int number1;// numero inserido na caixa 1
        int number2;// numero inserido na caixa 2
        int soma; // resultado
        firstNumber = JOptionPane.showInputDialog("Insira o primeiro número:","Número 1");
        secondNumber = JOptionPane.showInputDialog("Insira o segundo núemero:","Número 2");
        number1=Integer.parseInt(firstNumber); // converte caixa 1 para inteiro
        number2=Integer.parseInt(secondNumber); // converte caixa 2 para inteiro 
        //soma 
        soma=number1+number2;
        //resultado
        JOptionPane.showMessageDialog(null, "A soma é: "+soma,"Resultado",
                JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0); 
        
    }
}
