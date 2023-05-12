package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex06_DirectoryContentsPath {
    public static void main(final String[] args) throws IOException {
        String dir = "src/main/java/org/example/";
        String extension = ".java";

        Path path = Path.of(dir);

        System.out.println("Listing files in directory: " + path.toRealPath());
        System.out.println("Filtering files with extension: " + extension);

        Files.list(path)
                .filter(Files::isRegularFile)
                .filter(content -> content.toString().toLowerCase().endsWith(extension))
                .forEach(System.out::println);
    }
}
