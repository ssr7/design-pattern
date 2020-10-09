package io.sr7.tutorial.creational.generic;

import java.util.Date;

public class WrapperGeneric<T> {
    private T value;

    public WrapperGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public  <V extends Date> void  addDate(V input){

    }

    //we can not use
    /*public static  T testMethod(){

    }*/


}
