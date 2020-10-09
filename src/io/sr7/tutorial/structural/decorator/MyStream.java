package io.sr7.tutorial.structural.decorator;

import java.io.File;

public interface MyStream {
    String write(File file);
    String read(File file);
    String out();

}
