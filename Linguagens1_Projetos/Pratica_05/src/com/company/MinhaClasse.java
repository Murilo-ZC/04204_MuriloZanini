package com.company;

public class MinhaClasse {
    private static int contaObjetos = 0;
    private String nome;

    public MinhaClasse(){
        MinhaClasse.contaObjetos = MinhaClasse.contaObjetos + 1;
    }

    public static int getContaObjetos(){
        return MinhaClasse.contaObjetos;
    }
}
