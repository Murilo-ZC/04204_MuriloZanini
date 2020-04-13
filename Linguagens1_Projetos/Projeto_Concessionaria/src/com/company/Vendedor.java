package com.company;

public class Vendedor extends Funcionario{
    private Gerente gerente;

    //Construtor
    public Vendedor(double salarioBase, Gerente gerente){
        super(salarioBase);
        this.gerente = gerente;
    }


    public boolean setSalarioBase(double novoSalario, Gerente gerente){
        if(this.gerente.equals(gerente)){
            this.salarioBase = novoSalario;
            return true;
        }
        return false;
    }

    public final Gerente getGerente() {
        return gerente;
    }
}
