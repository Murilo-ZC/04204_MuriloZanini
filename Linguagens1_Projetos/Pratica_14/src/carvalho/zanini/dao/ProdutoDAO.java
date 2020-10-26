package carvalho.zanini.dao;

import carvalho.zanini.model.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements DAO<Produto>,DAOFields {
    private Connection connection;
//    private String myDBConnectionString = "jdbc:sqlite:dados.db";
    private String myDBConnectionString = "jdbc:sqlite:dados_tuned.db";

    public ProdutoDAO(){
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Produto> get(String condition) {
        List<Produto> produtos = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectConditionalString(getTableName()) + condition);
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
    public List<Produto> getAll() {
        List<Produto> produtos = new ArrayList<>();
        try{
            //Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(getSelectAllString(getTableName()));
//            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
//            preparedStatement.executeUpdate();
            ResultSet result = preparedStatement.executeQuery();
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
            PreparedStatement preparedStatement = connection.prepareStatement(getUpdateString(getTableName()));
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
            PreparedStatement preparedStatement = connection.prepareStatement(getDeleteString(getTableName()));
            preparedStatement.setString(1, produto.getCodigo());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void create(Produto produto) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
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

    @Override
    public String getTableName() {
        return "produtos";
    }

    @Override
    public String getDeleteString(String table) {
        return "DELETE FROM "+ table +" WHERE codigo = ?";
    }

    @Override
    public String getUpdateString(String table) {
        return "UPDATE "+ table +" SET codigo = ?, nome = ?, descricao = ?, custo = ?, valor = ?, quantidade = ? WHERE codigo = ?;";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO "+ table + " (codigo, nome, descricao, custo, valor, quantidade) VALUES (?, ?, ?, ?, ?, ?);";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }

    @Override
    public String getSelectConditionalString(String table) {
        return "SELECT * FROM " + table + " WHERE ";
    }
}
