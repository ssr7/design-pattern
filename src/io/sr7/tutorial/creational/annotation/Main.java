package io.sr7.tutorial.creational.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        ExampleClass exampleClass = new ExampleClass();
        Method method = exampleClass.getClass().getMethod("paramAnnotation", new Class[]{Integer.class});
        Method method2 = exampleClass.getClass().getMethod("methodAnnotation", new Class[]{Integer.class});
        Annotation[] annotations = method.getDeclaredAnnotations();
        Annotation[] annotations2 = method2.getDeclaredAnnotations();

        Method[] methods = exampleClass.getClass().getMethods();
//        Arrays.stream(methods).forEach(e-> System.out.println(e.getName()+ Arrays.toString(e.getParameterTypes())));

        Class aClass = ExampleClass.class;
        Annotation annotation3 = aClass.getAnnotation(ExampleAnnotation.class);

        //class annotation
        if(annotation3 instanceof ExampleAnnotation){
            ExampleAnnotation exampleAnnotation = (ExampleAnnotation) annotation3;
            System.out.println("Class Annotation ->>>>>>>");
            System.out.println("name: " + exampleAnnotation.name());
            System.out.println("value: " + exampleAnnotation.value());
        }

        //param annotation
        for(Annotation annotation : annotations){
            if(annotation instanceof ExampleAnnotation){
                ExampleAnnotation myAnnotation = (ExampleAnnotation) annotation;
                System.out.println("Param Annotation ->>>>>>>");
                System.out.println("name: " + myAnnotation.name());
                System.out.println("value: " + myAnnotation.value());
            }
        }
        //method annotations
        for(Annotation annotation : annotations2){
            if(annotation instanceof ExampleAnnotation){
                ExampleAnnotation myAnnotation = (ExampleAnnotation) annotation;
                System.out.println("Method Annotation ->>>>>>>");
                System.out.println("name: " + myAnnotation.name());
                System.out.println("value: " + myAnnotation.value());
            }
        }
//        System.out.println(exampleClass.methodAnnotation(200));
//        System.out.println(exampleClass.methodAnnotation(200));
    }
}
