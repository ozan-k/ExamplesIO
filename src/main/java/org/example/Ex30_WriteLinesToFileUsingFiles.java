package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.List;

public class Ex30_WriteLinesToFileUsingFiles {
    // Writes a collection of lines to a file using the static method write()
    public static void main(String[] args) {
        Collection<String> lines = List.of("Rick", "Morty", "Birdperson", "Beth", "Summer", "Jerry");
        Path path = Path.of("src/main/resources/files-write-names.txt");

        try {
            Files.write(path, lines, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
