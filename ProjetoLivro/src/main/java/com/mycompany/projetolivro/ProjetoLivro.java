package com.mycompany.projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p  = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Victor", 27, "M");
        p[1] = new Pessoa("Milena", 24, "F");
        
        l[0] = new Livro("Guerra e Paz", "Liev Tolstói", 1225, p[0]);
        l[1] = new Livro("Kamasutra", "Vātsyāyana", 240, p[0]);
        l[2] = new Livro("Pai Rico, Pai Pobre", "Robert Kiyosaki", 336, p[1]);
        
        
        System.out.println(l[0].detalhes());
    }
}
