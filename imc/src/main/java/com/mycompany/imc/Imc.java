/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Imc {

    public static void main(String[] args) {
        String textWeight; // caixa de texto do peso
        String textHeight; // caixa de texto da altura
        double weight; // valor do peso
        double height; // valor da altura
        double imc; // valor do IMC
        textWeight = JOptionPane.showInputDialog("Insira seu peso","peso");
        textHeight = JOptionPane.showInputDialog("Insira sua altura","altura");
        weight = Double.parseDouble(textWeight);
        height = Double.parseDouble(textHeight);
        imc = weight/(height*height);
        JOptionPane.showMessageDialog(null,"Seu IMC é: "+imc, "IMC",
                JOptionPane.PLAIN_MESSAGE); 
        }
}
