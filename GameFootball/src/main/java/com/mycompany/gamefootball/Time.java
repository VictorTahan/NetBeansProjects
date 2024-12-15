package com.mycompany.gamefootball;
import java.util.ArrayList;
import java.util.List;

public class Time {
    List<Players> time = new ArrayList();
    String nome;
    NomesDeTimes nomeTime = new NomesDeTimes();
    public Time(){
        this.setNome(nomeTime.nome_do_time());
        for (int i = 0; i < 22; i++){
            Players player = new Players();
            time.add(player);
        }
    }
    
    public void mostrarTime(){
        System.out.println(this.getNome());
        System.out.println("------------------------------");
        for (int i = 0; i < time.size();i++){
            Players player = time.get(i);
            player.stats();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
