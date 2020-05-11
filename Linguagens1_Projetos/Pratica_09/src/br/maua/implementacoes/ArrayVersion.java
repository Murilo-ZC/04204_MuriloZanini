package br.maua.implementacoes;

import br.maua.models.Dog;

public class ArrayVersion {
    public static void run(){
        //Variáveis primitivas
//        int [] meusInteiros = new int[10];
//        meusInteiros[3] = 42;
//        System.out.println("Valor na posicao 3:" + meusInteiros[3]);
        Dog [] dogs = new Dog[3];
        Dog dog = new Dog("Thor", "Golden", 30);
        dogs[0] = dog;
        dogs[1] = new Dog("Fido", "ROsquinha", 12);
        dogs[2] = new Dog("Mel", "Rex", 40);
        dogs[3] = new Dog("Mel", "Rex", 40);
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
    }
}
