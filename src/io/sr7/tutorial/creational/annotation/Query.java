package io.sr7.tutorial.creational.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.TYPE_PARAMETER,ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Queries.class)
public @interface Query {
    String name();
    String value();
}
