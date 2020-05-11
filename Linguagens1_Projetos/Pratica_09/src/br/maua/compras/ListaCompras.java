package br.maua.compras;

import br.maua.models.Item;
import br.maua.models.Produto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaCompras {
    public ListaCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    private final List<Item> listaDeCompras;

    public void adicionarItem(Produto produto){
        this.listaDeCompras.add(
                new Item(1, produto)
        );
    }

    //Apenas para testar
    public List<Item> getListaDeCompras(){
        return this.listaDeCompras;
    }
}
