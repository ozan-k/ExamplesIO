package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Ex22_ReadEntireFileUsingFiles {
    // Reads the entire contents of a file using the static method readString() of the {@link Files} class.
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/names.txt");
        List<String> names = null;

        try {
            String fileContent = Files.readString(path);
            String[] array = fileContent.split("\n");
            names = Arrays.asList(array);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Names: " + names);
    }
}
