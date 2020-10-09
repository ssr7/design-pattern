package io.sr7.tutorial.structural.proxy;

public class ReflectionExample {
    public int sum(int x,int y){
        return  (x+y);
    }

    public static void main(String[] args) throws Exception {
        //class object contains information about the class such as annotation,property, methods, ...
        Class<?> aClass = Class.forName("io.sr7.tutorial.structural.proxy.ReflectionExample"); //Load in class loader
        Object objectReflectionExample = aClass.newInstance(); //this is a kind of proxy
        Object sum = objectReflectionExample.getClass().getMethod("sum", int.class, int.class).invoke(objectReflectionExample, 10, 34);
        System.out.println("sum: "+sum);
    }
}
