package io.sr7.tutorial.behavioral.template_method;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseSort {
    private List<Integer> numbers=new ArrayList<>();
    public void addNumber(Integer number){
        numbers.add(number);
    }
    public void delNumber(Integer number){
        numbers.remove(number);
    }
    public abstract void sort();

}
