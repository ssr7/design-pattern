package io.sr7.tutorial.creational.factory;

import java.text.MessageFormat;

public class DrawFactory {
    public static  Draw getInstance(Draw.Type  type){
        Draw draw;
        switch (type){
            case CIRCLE:
                draw=new Circle();
                break;
            case TRIANGLE:
                draw=new Triangle();
                break;
            default:
                throw new IllegalStateException(MessageFormat.format("Type: {0}is not implemented yet", type));
        }
        return draw;
    }
}
