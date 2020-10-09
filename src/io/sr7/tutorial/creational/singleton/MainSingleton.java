package io.sr7.tutorial.creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        System.out.println(DbConnection.getInstance());
        System.out.println(System.currentTimeMillis()-time);

        System.out.println(DbConnection.getInstance());
        time=System.currentTimeMillis();
        System.out.println(System.currentTimeMillis()-time);

        time=System.currentTimeMillis();
        System.out.println(DbConnection.getInstance());
        System.out.println(System.currentTimeMillis()-time);

        time=System.currentTimeMillis();
        System.out.println(DbConnection.getInstance());
        System.out.println(System.currentTimeMillis()-time);
    }
}
