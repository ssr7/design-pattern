package io.sr7.tutorial.behavioral.iterator;

import java.io.FileNotFoundException;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) throws FileNotFoundException {
        FileContentReader fileContentReader=new FileContentReader("/tmp/1.txt");
        Iterator<String> iterator = fileContentReader.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
