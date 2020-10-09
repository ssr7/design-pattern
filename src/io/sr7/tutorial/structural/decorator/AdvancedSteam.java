package io.sr7.tutorial.structural.decorator;

import java.io.File;

public class AdvancedSteam implements MyStream {
    private MyStream myStream;


    public AdvancedSteam(MyStream myStream) {
        this.myStream = myStream;
    }

    @Override
    public String write(File file) {
        return  myStream.write(file);
    }

    @Override
    public String read(File file) {
        return  myStream.read(file);
    }

    @Override
    public String out() {

        return  myStream.out();
    }
    public String writeToMemory(File file){ //new feature
        return  "Write to Memory. file: "+file;
    }
    public String readFromMemory(File file){ //new feature
        return "Read from Memory. file:"+file;
    }
    public String delete(File file){
        return  "Delete file: "+file;
    }
}
