package io.sr7.tutorial.structural.decorator.functional;

public class Sugar implements Extension {
    @Override
    public Integer price() {
        return 2;
    }

    @Override
    public String getDesc() {
        return "SUGAR_EXT " ;
    }
}
