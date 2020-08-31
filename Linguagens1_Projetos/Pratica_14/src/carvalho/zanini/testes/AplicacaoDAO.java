package carvalho.zanini.testes;

import carvalho.zanini.dao.ProdutoDAO;
import carvalho.zanini.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacaoDAO {
    private List<Produto> produtos;
    private ProdutoDAO produtoDAO;
    private Scanner scanner;

    public AplicacaoDAO() {
        produtos = new ArrayList<>();
        produtoDAO = new ProdutoDAO();
        scanner = new Scanner(System.in);
    }

    public void run(){
        boolean alive = true;
        do{
            menu();
            int opcao = Integer.parseInt(scanner.next());
            switch (opcao){
                case 0:
                    alive = false;
                    break;
                case 1:
                    exibirProdutos();
                    break;
                case 2:
                    deletarProduto();
                    break;
                case 3:
                    atualizarProduto();
                    break;
                case 4:
                    cadastrarNovoProduto();
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }

        }while(alive);
    }

    private void atualizarProduto() {
        produtos = produtoDAO.getAll();
        System.out.println("Codigo do Produto para Atualizar:");
        String codigo = scanner.next();
        System.out.println("Cadastre os novos valores:");
        String nome, descricao;
        int quantidade;
        double custo, valor;
        System.out.println("Informe os dados:");
        nome = scanner.next();
        descricao = scanner.next();
        custo = Double.parseDouble(scanner.next());
        valor = Double.parseDouble(scanner.next());
        quantidade = Integer.parseInt(scanner.next());
        produtoDAO.update(new Produto(
                codigo, nome, descricao, custo, valor, quantidade
        ));
    }

    private void cadastrarNovoProduto() {
        String nome, codigo, descricao;
        int quantidade;
        double custo, valor;
        System.out.println("Informe os dados:");
        codigo = scanner.next();
        nome = scanner.next();
        descricao = scanner.next();
        custo = Double.parseDouble(scanner.next());
        valor = Double.parseDouble(scanner.next());
        quantidade = Integer.parseInt(scanner.next());
        produtoDAO.create(new Produto(
                codigo, nome, descricao, custo, valor, quantidade
        ));
    }

    private void deletarProduto() {
        System.out.println("Codigo do produto:");
        String codigo = scanner.next();
        Produto produto = new Produto(codigo);
        produtoDAO.delete(produto);
    }

    private void exibirProdutos() {
        produtos = produtoDAO.getAll();
        System.out.println("Produto:");
        produtos.forEach( produto -> System.out.println(produto));
    }

    private void menu() {
        System.out.println("PLUG_E_USE-1996");
        System.out.println("1 - Produtos Cadastrados");
        System.out.println("2 - Deletar Produto");
        System.out.println("3 - Alterar Produto");
        System.out.println("4 - Cadastrar Produto");
        System.out.println("0 - Sair");
    }
}
