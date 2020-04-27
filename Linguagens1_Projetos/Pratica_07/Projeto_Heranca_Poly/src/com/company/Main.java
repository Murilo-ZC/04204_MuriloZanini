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


//        //Método 1
//        System.out.println("For Tradicional:");
//        for(int i = 0; i < animals.size(); i++){
//            animals.get(i).comer();
//        }

        //Método 2
        System.out.println("Enhanced For (Foreach):");
        for (Animal animal : animals) {
            animal.comer();
        }

//        cachorro.comer();
//        lobo.comer();
//        peixe.comer();

    }
}
