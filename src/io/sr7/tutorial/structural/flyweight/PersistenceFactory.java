package io.sr7.tutorial.structural.flyweight;

public class PersistenceFactory  {

    public static Repository getPersistenceFactory(StorageType storageType){
        Repository repository;
        switch (storageType){
            case Department:
                repository =new DepartmentRepository();
                break;
            case ClassRoom:
                repository =new ClassRoomRepository();
                break;
            default:
                throw  new IllegalArgumentException("bad argument pass");
        }
        return repository;
    }

    public enum StorageType{
        Department,
        ClassRoom
    }
}
