package com.company;

public class Vendedor {
    //Isso nào cheira bem e nem parece correto!
    private double salarioBase;
    private double comissao;
    private Gerente gerente;

    //Construtor
    public Vendedor(double salarioBase, Gerente gerente){
        this.salarioBase = salarioBase;
        this.gerente = gerente;
        this.comissao = 0.05;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public boolean setSalarioBase(double novoSalario, Gerente gerente){
        if(this.gerente.equals(gerente)){
            this.salarioBase = novoSalario;
            return true;
        }
        return false;
    }

    public double getComissao() {
        return comissao;
    }

    public double getSalarioFinal(double totalVendasMes){
        return salarioBase + comissao * totalVendasMes;
    }

    public final Gerente getGerente() {
        return gerente;
    }
}
