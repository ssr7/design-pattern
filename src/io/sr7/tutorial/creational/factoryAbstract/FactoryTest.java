package io.sr7.tutorial.creational.factoryAbstract;

import io.sr7.tutorial.creational.factoryAbstract.factory.MediaFactory;
import io.sr7.tutorial.creational.factoryAbstract.image.Bmp2JpegConverter;
import io.sr7.tutorial.creational.factoryAbstract.image.Bmp2PdfConverter;
import io.sr7.tutorial.creational.factoryAbstract.music.Mp32WavConverter;
import io.sr7.tutorial.creational.factoryAbstract.music.Wav2Mp3Converter;
import io.sr7.tutorial.creational.factoryAbstract.video.Avi2MkvConverter;
import io.sr7.tutorial.creational.factoryAbstract.video.Avi2Mp4Converter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Factory of factories
 * like DocumentBuilder , framework
 */


public class FactoryTest {

    @Test
    public void getMediaFactoryInstance(){
        MediaFactory mediaFactory = MediaConverterFactoryAbstract.getMediaFactory(MediaConverterFactoryAbstract.FactoryType.IMAGE);
        System.out.println(mediaFactory.getClass());
        byte[] test=("Hello WORLD !!!").getBytes();
        Converter instance = mediaFactory.getInstance(test, MediaFactory.ConvertType.BMP2JPEG);
        Assert.assertTrue(instance instanceof Bmp2JpegConverter);
        Converter instance2 = mediaFactory.getInstance(test, MediaFactory.ConvertType.BMP2PDF);
        Assert.assertTrue(instance2 instanceof Bmp2PdfConverter);


        MediaFactory mediaFactory2 = MediaConverterFactoryAbstract.getMediaFactory(MediaConverterFactoryAbstract.FactoryType.MUSIC);
        System.out.println(mediaFactory.getClass());
        byte[] test2=("Hello WORLD !!!").getBytes();

        Converter instance3 = mediaFactory2.getInstance(test, MediaFactory.ConvertType.MP3_2_WAV);
        Assert.assertTrue(instance3 instanceof Mp32WavConverter);
        Converter instance4 = mediaFactory2.getInstance(test, MediaFactory.ConvertType.WAV_2_MP3);
        Assert.assertTrue(instance4 instanceof Wav2Mp3Converter);

        MediaFactory mediaFactory3 = MediaConverterFactoryAbstract.getMediaFactory(MediaConverterFactoryAbstract.FactoryType.VIDEO);
        System.out.println(mediaFactory.getClass());
        byte[] test3=("Hello WORLD !!!").getBytes();

        Converter instance5 = mediaFactory3.getInstance(test, MediaFactory.ConvertType.AVI2MKV);
        Assert.assertTrue(instance5 instanceof Avi2MkvConverter);
        Converter instance6 = mediaFactory3.getInstance(test, MediaFactory.ConvertType.AVI2MP4);
        Assert.assertTrue(instance6 instanceof Avi2Mp4Converter);

        instance.convert();
        instance2.convert();
        instance3.convert();
        instance4.convert();
        instance5.convert();
        instance6.convert();



    }
}
