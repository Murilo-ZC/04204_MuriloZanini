package com.company;

public class Jogo {
    private String nome;
    private String genero;
    private String descricao;
    private boolean online;
    private boolean multiplayer;

    public Jogo(String nome, String genero, String descricao) {
        this.nome = nome;
        this.genero = genero;
        this.descricao = descricao;
        online = false;
        multiplayer = false;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescricao() {
        return descricao;
    }


    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public String getInfo(){
        return String.format("{nome:%s, genero:%s, descricao:%s}", this.nome, this.genero, this.descricao);
    }
}
