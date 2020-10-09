package io.sr7.tutorial.structural.proxy;

import java.sql.*;

/**
 * Dao class can not commit query
 */
public class PersonDaoImpl  implements PersonDao{
        private final DbConnection dbConnection;

    public PersonDaoImpl(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
    public void insertPerson(Integer id,String name,String family) throws SQLException {
        Connection connection=dbConnection.getConnection();
        try (PreparedStatement statement
                     =connection.prepareStatement("insert into person values (?,?,?)")){
            statement.setInt(1,1);
            statement.setString(2,name);
            statement.setString(3,family);
            statement.executeUpdate();
        }
    }
    public String getPerson(Integer id) throws SQLException {
        Connection connection=dbConnection.getConnection();
        try (PreparedStatement statement
                     =connection.prepareStatement("select * from  person where id=? ")) {
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                System.out.println("OUT: "+ resultSet.getString(1));
                return resultSet.getString(2); //return name
            }
        }
        return null;
    }

    @Override
    public Connection getConnection() {
        return dbConnection.getConnection();
    }

}
