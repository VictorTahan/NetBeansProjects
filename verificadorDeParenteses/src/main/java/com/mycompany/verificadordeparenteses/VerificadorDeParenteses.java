/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificadordeparenteses;

/**
 *
 * @author victo
 */
import java.util.Scanner;
import java.util.Stack;

public class VerificadorDeParenteses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma expressão matemática: ");
        String expressao = scanner.nextLine();
        if(balanceamento(expressao)){
                System.out.println("Expressão válida!");
        }
        else{
                System.out.println("Expressão inválida!");
    }
    }
    public static boolean balanceamento(String expressao){
        
        Stack <Character> pilha = new Stack <>();
        
        for (char c: expressao.toCharArray()){
            if (c == '('){
                pilha.push(c);
            }else if(c == ')'){
                if(pilha.isEmpty()){
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}