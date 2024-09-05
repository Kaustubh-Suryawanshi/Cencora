package com.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Demo1_NIO {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("D:/data/java/training/file3.txt");

        //--------------to create file

//            Path createdFilepath = Files.createFile(path);
//            System.out.println("File created at path: "+ createdFilepath);

        //------to read from file
        Path path2 = Paths.get("D:/data/java/training/file.txt");
        byte[] bs= Files.readAllBytes(path2);
        List<String> str = Files.readAllLines(path2);
        System.out.println("Read bytes: :" + new String(bs));
        System.out.println("Read Lines: "+ str);



    }
}
