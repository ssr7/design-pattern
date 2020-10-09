package io.sr7.tutorial.structural.proxy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Dao class can not commit query
 */
public interface PersonDao {

    void insertPerson(Integer id,String name,String family) throws SQLException;
    String getPerson(Integer id) throws SQLException;
    Connection getConnection();

}
