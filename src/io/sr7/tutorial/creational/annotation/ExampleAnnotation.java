package io.sr7.tutorial.creational.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)

public @interface ExampleAnnotation {
    String name() default "firstName";
    int value();
    //Just primitive class or enum
//    ExampleClass a(); -> error

}
