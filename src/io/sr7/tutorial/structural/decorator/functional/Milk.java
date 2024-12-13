package io.sr7.tutorial.structural.decorator.functional;

public class Milk implements Extension{
    @Override
    public Integer price() {
        return  1;
    }

    @Override
    public String getDesc() {
        return "MILK_EXT ";
    }
}
