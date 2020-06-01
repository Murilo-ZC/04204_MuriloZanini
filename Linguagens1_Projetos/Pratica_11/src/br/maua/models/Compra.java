package br.maua.models;

import java.util.Objects;

public class Compra {
    private double valor;
    private int ID;

    public Compra(double valor, int ID) {
        this.valor = valor;
        this.ID = ID;
    }

    public double getValor() {
        return valor;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "valor=" + valor +
                ", ID=" + ID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compra compra = (Compra) o;
        return Double.compare(compra.valor, valor) == 0 &&
                ID == compra.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, ID);
    }
}
