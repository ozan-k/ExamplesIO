package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        String currentFilename = "src/main/resources/athletes.data";
        List<Athlete> athletes = readAthletesFromFile(currentFilename);
        System.out.println("File read.");
        System.out.println(athletes);
    }

    public static List<Athlete> readAthletesFromFile(String filename) {
        File file = new File("src/main/resources/athletes.data");
        List<Athlete> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.lines()
                    .forEach(line -> result.add(processLine(line)));
        } catch (IOException e) {
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
