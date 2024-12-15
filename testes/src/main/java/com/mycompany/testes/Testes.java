/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testes;
import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Testes {
    
   public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
       int x,y,z;
       System.out.println("Informe um valor: ");
       x=s.nextInt();
       System.out.println("Informe um valor: ");
       y=s.nextInt();
       z=x+y;
       System.out.println("Resultado da soma: "+z);
        if (z>=40){
            System.out.println("Pênis !");
        }
        else {
            System.out.println("Os cria ta de radinhooo");
        }
     }
   
}
