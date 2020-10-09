package io.sr7.tutorial.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClassRoomStorage implements  Storage<ClassRoomEntity,Integer> {
    //simulate storage instead of table in database
    static  HashMap<Integer,ClassRoomEntity> entityStorage = new HashMap<>();
    Map<Integer,ClassRoomEntity> cacheStorage =new ConcurrentHashMap<>();

    @Override
    public void init() {
        entityStorage.put(1,new ClassRoomEntity(1,"Geometry",1));
        entityStorage.put(2,new ClassRoomEntity(2,"World War History",2));
        entityStorage.put(3,new ClassRoomEntity(3,"Dance",3));
    }

    @Override
    public void save(ClassRoomEntity classRoomEntity) {
        entityStorage.put(classRoomEntity.getId(),classRoomEntity);
        cacheStorage.put(classRoomEntity.getId(),classRoomEntity);
    }

    @Override
    public void delete(ClassRoomEntity classRoomEntity) {
        entityStorage.remove(classRoomEntity.getId());
        cacheStorage.remove(classRoomEntity.getId());
    }

    @Override
    public ClassRoomEntity get(Integer id) {
        //check exist in cache or not
        if (cacheStorage.containsKey(id)){
            System.out.println("Cache Hit ClassRoomEntity :-) " + id);
            return cacheStorage.get(id); //we can use clone method for prevent change object by client
        }
        ClassRoomEntity classRoomEntity = entityStorage.get(id);
        if (classRoomEntity!=null){
            cacheStorage.put(classRoomEntity.getId(),classRoomEntity);
        }
        return classRoomEntity;
    }
}
