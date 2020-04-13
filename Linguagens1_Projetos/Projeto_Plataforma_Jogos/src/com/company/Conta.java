package com.company;

import java.util.ArrayList;

public class Conta {
    private Usuario user;
    private double creditos;
    private ArrayList<Jogo> jogos;

    public Conta(Usuario user){
        this.user = user;
        creditos = 0;
        //Inicializa a lista de jogos
        jogos = new ArrayList<>();
    }

    public void addCreditos(double valor){
        this.creditos += valor;
    }

    public double getCreditos(){
        return this.creditos;
    }

    public void addJogo(Jogo jogo){
        jogos.add(jogo);
    }

    public ArrayList<Jogo> getJogos(){
        return jogos;
    }

    public String getInfo(){
        String resposta = "";
        resposta = String.format("{user:%s, credits:%f, jogos:[", user.getNickname(), this.creditos);
        for (Jogo jogo : jogos) {
            resposta += jogo.getInfo() + ",";
        }
        resposta += "]}";
        return resposta;
    }

    public Usuario getUser() {
        return user;
    }
}
