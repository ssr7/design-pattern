package io.sr7.tutorial.creational.factory;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void getDrawFactory(){
        Draw instance = DrawFactory.getInstance(Draw.Type.CIRCLE);
        Assert.assertTrue(instance instanceof Circle);

        Draw instance2 = DrawFactory.getInstance(Draw.Type.TRIANGLE);
        Assert.assertTrue(instance2 instanceof Triangle);

    }
}
