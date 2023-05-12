package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex25_AppendToFileUsingFileWriter {
    public static void main(String[] args) {
        File file = new File("src/main/resources/filewriter-append-names.txt");
        appendNames(file);
        appendNames(file);
    }

    // Appends, line by line, an array of names to a file using a FileWriter
    private static void appendNames(File file) {
        String[] names = {"Gearhead", "Squanchy", "Unity", "Tammy", "Jessica", "Mr. Goldenfold"};

        // The boolean parameter in the constructor opens the file in "append-mode"
        try (FileWriter writer = new FileWriter(file, true)) {
            for (String name : names) {
                writer.append(name).append(System.lineSeparator());
            }
            writer.write("---" + System.lineSeparator());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
