package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f= new File("D:/data/java/training");
//        f.createNewFile();
//        f.mkdir();
        f.mkdirs();

    }
}
