package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex31_WriteStringToFileUsingFiles {
    // Writes a collection of lines to a file using the static method writeString()
    public static void main(String[] args) {
        String[] names = {"Rick", "Morty", "Birdperson", "Beth", "Summer", "Jerry"};
        String content = String.join(System.lineSeparator(), names) + System.lineSeparator() + "---";
        Path path = Path.of("src/main/resources/files-write-names.txt");

        try {
            Files.writeString(path, content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
