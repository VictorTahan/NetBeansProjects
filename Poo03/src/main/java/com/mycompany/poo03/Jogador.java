package com.mycompany.poo03;

public class Jogador {
    private String nome;
    private String posicao;
    private int idade;
    private int numero;
    boolean titularidade;
    boolean situacao;
    private float força;
    
    public Jogador(String n, String pos, int i, int nm, boolean t, boolean s, float f){
        this.nome = n;
        this.posicao = pos;
        this.idade = i;
        this.numero = nm;
        this.setTitularidade(t);
        this.setSituacao(s);
        this.força = f;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public String getPosicao(){
        return this.posicao;
    }
    
    public void setPosicao(String pos){
        this.posicao = pos;
    }
    
    private boolean getTitularidade(){
        return this.titularidade;
    }
    
    private void setTitularidade(boolean t){
        this.titularidade = t;
        if (t == true){
            System.out.println("Este jogador é titular");
        } else{
            System.out.println("Este jogador é reserva");
        }
    }
    
    private boolean getSituacao(){
        return this.situacao;
    }
    
    private void setSituacao(boolean s){
        this.situacao = s;
        if (s == true){
            System.out.println("Este jogador não está machucado e pode jogar");
        } else{
            System.out.println("Este jogador está machucado e não pode jogar");
        }
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int nm){
        this.numero = nm;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public float getForça(){
        return this.força;
    }
    
    public void setForça(float f){
        this.força = f;
    }
    
    public void status(){
        System.out.println("JOGADOR:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Posição: " + this.getPosicao());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Número da camisa: " + this.getNumero());
        System.out.println(this.getTitularidade());
        System.out.println(this.getSituacao());
        System.out.println("Força: " + this.getForça());
    }
}
