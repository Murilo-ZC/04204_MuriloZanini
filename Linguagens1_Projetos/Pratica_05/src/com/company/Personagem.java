package com.company;

public class Personagem {
    public static final String URL_PERSONAGEM = "www.pokeapi.com/api/v1/";
    private String nomePersonagem;

    public Personagem(String url_personagem){
        this.nomePersonagem = url_personagem;
    }

    public String getUrl(){
        return URL_PERSONAGEM + this.nomePersonagem;
    }
}
