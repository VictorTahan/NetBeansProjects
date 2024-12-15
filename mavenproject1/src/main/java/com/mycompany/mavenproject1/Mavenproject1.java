/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        float IMC,P,A;
        Scanner s = new Scanner (System.in);
        System.out.println("Insira o peso: ");
        P=s.nextFloat();
        System.out.println("Insira a altura: ");
        A=s.nextFloat();
        IMC = P/(A*A); 
        System.out.println("O IMC é: "+IMC); 
        if (IMC >=30.0){
            System.out.println("A pessoa é gorda");
        }
        else {
            System.out.println("A pessoa é magra");
        }
    }
}
