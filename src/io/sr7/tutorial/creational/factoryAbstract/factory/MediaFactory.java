package io.sr7.tutorial.creational.factoryAbstract.factory;

import io.sr7.tutorial.creational.factoryAbstract.Converter;

public interface MediaFactory {
    Converter getInstance(byte[] input,ConvertType convertType);
    public enum ConvertType{
        BMP2JPEG,
        BMP2PNG,
        BMP2PDF,
        JPEG2BPM,
        JPEG2PNG,
        JPEG2PDF,
        MP3_2_WAV,
        WAV_2_MP3,
        AVI2MKV,
        AVI2MP4,
    }
}
