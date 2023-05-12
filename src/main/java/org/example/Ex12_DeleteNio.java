package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex12_DeleteNio {
    public static void main(String[] args) {
        try {
            Path copiedFile = Path.of("nio_resources/sub1/sub2/copied.txt");
            Files.delete(copiedFile);

            // Files.delete() only deletes empty directories
            Path folder = Path.of("nio_resources");
            Files.delete(folder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
