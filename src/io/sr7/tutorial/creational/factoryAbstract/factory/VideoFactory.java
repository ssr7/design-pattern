package io.sr7.tutorial.creational.factoryAbstract.factory;

import io.sr7.tutorial.creational.factoryAbstract.Converter;
import io.sr7.tutorial.creational.factoryAbstract.video.Avi2MkvConverter;
import io.sr7.tutorial.creational.factoryAbstract.video.Avi2Mp4Converter;

public class VideoFactory implements MediaFactory{
    @Override
    public Converter getInstance(byte[] input,MediaFactory.ConvertType videoConverterType){
        Converter converter=null;
        switch (videoConverterType){
            case AVI2MKV:
                converter=new Avi2MkvConverter(input);
                break;
            case AVI2MP4:
                converter=new Avi2Mp4Converter(input);
                break;
            default:
                throw new IllegalArgumentException("Type: "+ videoConverterType +" not found");
        }
        return converter;
    }
}
