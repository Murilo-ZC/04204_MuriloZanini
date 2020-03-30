package com.company;

public class Gerente {
    //Isso, denovo, não parece ser a coisa correta a se fazer!
    private double salarioBase;
    private final double comissao = 0.1;

    //Construtor
    public Gerente(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public double getSalarioFinal(double totalVendasMes){
        return salarioBase + comissao * totalVendasMes + 0.5*salarioBase;
    }

    public boolean darAumento(Vendedor vendedor, double aumento){
        double novoSalarioBase = vendedor.getSalarioBase() * (1.0 + aumento);
        return vendedor.setSalarioBase(novoSalarioBase, this);
    }
}
