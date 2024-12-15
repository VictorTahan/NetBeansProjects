package com.mycompany.gamefootball;
import java.util.Random;

public class Players {
    Random rand = new Random();
    Nomes nomes = new Nomes();
    private String nome;
    private int ataque;
    private int defesa;
    private int balanço;
    private int estamina;
    private int velocidade;
    private int aceleraçao;
    private int resposta;
    private int dibre;
    private int passe;
    private int precisao;
    private int força;
    private int cabeceio;
    private int pulo;
    private int tecnica;
    private int curva;
    private int custo;
    private int media;

 
    public Players(){
        this.setNome(nomes.nome_final());
        this.setAceleraçao(valor());
        this.setAtaque(valor());
        this.setBalanço(valor());
        this.setCabeceio(valor());
        this.setCurva(valor());
        this.setDefesa(valor());
        this.setDibre(valor());
        this.setEstamina(valor());
        this.setForça(valor());
        this.setPasse(valor());
        this.setPrecisao(valor());
        this.setPulo(valor());
        this.setResposta(valor());
        this.setTecnica(valor());
        this.setVelocidade(valor());
        this.setMedia((this.getAceleraçao() + this.getAtaque() + this.getBalanço() + this.getCabeceio() + this.getCurva() + 
                this.getDefesa() + this.getDibre() + this.getEstamina() + this.getForça() + this.getPasse() + this.getPrecisao() + this.getPulo() + this.getResposta() + this.getTecnica() + this.getVelocidade())/15);
        this.setCusto(this.getMedia() * 100);
}
    public void stats(){
        System.out.println("----------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Aceleração: " + this.getAceleraçao());
        System.out.println("Ataque: " + this.getAtaque());
        System.out.println("Balanço: " + this.getCabeceio());
        System.out.println("Curva: " + this.getCurva());
        System.out.println("Defesa: " + this.getDefesa());
        System.out.println("Dibre: " + this.getDibre());
        System.out.println("Estamina: " + this.getEstamina());
        System.out.println("Força: " + this.getForça());
        System.out.println("Passe: " + this.getPasse());
        System.out.println("Precisão: " + this.getPrecisao());
        System.out.println("Pulo: " + this.getPulo());
        System.out.println("Resposta: " + this.getResposta());
        System.out.println("Técnica: " + this.getTecnica());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Média: " + this.getMedia());
        System.out.println("Custo: " + this.getCusto());
        System.out.println("-----------------------------------");
    }
    
    public int valor(){
        return rand.nextInt(1, 6);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getBalanço() {
        return balanço;
    }

    public void setBalanço(int balanço) {
        this.balanço = balanço;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleraçao() {
        return aceleraçao;
    }

    public void setAceleraçao(int aceleraçao) {
        this.aceleraçao = aceleraçao;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public int getDibre() {
        return dibre;
    }

    public void setDibre(int dibre) {
        this.dibre = dibre;
    }

    public int getPasse() {
        return passe;
    }

    public void setPasse(int passe) {
        this.passe = passe;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getCabeceio() {
        return cabeceio;
    }

    public void setCabeceio(int cabeceio) {
        this.cabeceio = cabeceio;
    }

    public int getPulo() {
        return pulo;
    }

    public void setPulo(int pulo) {
        this.pulo = pulo;
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    public int getCurva() {
        return curva;
    }

    public void setCurva(int curva) {
        this.curva = curva;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }
    
    public int getMedia(){
        return media;
    }
    public void setMedia(int media){
        this.media = media;
    }
    
}
    
