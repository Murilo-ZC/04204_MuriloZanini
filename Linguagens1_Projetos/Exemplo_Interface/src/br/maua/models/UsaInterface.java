package br.maua.models;

import br.maua.interfaces.Interface1;

public class UsaInterface implements Interface1 {
    @Override
    public String metodo1() {
        return "Outra forma de realizar a implementação!";
    }
}
