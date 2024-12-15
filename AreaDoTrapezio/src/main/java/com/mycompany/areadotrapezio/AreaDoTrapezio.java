/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areadotrapezio;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class AreaDoTrapezio {

    public static void main(String[] args) {
        String BaseMaior;
        String BaseMenor;
        String Altura;
        double bmaj;
        double bmin;
        double h;
        double Area;
        BaseMaior = JOptionPane.showInputDialog("Insira o valor da Base Maior: ");
        BaseMenor = JOptionPane.showInputDialog("Insira o valor da Base Menor: ");
        Altura = JOptionPane.showInputDialog ("Insira a altura do trapézio: ");
        bmaj = Double.parseDouble(BaseMaior);
        bmin = Double.parseDouble(BaseMenor);
        h = Double.parseDouble(Altura);
        Area = (bmaj+bmin)*h/2.0;
        JOptionPane.showMessageDialog(null,"A área do trapézio é: "+Area, "Área",
                JOptionPane.PLAIN_MESSAGE);
        
    }
}
