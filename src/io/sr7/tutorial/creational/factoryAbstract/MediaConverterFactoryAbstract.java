package io.sr7.tutorial.creational.factoryAbstract;

import io.sr7.tutorial.creational.factoryAbstract.factory.ImageFactory;
import io.sr7.tutorial.creational.factoryAbstract.factory.MediaFactory;
import io.sr7.tutorial.creational.factoryAbstract.factory.MusicFactory;
import io.sr7.tutorial.creational.factoryAbstract.factory.VideoFactory;

import java.text.MessageFormat;

public abstract  class MediaConverterFactoryAbstract {
    public static MediaFactory getMediaFactory(FactoryType factoryType){
        MediaFactory  mediaFactory=null;
        switch (factoryType){
            case IMAGE:
                mediaFactory=new ImageFactory();
                break;
            case MUSIC:
                mediaFactory=new MusicFactory();
                break;
            case VIDEO:
                mediaFactory=new VideoFactory();
                break;
            default:
                throw  new IllegalArgumentException(MessageFormat.format("Type: {0} not found", factoryType));
        }
        return mediaFactory;
    }

    public enum FactoryType{
        IMAGE,
        MUSIC,
        VIDEO
    }

    public static void main(String[] args) {



    }
}
