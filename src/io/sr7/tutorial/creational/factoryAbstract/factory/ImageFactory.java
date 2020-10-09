package io.sr7.tutorial.creational.factoryAbstract.factory;

import io.sr7.tutorial.creational.factoryAbstract.Converter;
import io.sr7.tutorial.creational.factoryAbstract.image.*;

import java.text.MessageFormat;

public class ImageFactory  implements  MediaFactory{
    @Override
    public Converter getInstance(byte[] input, MediaFactory.ConvertType convertType){
        Converter converter=null;
        switch (convertType){
            case BMP2JPEG:
                converter=new Bmp2JpegConverter(input);
                break;
            case BMP2PNG:
                converter=new Bmp2PngConverter(input);
                break;
            case BMP2PDF:
                converter=new Bmp2PdfConverter(input);
                break;
            case JPEG2BPM:
                converter=new Jpeg2BmpConverter(input);
                break;
            case JPEG2PNG:
                converter=new Jpeg2PngConverter(input);
                break;
            case JPEG2PDF:
                converter=new Jpeg2PdfConverter(input);
                break;
            default:
                throw new IllegalArgumentException(MessageFormat.format("Type: {0} not found", convertType));
        }
        return converter;
    }
}
