package io.sr7.tutorial.structural.bridge.storage;

public class Test {
    public static void main(String[] args){
        // code to store in file
        StudentRepository fileRepositroy = new StudentRepository (new FileRepository());
        fileRepositroy.save(new Student() );

        // code to store in DataBase
        StudentRepository dbRepositroy = new StudentRepository(new DataBaseRepository());
        dbRepositroy.save(new Student() );
    }
}
