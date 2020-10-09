package io.sr7.tutorial.behavioral.iterator;

import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class FileContentReader implements Iterable<String> {
    private File file;
    FileReader fileReader;
    BufferedReader bufferedReader;

    public FileContentReader(File file) throws FileNotFoundException {
        Objects.requireNonNull(file);
        if (!file.exists()){
            throw  new FileNotFoundException("File not found "+file.getPath());
        }
        this.file=file;
    }

    public FileContentReader(String filePath) throws FileNotFoundException {
        this(new File(filePath));
    }
    public void init() throws FileNotFoundException {
        fileReader=new FileReader(file);
        bufferedReader=new BufferedReader(fileReader);
    }

    @Override
    public Iterator<String> iterator() {

            try {
                if (fileReader!=null) {
                    fileReader.close();
                }
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
                init();
            } catch (IOException e) {
                e.printStackTrace();
            }

        return  new Iterator<String>() {
            String nextLine = null;

            @Override
            public boolean hasNext() {
                if (nextLine != null) {
                    return true;
                } else {
                    try {
                        nextLine = bufferedReader.readLine();
                        return (nextLine != null);
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                }
            }

            @Override
            public String next() {
                if (nextLine != null || hasNext()) {
                    String line = nextLine;
                    nextLine = null;
                    return line;
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}
