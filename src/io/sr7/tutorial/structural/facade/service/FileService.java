package io.sr7.tutorial.structural.facade.service;

import java.io.File;

public class FileService {
    protected String save(File file){
        System.out.println("Save file");
        return  "Success save";
    }
    protected void  loadFile(File file){
        System.out.println("Load file: "+ file.getName());
    }


}
