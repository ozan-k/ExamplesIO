package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex19_ReadEntireFileUsingScanner {
    public static void main(String[] args) {
        File file = new File("src/main/resources/names.txt");
        List<String> names = null;

        try (Scanner scanner = new Scanner(file)) {
            // \\Z Matches the end of a string.
            scanner.useDelimiter("\\Z");
            String fileContent = scanner.next();
            String[] lines = fileContent.split("\n");
            names = Arrays.asList(lines);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Names: " + names);
    }
}
