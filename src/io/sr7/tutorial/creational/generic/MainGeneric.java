package io.sr7.tutorial.creational.generic;

public class MainGeneric {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        WrapperGeneric<String> wrapperGeneric=new WrapperGeneric<>("Hello world");
        String value = wrapperGeneric.getValue();

        WrapperGeneric<Integer> wrapperGeneric1=new WrapperGeneric<>(10);
        Class<? extends WrapperGeneric> aClass = wrapperGeneric.getClass();
        Class<? extends WrapperGeneric> aClass1 = wrapperGeneric1.getClass();
        //In Run time, JVM does not know about Generic type
        System.out.println(aClass);
        System.out.println(aClass1);

        WrapperGeneric<Object> wrapperGeneric2=new WrapperGeneric<>(new Object());
        //compile-time error
//        wrapperGeneric1=wrapperGeneric2;

        WrapperGeneric wrapperGeneric3=new WrapperGeneric("Hellp");
        Object value1 = wrapperGeneric3.getValue();//Return Object and need to cast- Old fashion

        MainGeneric  mainGeneric=new MainGeneric();
        mainGeneric.sayHello(new WrapperGeneric<>("Alice"),new WrapperGeneric<>(new Integer(10)));
        mainGeneric.<Integer>sayHello(new WrapperGeneric<>("Alice"),new WrapperGeneric<>(new Integer(10)));
    }
    public  <V> String sayHello(WrapperGeneric<String> p1,WrapperGeneric<V> p2){
        return "Hello" +p1.getValue() +","+p2.getValue() ;
    }
    public static  <V> void  say2(WrapperGeneric<V> vWrapperGeneric){
        System.out.println(vWrapperGeneric.toString());
        vWrapperGeneric.getValue();
    }
    public static  void  say3(WrapperGeneric<?> vWrapperGeneric){ //wildcard
        System.out.println(vWrapperGeneric.toString()); //does matter this method and we just call
        vWrapperGeneric.setValue(null);// OK and setValue (new Integer(10)) -> ERROR
        WrapperGeneric<?> wrapperGeneric2=new WrapperGeneric<String>("ssss");
        Object value = wrapperGeneric2.getValue();

    }
}
