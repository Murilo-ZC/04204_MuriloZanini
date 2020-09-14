package carvalho.zanini.murilo.model;

public class CartaPokemon {
    private String nome;
    private String url;

    public CartaPokemon(String nome, String url) {
        this.nome = nome;
        this.url = url;
    }

    public CartaPokemon() {
    }

    @Override
    public String toString() {
        return "CartaPokemon{" +
                "nome='" + nome + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
