package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String currentFilename = "src/main/resources/athletes.data";
        List<Athlete> athletes = readAthletesFromFile(currentFilename);
        System.out.println("File read.");
        System.out.println(athletes);
    }

    public static List<Athlete> readAthletesFromFile(String filename) {
        File file = new File("src/main/resources/athletes.data");
        List<Athlete> result = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.add(processLine(line));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return result;

    }
    public static Athlete processLine(String line){
        String[] la = line.split("\\|");
        switch(la[0]) {
            case "RUNNER":
                System.out.println("runner");
                return new Runner();
            case "SWIMMER":
                System.out.println("swimmer");
                return new Swimmer();
            default:
                System.out.println("nothing");
                return null;
        }
    }

}
