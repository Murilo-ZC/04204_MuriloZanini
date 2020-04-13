package com.company;
import java.util.ArrayList;
import java.util.List;

//Classe utilizada para gerenciar o sistema
public class Sistema {
    private ArrayList<Jogo> listaDeJogos;
    private ArrayList<Conta> listaDeUsuarios;
    public Sistema(){
        listaDeUsuarios = new ArrayList<Conta>();
        listaDeJogos = new ArrayList<Jogo>();
    }
    public boolean isJogoNaLista(Jogo jogo){
        //Método que verifica se o jogo já foi adicionado na lista
        return listaDeJogos.contains(jogo);
    }
    public boolean addJogoNaLista(Jogo jogo){
        //O retorno do método é o inverso da existência do jogo na lista
        //Se ele não existe, o método retorna false. Logo o inverso dele permite que
        //o if adicione ele no conjunto de jogos. Caso contrário, o inverso dele
        //é retornado, indicando que o jogo não foi adicionado com sucesso.
        boolean verificaSeJogoJaExiste = isJogoNaLista(jogo);
        if(!verificaSeJogoJaExiste){
            listaDeJogos.add(jogo);
        }
        return !verificaSeJogoJaExiste;
    }

    public List<Jogo> getListaDeJogos(){
        //Retorna uma cópia da lista com todos os jogos na plataforma
        //Fiquem calmos que o assunto listas vai ser explorado nas próximas semanas!!
        if(listaDeJogos.size() > 0)
            return listaDeJogos.subList(0, listaDeJogos.size());
        else
            return null;
    }

    public boolean isUsuarioCadastrado(Conta usuario){
        //Retorna se o usuário está ou não cadastrado na plataforma
        return listaDeUsuarios.contains(usuario);
    }
    public boolean addUsuarioNaPlataforma(Conta usuario){
        boolean verificaSeUsuarioEstaCadastrado = listaDeUsuarios.contains(usuario);
        if(!verificaSeUsuarioEstaCadastrado){
            listaDeUsuarios.add(usuario);
        }
        return !verificaSeUsuarioEstaCadastrado;
    }
    public Conta getUsuario(Usuario usuario){
        for(int i = 0; i < this.listaDeUsuarios.size(); i++){
            if(listaDeUsuarios.get(i).getUser().equals(usuario))
                return listaDeUsuarios.get(i);
        }
        return null;
    }
}
