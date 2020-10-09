package io.sr7.tutorial.creational.generic;

public class WrapperNonGeneric {
    private Object value;

    public WrapperNonGeneric(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
