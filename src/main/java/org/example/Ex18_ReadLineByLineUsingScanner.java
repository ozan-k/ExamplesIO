package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex18_ReadLineByLineUsingScanner {
    public static void main(String[] args) {
        File file = new File("src/main/resources/names.txt");
        List<String> names = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                names.add(name);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Names: " + names);
    }
}
