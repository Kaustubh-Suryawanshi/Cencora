package com.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class dirs_using_NIO_Demo {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("D:/test");
//        Path path2 = Paths.get("D:/test/java7");
        Path path3 = Paths.get("D:/test/java7/Files");

//        Path c1=Files.createDirectory(path);
//        Path c2=Files.createDirectory(path2);
//        Path c3=Files.createDirectory(path3);

//        --OR

        Path c1= Files.createDirectories(path3);

        // file.toPath() & path.toFile();
    }
}
