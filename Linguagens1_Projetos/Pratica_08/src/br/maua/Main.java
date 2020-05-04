package br.maua;

//import pacote.Dog;
import pacote.QualquerCoisa;

public class Main {

    public static void main(String[] args) {
        QualquerCoisa meuQualquerCoisa = new QualquerCoisa();
        Dog dog1 = new Dog(30);
        pacote.Dog dog2 = new pacote.Dog(3);
        dog1.bark();
        meuQualquerCoisa.ola();
        dog2.bark();

    }
}
