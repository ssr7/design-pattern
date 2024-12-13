package io.sr7.tutorial.structural.decorator.functional;

import java.util.List;

public abstract class Coffee {
    private final List<Extension> extensionList;

    protected Coffee(List<Extension> extensionList) {
        this.extensionList = extensionList;
    }
    void addExtension(Extension extension){
        extensionList.add(extension);
    }

    abstract Integer price();
    abstract String getDesc();


    public Integer getTotalPrice(){
        return extensionList.stream()
                .map(Extension::price)
                .reduce(price(), Integer::sum);
    }

    public String getTotalDesc(){
        return extensionList.stream()
                .map(Extension::getDesc)
                .reduce(getDesc(), (res, p) -> String.join(",", res, p));
    }

}
