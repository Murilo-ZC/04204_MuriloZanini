package carvalho.zanini.model;


import carvalho.zanini.utilities.IdGenerator;

public class Venda {
    private Vendedor vendedor;
    private Cliente cliente;
    private Produto produto;
    private String id;

    public Venda(Vendedor vendedor, Cliente cliente, Produto produto) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.produto = produto;
        this.id = IdGenerator.generateIdFormatado();
    }

    @Override
    public String toString() {
        return "Venda{" +
                "vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", produto=" + produto +
                ", id='" + id + '\'' +
                '}';
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public String getId() {
        return id;
    }
}
