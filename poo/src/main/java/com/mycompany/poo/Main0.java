/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

/**
 *
 * @author victo
 */
public class Main0 {

    public static void main(String[] args) {
        Livros livro1 = new Livros ("Entre Deuses e Monstros","Lia Neiva",1990,152);
        Livros livro2 = new Livros ("Os Ratos","Dyonélio Machado",1935,192);
        Livros livro3 = new Livros ("Cabeça Fria, Coração Quente","Abel Ferreira",2022,408);
        
        
    System.out.println("Titulo do Livro: "+livro1.titulo);
    System.out.println("Autor do Livro: "+livro1.autor);
    System.out.println("Ano de publicação: "+livro1.ano_de_publicacao);
    System.out.println("Quantidade de páginas: "+livro1.quantidade_de_pags);
    System.out.println("Titulo do Livro: "+livro2.titulo);
    System.out.println("Autor do Livro: "+livro2.autor);
    System.out.println("Ano de publicação: "+livro2.ano_de_publicacao);
    System.out.println("Quantidade de páginas: "+livro2.quantidade_de_pags);
    System.out.println("Titulo do Livro: "+livro3.titulo);
    System.out.println("Autor do Livro: "+livro3.autor);
    System.out.println("Ano de publicação: "+livro3.ano_de_publicacao);
    System.out.println("Quantidade de páginas: "+livro3.quantidade_de_pags);
    
    }
}
