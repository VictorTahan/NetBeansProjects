package com.mycompany.gamefootball;

public class Partida {
    private Time mandante;
    private Time visitante;
    private int placar_mandante;
    private int placar_visitante;
    
    public void iniciarPartida(Time t1, Time t2){
        this.setMandante(t1);
        this.setVisitante(t2);
        System.out.println("A partida será entre " + this.getMandante().getNome() + " e " + this.getVisitante().getNome());
        this.setPlacar_mandante(0);
        this.setPlacar_visitante(0);
    }
    
    public void encerrarPartida(){
        if (this.getPlacar_mandante() > this.getPlacar_visitante()){
            System.out.println("Fim de jogo! " + this.getMandante() + " venceu!");
            System.out.println("Placar final: " + this.getPlacar_mandante() + " x " + this.getPlacar_visitante());
        } else if (this.getPlacar_mandante() < this.getPlacar_visitante()){
            System.out.println("Fimd e jogo! " + this.getVisitante() + " venceu!" );
            System.out.println("Placar final: " + this.getPlacar_mandante() + " x " + this.getPlacar_visitante());
        }else{
            System.out.println("Fim de jogo! Terminou empatado!");
            System.out.println("Placar final: " + this.getPlacar_mandante() + " x " + this.getPlacar_visitante());
        }
    }

    public int getPlacar_mandante() {
        return placar_mandante;
    }

    public void setPlacar_mandante(int placar_mandante) {
        this.placar_mandante = placar_mandante;
    }

    public int getPlacar_visitante() {
        return placar_visitante;
    }

    public void setPlacar_visitante(int placar_visitante) {
        this.placar_visitante = placar_visitante;
    }
    
    public void verEscalacaoMandante(){
        this.getMandante().mostrarTime();
    }
    public void verEscalacaoVisitante(){
        this.getVisitante().mostrarTime();
    }
    private void golMandante(){
        this.setPlacar_mandante(this.getPlacar_mandante() + 1);
    }
    
    private void golVisitante(){
        this.setPlacar_visitante(this.getPlacar_visitante() + 1);
    }

    public Time getMandante() {
        return mandante;
    }

    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }

    public Time getVisitante() {
        return visitante;
    }

    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }
    
    
}
