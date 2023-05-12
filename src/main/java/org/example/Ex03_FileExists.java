package org.example;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex03_FileExists {
    public static void main(String[] args) {
        String pathname = "src/main/resources/names.txt";

        File file = new File(pathname);
        System.out.printf("File '%s' exists? %b%n", file, file.exists());

        Path path = Path.of(pathname);
        System.out.printf("File '%s' exists? %b%n", path, Files.exists(path));
    }
}
