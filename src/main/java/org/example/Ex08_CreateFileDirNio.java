package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex08_CreateFileDirNio {
    public static void main(String[] args) {
        try {
            Path folder = Path.of("nio_resources");
            Files.createDirectory(folder);

            Path subfolder = Path.of("nio_resources/sub1/sub2");
            Files.createDirectories(subfolder);

            Path file = Path.of("nio_resources/hello.txt");
            Files.createFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
