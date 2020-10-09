package io.sr7.tutorial.structural.proxy;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.SQLException;

public class TestProxy {
    private static DbConnection dbConnection;
    private static  PersonDao personDao;

    @BeforeClass
    public static void  init(){
        dbConnection=new DbConnection();
        dbConnection.openConnection();
        personDao=new PersonDaoImpl(dbConnection);
    }

    @Test
    public void insertPerson() throws SQLException {
        //create Proxy class that implement PersonDao
        PersonDao personDaoProxy = TransactionProxy.createTransactionProxy(personDao);
        personDaoProxy.insertPerson(10,"Boyan","Medvedef");
        personDaoProxy.getConnection().rollback(); //Proxy already commited
        Assert.assertEquals(personDaoProxy.getPerson(1),"Boyan");
    }
}
