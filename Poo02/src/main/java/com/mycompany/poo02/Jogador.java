
package com.mycompany.poo02;

public class Jogador {
    String nome;
    String posicao;
    int idade;
    int numero;
    boolean titularidade;
    boolean situacao;
    
    void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Posição " + this.posicao);
        System.out.println("Idade: " + this.idade);
        System.out.println("Número da camisa: " + this.numero);
        if (this.titularidade == false){
            System.out.println("Este jogador é reserva");
        }
        else{
            System.out.println("Este jogador é titular");
        }
    }
    void situacao(){
        if (this.situacao == false){
            System.out.println("Este jogador está machucado e não pode jogar");
        }
        else{
            System.out.println("Este jogador não está machucado e pode jogar");
        }
    }
}
