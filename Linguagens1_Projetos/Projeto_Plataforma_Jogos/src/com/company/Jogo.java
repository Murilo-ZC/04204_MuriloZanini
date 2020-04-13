package com.company;

import java.util.Objects;

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

    //Métodos necessários para comparar se já existe o objeto dentro da lista
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return online == jogo.online &&
                multiplayer == jogo.multiplayer &&
                nome.equals(jogo.nome) &&
                genero.equals(jogo.genero) &&
                descricao.equals(jogo.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, descricao, online, multiplayer);
    }
}
