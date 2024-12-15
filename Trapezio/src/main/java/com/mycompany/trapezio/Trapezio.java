/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trapezio;
import javax.swing.JOptionPane;
/**
 *
 * @author victo
 */
public class Trapezio {

    public static void main(String[] args) {
        String BaseMaior;
        String BaseMenor;
        String Altura;
        double b_maior;
        double b_menor;
        double h;
        double Area;
        double Perimetro;
        double Diagonal;
        BaseMaior = JOptionPane.showInputDialog("Insira o valor da base maior:");
        BaseMenor = JOptionPane.showInputDialog("Insira o valor da Base Menor: ");
        Altura = JOptionPane.showInputDialog ("Insira a altura do trapézio: ");
        b_maior = Double.parseDouble(BaseMaior);
        b_menor = Double.parseDouble(BaseMenor);
        h = Double.parseDouble(Altura);
        Area = (b_maior * b_menor)*h/2.0;
        Diagonal = Math.sqrt(((b_maior - b_menor)*(b_maior - b_menor)) + (h*h));
        Perimetro = Diagonal + h + b_maior + b_menor;
        JOptionPane.showMessageDialog(null,"A área do trapézio é: "+Area, "Área",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"O perímetro do trapézio é: "+Perimetro, "Perímetro",
                JOptionPane.PLAIN_MESSAGE);
    }
}
