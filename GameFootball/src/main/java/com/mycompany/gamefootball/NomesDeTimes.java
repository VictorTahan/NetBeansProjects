package com.mycompany.gamefootball;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class NomesDeTimes {
    Random random = new Random();
    private List<String> lista_pre(){
        List<String> pre = new ArrayList();
        pre.add("Futebol Clube");
        pre.add("Esporte Clube");
        pre.add("Football Club");
        pre.add("Sport Club");
        pre.add("Clube Atlético");
        pre.add("Club Athletico");
        pre.add("Agremiação Esportiva");
        pre.add("Grêmio Esportivo");
        pre.add("Assosiação Atlética");
        pre.add("Agremiação Atlética");
        pre.add("Clube");
        pre.add("Club");
        pre.add("Club Sportivo");
        pre.add("Clube Esportivo");
        pre.add("Agremiação Atlética");
        pre.add("Grêmio de Futebol");
        pre.add("Sociedade Esportiva");
        return pre;
    }
    
    private List<String> lista_pos(){
        List<String> pos = new ArrayList();
        pos.add("Porrada Seca");
        pos.add("Canibais");
        pos.add("Passivos Agressivos");
        pos.add("Bar Sem Lona");
        pos.add("Real Piauí");
        pos.add("Réu Primário");
        pos.add("Só no Pêlo");
        pos.add("Pau no Gato");
        pos.add("Bonde da Auto-Felação");
        pos.add("União Flasco");
        pos.add("Alcoólicos Anônimos");
        pos.add("Narcóticos Anônimos");
        pos.add("Sodomitas");
        pos.add("Valdibres");
        pos.add("70Correr mas eu 20Dibrar");
        pos.add("APAE");
        pos.add("Primeiro Comando da Capital");
        pos.add("Al Qaeda");
        pos.add("Sicarios");
        pos.add("100Massagem");
        pos.add("Bumbum Guloso e Voraz");
        pos.add("Tintuaria do Adalberto, Irmão do Jairo");
        pos.add("Pastel de Flango");
        return pos;
    }
    
    private String pre_sorteado(List<String> pre){
        int indiceAleatorio = random.nextInt(pre.size());
        return pre.get(indiceAleatorio);
    }
    
    private String pos_sorteado(List<String> pos){
        int indiceAleatorio = random.nextInt(pos.size());
        return pos.get(indiceAleatorio);
    }
    
    private List<String> lista_pre_pos(){
       List<String> prepos = new ArrayList();
       List<String> pre = lista_pre();
       List<String> pos = lista_pos();
       String a = pre_sorteado(pre);
       String b = pos_sorteado(pos);
       prepos.add(a);
       prepos.add(b);
       return prepos;
    }
    
    private String pre_pos(List<String> prepos){
        int indiceAleatorio = random.nextInt(prepos.size());
        return prepos.get(indiceAleatorio);
    }
    public String nome_do_time(){
        List<String> prepos = lista_pre_pos();
        String nome1 = pre_pos(prepos);
        String nome2;
        
        do{
            nome2 = pre_pos(prepos);
        }while(nome2.equals(nome1));
        String nome_final = nome1 + " " + nome2;
        return nome_final;
    }
    }
