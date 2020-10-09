package io.sr7.tutorial.creational.factoryAbstract.factory;

import io.sr7.tutorial.creational.factoryAbstract.Converter;
import io.sr7.tutorial.creational.factoryAbstract.music.Mp32WavConverter;
import io.sr7.tutorial.creational.factoryAbstract.music.Wav2Mp3Converter;

public class MusicFactory implements MediaFactory{
    @Override
    public Converter getInstance(byte[] input,MediaFactory.ConvertType musicConverterType){
        Converter converter=null;
        switch (musicConverterType){
            case MP3_2_WAV:
                converter=new Mp32WavConverter(input);
                break;
            case WAV_2_MP3:
                converter=new Wav2Mp3Converter(input);
                break;
            default:
                throw new IllegalArgumentException("Type: "+ musicConverterType +" not found");
        }
        return converter;
    }
}
