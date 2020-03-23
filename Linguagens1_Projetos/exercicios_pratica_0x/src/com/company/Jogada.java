package com.company;

public class Jogada {
    private String escolha, ganhoDe, percoDe;

    public static final String PEDRA = "pedra";
    public static final String TESOURA = "tesoura";
    public static final String PAPEL = "papel";
    //Construtor do jogada
    public Jogada(String opcao){
        if(opcao.equals(this.PEDRA)){
            ganhoDe = this.TESOURA;
            percoDe = this.PAPEL;
        } else if(opcao.equals("papel")){
            ganhoDe = "pedra";
            percoDe = "tesoura";
        } else {
            ganhoDe = "papel";
            percoDe = "pedra";
        }
        escolha = opcao;
    }

    public String getEscolha(){
        return this.escolha;
    }

    public String avaliar(Jogada jogada){
        if(jogada.getEscolha().equals(this.ganhoDe)){
            return "Ganhei!";
        } else if(jogada.getEscolha().equals(this.percoDe)){
            return "Perdi!";
        }
        else{
            return "Empate!";
        }
    }
}
