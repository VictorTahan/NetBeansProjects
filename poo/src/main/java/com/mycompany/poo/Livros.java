/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

/**
 *
 * @author victo
 */
public class Livros {
    String titulo;
    String autor;
    int ano_de_publicacao;
    int quantidade_de_pags;
    
        public Livros (String titulo, String autor, int ano_de_publicacao, int quantidade_de_pags)
        {
            super();
            this.titulo=titulo;
            this.autor=autor;
            this.ano_de_publicacao=ano_de_publicacao;
            this.quantidade_de_pags=quantidade_de_pags;
        }
           void dadosLivros(){
            System.out.println("Titulo do Livro: "+titulo);
            System.out.println("Autor do Livro: "+autor);
            System.out.println("Ano de publicação: "+ano_de_publicacao);
            System.out.println("Quantidade de páginas: "+quantidade_de_pags);
        }
            
    }

