package com.company;

public class Jounin extends RankedNinja {
    public Jounin(String name, String family, String mission) {
        super(name, family, mission);
    }

    @Override
    public void train(){
        System.out.println("Treinando para:" + mission);
    }

}
