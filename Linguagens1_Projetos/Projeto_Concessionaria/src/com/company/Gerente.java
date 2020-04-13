package com.company;

public class Gerente extends Funcionario{

    //Construtor
    public Gerente(double salarioBase){
        super(salarioBase, 0.1);
    }

    @Override
    public double getSalarioFinal(double totalVendasMes){
        return salarioBase + comissao * totalVendasMes + 0.5*salarioBase;
    }

    public boolean darAumento(Vendedor vendedor, double aumento){
        double novoSalarioBase = vendedor.getSalarioBase() * (1.0 + aumento);
        return vendedor.setSalarioBase(novoSalarioBase, this);
    }
}
