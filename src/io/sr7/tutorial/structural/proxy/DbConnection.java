package io.sr7.tutorial.structural.proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
    private Connection connection;
    public DbConnection(){
        try {
            Class.forName("org.h2.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("Error = "+e.getMessage());
            throw  new IllegalStateException("Please Load H2 driver");
        }
    }

    public Connection openConnection() {
        try {
            this.connection= DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_ON_EXIT=FAlSE",
                    "sa","");
            connection.setAutoCommit(false);//proxy set commit
            try (Statement statement=connection.createStatement()){
                statement.execute("create table if not exists " +
                        "person(id integer not null ,name varchar(255),family varchar(255), primary key (id))");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public Connection getConnection() {
        return connection;
    }
    public void closeConnection() throws SQLException {
        if (connection==null){
            connection.close();
        }
    }
}
