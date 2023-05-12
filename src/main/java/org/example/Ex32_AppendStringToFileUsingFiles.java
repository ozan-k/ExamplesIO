package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Ex32_AppendStringToFileUsingFiles {
    // Appends a string to a file using the static method writeString()
    public static void main(String[] args) {
        String[] names = {"Rick", "Morty", "Birdperson", "Beth", "Summer", "Jerry"};
        String content =
                String.join(System.lineSeparator(), names)
                        + System.lineSeparator()
                        + "---"
                        + System.lineSeparator();
        Path path = Path.of("src/main/resources/files-append-names.txt");

        try {
            Files.writeString(path, content, CREATE, APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
