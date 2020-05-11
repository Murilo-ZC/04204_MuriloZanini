package br.maua.models;

public class Item extends Produto{
    private int quantidade;

    public Item(int quantidade, Produto produto) {
        super(produto.getCodigo(), produto.getNome(), produto.getValor());
        this.quantidade = quantidade;
    }

    public void incrementarItem(){
        quantidade++;
    }

    public void incrementarItem(int quantidade){
        this.quantidade += quantidade;
    }

    public void decrementarItem(){
        if(quantidade > 0)
            quantidade--;
    }

    public void decrementarItem(int quantidade){
        this.quantidade -= quantidade;
        if(this.quantidade < 0)
            this.quantidade = 0;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quantidade=" + quantidade +
                super.toString() +
                '}';
    }
}
