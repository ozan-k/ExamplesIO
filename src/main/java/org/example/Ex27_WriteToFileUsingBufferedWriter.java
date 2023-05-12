package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex27_WriteToFileUsingBufferedWriter {
    // Writes, line by line, an array of names to a file using BufferedWriter
    public static void main(String[] args) {
        File file = new File("src/main/resources/bufferedwriter-write-names.txt");
        String[] names = {"Rick", "Morty", "Birdperson", "Beth", "Summer", "Jerry", "Mr. Meeseeks"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String name : names) {
                writer.write(name);
                // We now have a dedicated method for adding a new line
                writer.newLine();
            }
            writer.write("---");
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
