package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex23_ReadLineByLineUsingStreamFiles {
    // Reads a file_manipulation.file, line by line, using the static method lines() of the {@link Files} class.
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/names.txt");
        List<String> names = null;

        try {
            names = Files.lines(path).toList();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Names: " + names);
    }
}
