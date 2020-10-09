package io.sr7.tutorial.structural.flyweight;

public class TestFlyweight {
    public static void main(String[] args) {
        //String literal
        //These save in string constant pool location.
        //This like Flyweight design pattern
        String s1="Hello"; //imute class and every change make new entry in pool
        String s2="Hello";;//It doesn't create a new instance  ->https://static.javatpoint.com/images/string.JPG
        System.out.println("s1 hash = " + System.identityHashCode(s1));
        System.out.println("s2 hash = " + System.identityHashCode(s2));

        Integer a1= Integer.valueOf(8888);
        Integer a2= Integer.valueOf(8888);
        //The hash codes are different
        System.out.println("a1 hash = " + System.identityHashCode(a1));
        System.out.println("a2 hash = " + System.identityHashCode(a2));


        Integer a3= Integer.valueOf(+127);
        Integer a4= Integer.valueOf(+127);
        //The hash codes are same because the Integer class cache between -127 ... +127.
        //There is integerCache in Integer class. The low number more use.
        System.out.println("a3 hash = " + System.identityHashCode(a3));
        System.out.println("a4 hash = " + System.identityHashCode(a4));

        Storage<DepartmentEntity,Integer> departmentStorage =  PersistenceFactory.getPersistenceFactory(PersistenceFactory.StorageType.Department);
        departmentStorage.init();
        DepartmentEntity departmentEntity = departmentStorage.get(1);
        DepartmentEntity departmentEntity2 = departmentStorage.get(1);
        System.out.println(System.identityHashCode(departmentEntity));
        System.out.println(System.identityHashCode(departmentEntity2));

        Storage<ClassRoomEntity,Integer> classRoomStorage=  PersistenceFactory.getPersistenceFactory(PersistenceFactory.StorageType.ClassRoom);
        classRoomStorage.init();
        ClassRoomEntity classRoomEntity = classRoomStorage.get(1);
        ClassRoomEntity classRoomEntity2 = classRoomStorage.get(1);
        System.out.println(System.identityHashCode(classRoomEntity));
        System.out.println(System.identityHashCode(classRoomEntity2));

    }
}
