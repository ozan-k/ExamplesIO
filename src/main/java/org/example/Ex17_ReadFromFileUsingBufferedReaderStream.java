package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Ex17_ReadFromFileUsingBufferedReaderStream {
    // Reads a file, line by line, using a BufferedReader and the lines() method.
    public static void main(String[] args) {
        File file = new File("src/main/resources/names.txt");
        List<String> names = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            names = reader.lines()
                    .toList();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Names: " + names);
    }
}
