package carvalho.zanini.projeto.model;

import carvalho.zanini.enumeracoes.Status;

public class Jogo {
    private String plataforma;
    private String nome;
    private Status status;

    public Jogo(String plataforma, String nome) {
        this.plataforma = plataforma;
        this.nome = nome;
        this.status = Status.NAO_INICIADO;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "plataforma='" + plataforma + '\'' +
                ", nome='" + nome + '\'' +
                ", status=" + status +
                '}';
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setStatusJogando() {
        this.status = Status.JOGANDO;
    }
}
