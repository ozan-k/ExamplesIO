package org.example;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex05_DirectoryContentsIo {
    public static void main(final String[] args) throws IOException {
        String dir = "src/main/java/org/example/";
        String extension = "java";

        File file = new File(dir);

        System.out.println("Listing files in directory: " + file.getCanonicalPath());
        System.out.println("Filtering files with extension: " + extension);

        FilenameFilter fnf = (File _dir, String name) -> name.endsWith(extension);
        File[] files = file.listFiles(fnf);

        Stream.ofNullable(files)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
    }
}
