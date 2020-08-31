package carvalho.zanini.dao;

import carvalho.zanini.model.Produto;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements DAO<Produto> {
    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:dados.db";

    public ProdutoDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Produto> getAll() {
        List<Produto> produtos = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM produtos");
            while(result.next()){
                Produto produto = new Produto(
                        result.getString("codigo"),
                        result.getString("nome"),
                        result.getString("descricao"),
                        result.getDouble("custo"),
                        result.getDouble("valor"),
                        result.getInt("quantidade")
                );
                produtos.add(produto);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return produtos;
    }

    @Override
    public void update(Produto produto) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE produtos SET codigo = ?, nome = ?, descricao = ?, custo = ?, valor = ?, quantidade = ? WHERE codigo = ?;");
            preparedStatement.setString(1, produto.getCodigo());
            preparedStatement.setString(2, produto.getNome());
            preparedStatement.setString(3, produto.getDescricao());
            preparedStatement.setDouble(4, produto.getCusto());
            preparedStatement.setDouble(5, produto.getValor());
            preparedStatement.setInt(6, produto.getQuantidade());
            preparedStatement.setString(7, produto.getCodigo());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Produto produto) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM produtos WHERE codigo = ?");
            preparedStatement.setString(1, produto.getCodigo());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void create(Produto produto) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO produtos (codigo, nome, descricao, custo, valor, quantidade) VALUES (?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, produto.getCodigo());
            preparedStatement.setString(2, produto.getNome());
            preparedStatement.setString(3, produto.getDescricao());
            preparedStatement.setDouble(4, produto.getCusto());
            preparedStatement.setDouble(5, produto.getValor());
            preparedStatement.setInt(6, produto.getQuantidade());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
