package carvalho.zanini.model;

public class Usuario {
    private String nome, senha, urlFoto;

    public Usuario(String nome, String senha, String urlFoto) {
        this.nome = nome;
        this.senha = senha;
        this.urlFoto = urlFoto;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }
}
