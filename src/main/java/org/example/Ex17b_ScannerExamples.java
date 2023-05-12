package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex17b_ScannerExamples {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("You typed: " + i);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        Scanner sc1 = new Scanner(new File("src/main/resources/myNumbers.txt"));
        while (sc1.hasNextLong()) {
            long aLong = sc1.nextLong();
            System.out.println("Read: " + aLong);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }
}
