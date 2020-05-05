package app;

import app.pacote1.Dog;
import app.pacote2.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Dog dog = new Dog();
        Person person = new Person();
        dog.bark();
        person.hello();
    }
}