/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();        
        System.out.printf("A nota de %s é %.1f ", nome, nota);
    }
}
