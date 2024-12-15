package com.mycompany.gamefootball;

public class GameFootball {

    public static void main(String[] args) {
        Time t[] = new Time[20];
        for (int i = 0; i < t.length; i++){
            Time time = new Time();
            t[i] = time;
    }
        Partida partida1 = new Partida();
        partida1.iniciarPartida(t[2],t[4]);
        partida1.verEscalacaoMandante();
}
    
}