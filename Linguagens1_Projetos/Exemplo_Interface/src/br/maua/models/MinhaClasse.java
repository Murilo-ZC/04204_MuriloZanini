package br.maua.models;

import br.maua.interfaces.Combo_1_2;

public class MinhaClasse implements Combo_1_2 {
    @Override
    public String metodo1() {
        return "Forma como eu implementei interface 1";
    }

    @Override
    public String metodo2() {
        return "Forma como eu implementei interface 2";
    }
}
