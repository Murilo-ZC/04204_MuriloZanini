package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();
        Peixe peixe = new Peixe();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cachorro);
        animals.add(lobo);
        animals.add(peixe);

        //Método 2
        System.out.println("Enhanced For (Foreach):");
        for (Animal animal : animals) {
            animal.comer();
            if(animal instanceof Canino){
                System.out.println("Canino!");
                ComportamentoCanino((Canino)animal);
            }

            if(animal instanceof Locomover){
                ((Locomover) animal).comoMeLocomovo();
            }
        }

        andaAe(cachorro);
        andaAe(lobo);
        andaAe(peixe);

    }

    public static void ComportamentoCanino(Canino canino){
        canino.cheirar();
    }

    public static void andaAe(Locomover locomover){
        locomover.comoMeLocomovo();
    }
}
