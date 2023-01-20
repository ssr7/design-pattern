package io.sr7.tutorial.structural.bridge.storage;

class DataBaseRepository implements StorageRepository{
public void store(BaseEntiy entiy){
    System.out.println("store into db");
}

}