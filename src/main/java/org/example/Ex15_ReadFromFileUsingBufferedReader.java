package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex15_ReadFromFileUsingBufferedReader {
    // Reads a file, line by line, using a BufferedReader. Loops using readLine()
    public static void main(String[] args) {
        File file = new File("src/main/resources/names.txt");
        List<String> names = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();

            while (line != null) {
                names.add(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Names: " + names);
    }
}
