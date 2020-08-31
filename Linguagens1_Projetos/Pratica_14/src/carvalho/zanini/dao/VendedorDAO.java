package carvalho.zanini.dao;

import carvalho.zanini.model.Vendedor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class VendedorDAO implements DAO<Vendedor>, DAOFields {
    private Connection connection;
    private final String myDBConnectionString = "jdbc:sqlite:dados_tuned.db";

    public VendedorDAO() {
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Vendedor> get(String condition) {
        return null;
    }

    @Override
    public List<Vendedor> getAll() {
        return null;
    }

    @Override
    public void update(Vendedor vendedor) {

    }

    @Override
    public void delete(Vendedor vendedor) {

    }

    @Override
    public void create(Vendedor vendedor) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1, vendedor.getId());
            preparedStatement.setString(2, vendedor.getName());
            //ESTA VIOLANDO REGRA DE NEGOCIO
            //TODO: Criar gerador de Hash
            //https://www.baeldung.com/java-hashcode
            //https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/builder/HashCodeBuilder.html
            preparedStatement.setString(3, vendedor.getSenhaHash());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getTableName() {
        return "vendedores";
    }

    @Override
    public String getDeleteString(String table) {
        return "DELETE FROM "+ table +" WHERE id = ?";
    }

    @Override
    public String getUpdateString(String table) {
        return "UPDATE "+ table +" SET id = ?, name = ?, password = ? WHERE id = ?;";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO "+ table + " (id, name, password) VALUES (?, ?, ?);";
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
