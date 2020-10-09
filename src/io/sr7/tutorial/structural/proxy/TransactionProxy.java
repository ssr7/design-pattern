package io.sr7.tutorial.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionProxy implements InvocationHandler {
    private PersonDao personDao; //we must define interface for every Dao class

    public TransactionProxy(PersonDao personDao) {
        this.personDao = personDao;
    }
    public static PersonDao createTransactionProxy(PersonDao personDao){
        return (PersonDao) Proxy.newProxyInstance(personDao.getClass().getClassLoader()
                ,personDao.getClass().getInterfaces(), new TransactionProxy(personDao));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(personDao, args);
        personDao.getConnection().commit();
        return invoke;

    }
}
