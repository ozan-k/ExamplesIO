package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex13_ReadFromFileUsingFileReader {
    public static void main(String[] args) {
        File file = new File("src/main/resources/names.txt");
        List<String> names = new ArrayList<>();

        try (FileReader reader = new FileReader(file)) {
            String name = "";

            while (reader.ready()) {
                char character = (char) reader.read();

                if (character == '\n') {
                    names.add(name);
                    name = "";
                } else {
                    name += character;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(names);
    }
}
