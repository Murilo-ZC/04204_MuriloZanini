package com.company;

public class Cachorro extends Animal {
    @Override
    public void comer() {
        System.out.println("Au au!");
    }

    public void cheirar(){
        System.out.println("Sniff");
    }
}
