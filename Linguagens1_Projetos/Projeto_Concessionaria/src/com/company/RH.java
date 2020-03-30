package com.company;

public class RH {
    public static void rodarRh(){
        Gerente g1, g2;
        Vendedor v1, v2;
        double totalDeVendas = 1000;
        g1 = new Gerente(1000);
        v1 = new Vendedor(1000, g1);
        System.out.println("Gerente 1:" + g1.getSalarioFinal(totalDeVendas));
        System.out.println("Vendedr 1:" + v1.getSalarioFinal(totalDeVendas));
        if(g1.darAumento(v1, 0.1))
            System.out.println("Aumento Deu Certo!");
        System.out.println("Vendedr 1:" + v1.getSalarioFinal(totalDeVendas));
    }
}
