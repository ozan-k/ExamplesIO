package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Exercise4 {
    public static void main(String[] args) {
        String currentFilename = "src/main/resources/athletes.data";
        List<Athlete> athletes = readAthletesFromFile(currentFilename);
        System.out.println("File read.");
        //System.out.println(athletes);

        Swimmer s1 = new Swimmer("1234", "Michael", 35, false, "freestyle");
        Runner r1 = new Runner("1235", "Usain", 30, false, "Nike");

        String newFilename = "src/main/resources/new-athletes.data";
        boolean didWrite = writeAthletesToFile(newFilename, List.of(s1, r1));
        System.out.println("File " + (didWrite ? "written." : "NOT written."));
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
                //System.out.println("runner " + la[1]);
                return getRunner(la[1]);
            case "SWIMMER":
                //System.out.println("swimmer " + la[1]);
                return getSwimmer(la[1]);
            default:
                //System.out.println("nothing");
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

    public static String getSwimmerString(Swimmer s){
        String result = "SWIMMER|name=";
        result += s.getName() + ";id=" + s.getId() +";modality=";
        result += s.getModality() + ";injured=" + (s.isInjured() ? "true" : "false");
        return result;
    }
    public static String getRunnerString(Runner r){
        String result = "RUNNER|name=";
        result += r.getName() + ";age=" + r.getAge() + ";id=" + r.getId();
        result += ";shoes=" +r.getShoes() + ";injured=";
        result += (r.isInjured() ? "true" : "false");
        return result;
    }

    public static String getAthleteString(Athlete a){
        if (a instanceof Runner){
            return getRunnerString((Runner) a);
        } else if (a instanceof Swimmer) {
            return getSwimmerString((Swimmer) a);
        } else return "";
    }
    public static boolean writeAthletesToFile(String filename, List<Athlete> athletes){
        Path path = Path.of("src/main/resources/path-athletes.txt");
        boolean flag;
        athletes.stream().forEach(item -> {
            try {
                Files.writeString(path,
                        getAthleteString(item) + System.lineSeparator(),
                            CREATE,
                            APPEND);
            } catch (IOException e) {
                    e.printStackTrace();
            }
        });
        return true;
    }
}
