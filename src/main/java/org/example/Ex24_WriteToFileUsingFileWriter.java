package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex24_WriteToFileUsingFileWriter {
    public static void main(String[] args) {
        File file = new File("src/main/resources/filewriter-write-names.txt");
        writeNames(file);
        writeNames(file);
        writeNames(file);
    }

    // Writes, line by line, an array of names to a file using {@link FileWriter}
    private static void writeNames(File file) {
        String[] names = {"Rick", "Morty", "Birdperson", "Beth", "Summer", "Jerry", "Mr. Meeseeks"};

        try (FileWriter writer = new FileWriter(file)) {
            for (String name : names) {
                writer.append(name)
                        .append(System.lineSeparator());
            }
            writer.write("---");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
