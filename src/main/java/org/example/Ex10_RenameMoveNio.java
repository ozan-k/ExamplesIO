package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex10_RenameMoveNio {
    public static void main(String[] args) {
        try {
            Path file = Path.of("nio_resources/hello.txt");
            Files.writeString(file, "Hello students!");

            Path renamedFile = Path.of("nio_resources/hello2.txt");
            Files.move(file, renamedFile);

            Path movedFile = Path.of("nio_resources/sub1/sub2/hello2.txt");
            Files.move(renamedFile, movedFile);

            Path copiedFile = Path.of("nio_resources/sub1/sub2/copied.txt");
            Files.copy(movedFile, copiedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
