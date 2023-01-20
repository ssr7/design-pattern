package io.sr7.tutorial.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DepartmentRepository implements Repository<DepartmentEntity,Integer> {
    //simulate storage instead of table in database
    HashMap<Integer,DepartmentEntity> entityStorage = new HashMap<>();
    Map<Integer,DepartmentEntity> cacheStorage =new ConcurrentHashMap<>();
    @Override
    public void init() {
        entityStorage.put(1,new DepartmentEntity(1,"Mathematical","south"));
        entityStorage.put(2,new DepartmentEntity(2,"History","north"));
        entityStorage.put(3,new DepartmentEntity(3,"Literature","south"));
    }

    @Override
    public void save(DepartmentEntity departmentEntity) {
        entityStorage.put(departmentEntity.getId(),departmentEntity);
        cacheStorage.put(departmentEntity.getId(),departmentEntity);
    }

    @Override
    public void delete(DepartmentEntity departmentEntity) {
        entityStorage.remove(departmentEntity.getId());
        cacheStorage.remove(departmentEntity.getId());
    }

    @Override
    public DepartmentEntity get(Integer id) {
        //check exist in cache or not
        if (cacheStorage.containsKey(id)){
            System.out.println("Cache Hit DepartmentEntity :-) " + id);
            return cacheStorage.get(id); //we can use clone method for prevent change object by client
        }
        DepartmentEntity departmentEntity = entityStorage.get(id);
        if (departmentEntity!=null){
            cacheStorage.put(departmentEntity.getId(),departmentEntity);
        }
        return departmentEntity;
    }
}
