package com.company;

import java.util.List;
import java.util.Scanner;

public class ExecutarSistema {
    static private Sistema sistema;
    static private Scanner scanner;
    //Classe que vai executar o sistema
    static public void rodar(){
        sistema = new Sistema();
        scanner = new Scanner(System.in);
        boolean executar = true;
        int opcao;
        Conta usuarioAtual = null; //Força o objeto a ficar vazio
        do{
            statusUsuario(usuarioAtual);
            menu();
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 0:
                    executar = false; break;
                case 1:
                    System.out.println("Lista de Jogos Cadastrados na Plataforma:");
                    exibirListaJogosSistema();
                    break;
                case 2:
                    if(sistema.addJogoNaLista(getJogo())){
                        System.out.println("Jogo Cadastrado com Sucesso!");
                    } else {
                        System.out.println("Falha ao Cadastrar Jogo na Plataforma");
                    }
                    break;
                case 4:
                    //Cadastro de novo usuário na plataforma
                    if(sistema.addUsuarioNaPlataforma(new Conta(getUsuario()))){
                        System.out.println("Usuario adicionado com sucesso!");
                    } else {
                        System.out.println("Falha ao adicionar usuario na plataforma!");
                    }
                    break;
                case 7:
                    Usuario usuario = getUsuario();
                    usuarioAtual = sistema.getUsuario(usuario);
                    if(usuarioAtual == null){
                        System.out.println("Nenhum usuario cadastrado!");
                    }
                    break;
                case 5:
                    if(usuarioAtual != null){
                        exibeJogosConta(usuarioAtual);
                    } else {
                        System.out.println("Nenhum usuario logado!");
                    }
                    break;
                case 6:
                    usuarioAtual = null;
                    break;
                case 3:
                    //Pega o ID do jogo no sistema e atribuiu ele ao usuário atual
                    if(usuarioAtual == null){
                        System.out.println("Nenhum Usuario Logado no Sistema!");
                    } else if(sistema.getListaDeJogos() == null) {
                        System.out.println("Nenhum jogo disponivel no sistema!");
                    } else {
                        exibirListaJogosSistema();
                        int jogoEscolhido = Integer.parseInt(scanner.nextLine());
                        if(jogoEscolhido < sistema.getListaDeJogos().size() && jogoEscolhido >= 0)
                        usuarioAtual.addJogo(sistema.getListaDeJogos().get(jogoEscolhido));
                        else
                            System.out.println("ID de Jogo Invalido escolhido!");
                    }
                    break;
            }

        }while(executar);
        //Fecha o scanner que estava sendo utilizado
        scanner.close();
    }

    private static void exibirListaJogosSistema() {
        List<Jogo> jogosCadastrados = sistema.getListaDeJogos();
        if(jogosCadastrados != null)
            for(int i = 0; i < jogosCadastrados.size(); i++){
                System.out.println(""+i+" - " + jogosCadastrados.get(i).getNome());
            }
    }

    private static void exibeJogosConta(Conta usuarioAtual) {
        System.out.println("Lista de Jogos:");
        for(int i = 0; i < usuarioAtual.getJogos().size(); i++){
            System.out.println(usuarioAtual.getJogos().get(i).getInfo());
        }
    }

    static private void statusUsuario(Conta usuario){
        String usuarioLogado = usuario == null ? "" : usuario.getUser().getNickname();
        System.out.println("Usuario Logado:" + usuarioLogado);
    }

    static private void menu(){
        System.out.println("Escolha a opcao desejada:");
        System.out.println("0 - Sair do sistema");
        System.out.println("1 - Lista de jogos cadastrados");
        System.out.println("2 - Adicionar um novo jogo");
        System.out.println("3 - Cadastrar jogo para usuario");
        System.out.println("4 - Cadastrar novo usuario");
        System.out.println("5 - Lista de jogos do usuario");
        System.out.println("6 - Deslogar usuario");
        System.out.println("7 - Logar Usuario");
    }

    static private Usuario getUsuario(){
        System.out.println("Informe o nick, senha e email do usuario:");
        String nick, senha, email;
        nick = scanner.nextLine();
        senha = scanner.nextLine();
        email = scanner.nextLine();
        return new Usuario(nick, senha, email);
    }

    static private Jogo getJogo(){
        String nome, descricao, genero;
        System.out.println("Informe um nome, uma descricao e um genero:");
        nome = scanner.nextLine();
        descricao = scanner.nextLine();
        genero = scanner.nextLine();
        return new Jogo(nome, genero, descricao);
    }
}
