
package com.mycompany.poo02;


public class Poo02 {

    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        j1.idade = 18;
        j1.nome = "Victor";
        j1.numero = 10;
        j1.posicao = "meio-campista";
        j1.titularidade = true;
        j1.situacao = false;
        j1.status();
        j1.situacao();
        
    }
}
