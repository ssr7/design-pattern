package io.sr7.tutorial.creational.annotation;

@ExampleAnnotation(value = 20)
public class ExampleClass {
    public void   paramAnnotation(@ExampleAnnotation(value = 10,name = "paramAnnotation") Integer a){
//        return a*a;
    }

    @ExampleAnnotation(value = 30,name="methodAnnotation")
    public Integer    methodAnnotation(Integer a){
        System.out.println("Call Method Annotations");
        return a*a;
    }
}
