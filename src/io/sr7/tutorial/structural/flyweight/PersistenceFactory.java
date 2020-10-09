package io.sr7.tutorial.structural.flyweight;

public class PersistenceFactory  {

    public static Storage getPersistenceFactory(StorageType storageType){
        Storage storage;
        switch (storageType){
            case Department:
                storage=new DepartmentStorage();
                break;
            case ClassRoom:
                storage=new ClassRoomStorage();
                break;
            default:
                throw  new IllegalArgumentException("bad argument pass");
        }
        return storage;
    }

    public enum StorageType{
        Department,
        ClassRoom
    }
}
