package io.sr7.tutorial.structural.decorator;

import java.io.File;

public class SimpleStream implements MyStream {

    @Override
    public String write(File file) {
        return "write to file";
    }

    @Override
    public String read(File file) {
        return "read from file";
    }

    @Override
    public String out() {
        return "output file";
    }
}
