package io.sr7.tutorial.creational.annotation;
//we get error because annotation is not repeatable
/*
@Query(name="q1",value = "from person")
@Query(name="q2",value = "from person")*/
//define array of queries
/*@Queries({
        @Query(name="q1",value = "from person"),
        @Query(name="q2",value = "from person")
})*/
//use @repeatable instead of queries
@Query(name="q1",value = "from person")
@Query(name="q2",value = "from person")
public class Entity {
}
