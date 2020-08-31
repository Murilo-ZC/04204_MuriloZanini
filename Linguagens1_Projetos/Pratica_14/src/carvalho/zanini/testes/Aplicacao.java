package carvalho.zanini.testes;

import carvalho.zanini.model.Produto;

import java.sql.*;

public class Aplicacao {
    public void run(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:dados.db");
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
                System.out.println(produto);
            }
            result.close();

            //Inserir um novo produto
            Produto produto = new Produto("2000", "Water Cooler 120mm", "Cooler", 80, 240, 5);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO produtos (codigo, nome, descricao, custo, valor, quantidade) VALUES (?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, produto.getCodigo());
            preparedStatement.setString(2, produto.getNome());
            preparedStatement.setString(3, produto.getDescricao());
            preparedStatement.setDouble(4, produto.getCusto());
            preparedStatement.setDouble(5, produto.getValor());
            preparedStatement.setInt(6, produto.getQuantidade());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
            System.out.println("Retorno:" + retorno);
            //Salva as modificações no banco
            //connection.commit();

            //Exibe o conteúdo do banco
            result = statement.executeQuery("SELECT * FROM produtos");
            while(result.next()){
                Produto newproduto = new Produto(
                        result.getString("codigo"),
                        result.getString("nome"),
                        result.getString("descricao"),
                        result.getDouble("custo"),
                        result.getDouble("valor"),
                        result.getInt("quantidade")
                );
                System.out.println(newproduto);
            }
            result.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
