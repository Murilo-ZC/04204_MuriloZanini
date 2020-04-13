package com.company;

public class Genin extends RankedNinja {
    public Genin(String name, String family, String mission) {
        super(name, family, mission);
    }

    public void mudarMissao(){
        mission = "Ola Mundo!";
    }
}
