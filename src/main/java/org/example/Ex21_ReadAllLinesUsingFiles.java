package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex21_ReadAllLinesUsingFiles {
    // Reads a file, line by line, using the static method readAllLines() of the {@link Files} class.
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/names.txt");
        List<String> names = null;

        try {
            names = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Names: " + names);
    }
}
