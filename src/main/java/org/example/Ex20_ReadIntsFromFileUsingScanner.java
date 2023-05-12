package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex20_ReadIntsFromFileUsingScanner {
    // Reads a file, number by number, using a Scanner, until a non-number character is found.
    public static void main(String[] args) {
        File file = new File("src/main/resources/myNumbers.txt");
        List<Integer> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                list.add(number);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Numbers: " + list);
    }
}
