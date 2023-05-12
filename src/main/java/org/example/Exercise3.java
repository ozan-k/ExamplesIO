package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        String currentFilename = "src/main/resources/athletes.data";
        List<Athlete> athletes = readAthletesFromFile(currentFilename);
        System.out.println("File read.");
        System.out.println(athletes);
    }

    public static List<Athlete> readAthletesFromFile(String filename) {
        Path path = Path.of("src/main/resources/athletes.data");
        List<Athlete> result = new ArrayList<>();

        try {
            Files.lines(path)
            //Files.readAllLines(path).stream()
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
                System.out.println("runner " + la[1]);
                return getRunner(la[1]);
            case "SWIMMER":
                System.out.println("swimmer " + la[1]);
                return getSwimmer(la[1]);
            default:
                System.out.println("nothing");
                return null;
        }
    }

    public static Runner getRunner(String runner){
        String[] runnerArray = runner.split(";");
        Map<String,String> runnerMap =
        Arrays.stream(runnerArray)
                .map(item -> item.split("="))
                .collect(Collectors.toMap(entry -> entry[0], entry -> entry[1]));
        boolean injured = runnerMap.get("injured").equals("true");
        int age = Integer.parseInt(runnerMap.get("age"));
        return new Runner(runnerMap.get("id"), runnerMap.get("name"), age, injured, runnerMap.get("shoes"));
    }

    public static Swimmer getSwimmer(String runner){
        String[] runnerArray = runner.split(";");
        Map<String,String> swimmerMap =
                Arrays.stream(runnerArray)
                        .map(item -> item.split("="))
                        .collect(Collectors.toMap(entry -> entry[0], entry -> entry[1]));
        boolean injured = swimmerMap.get("injured").equals("true");
        //int age = Integer.parseInt(swimmerMap.get("age"));
        return new Swimmer(swimmerMap.get("id"), swimmerMap.get("name"), 0, injured, swimmerMap.get("modality"));
    }

}
