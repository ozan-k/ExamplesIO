package org.example;

import java.io.IOException;
import java.io.PrintWriter;

public class Ex28_WriteToFileUsingPrintWriter {
    // Writes, line by line, an array of names to a file using a PrintWriter
    public static void main(String[] args) {
        String[] names = {"Rick", "Morty", "Birdperson", "Beth", "Summer", "Jerry", "Mr. Meeseeks"};

        try (PrintWriter writer =
                     new PrintWriter("src/main/resources/printwriter-write-names.txt")) {
            for (String name : names) {
                writer.println(name);
            }
            writer.println("---");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
