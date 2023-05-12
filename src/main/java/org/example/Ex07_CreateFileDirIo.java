package org.example;

import java.io.File;
import java.io.IOException;

public class Ex07_CreateFileDirIo {
    public static void main(String[] args) {
        try {
            File folder = new File("io_resources");
            folder.mkdir();

            File subfolder = new File("io_resources/sub1/sub2");
            subfolder.mkdirs();

            File file = new File("io_resources/hello.txt");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
