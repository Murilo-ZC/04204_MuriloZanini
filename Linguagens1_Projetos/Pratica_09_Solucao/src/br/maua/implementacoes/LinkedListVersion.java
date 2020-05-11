package br.maua.implementacoes;

import java.util.LinkedList;

public class LinkedListVersion {
    public static void run(){
        LinkedList<String> cidades = new LinkedList<>();
        cidades.add("Pallete");
        cidades.add("Viridian");
        cidades.add("Pewter");
        cidades.add("Cerulean");
        cidades.add("Vermilion");
        cidades.add("Celadon");
        cidades.add("Lavander");
        cidades.add(1, "Konoha");

//        for (String cidade: cidades) {
//            System.out.println(cidade);
//        }

        cidades.forEach((cidade) -> System.out.println(cidade));
    }
}
