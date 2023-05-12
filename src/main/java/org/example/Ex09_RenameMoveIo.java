package org.example;

import java.io.*;

public class Ex09_RenameMoveIo {
    public static void main(String[] args) {
        try {
            File file = new File("io_resources/hello.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.print("Hello students!");
            writer.close();

            File renamedFile = new File("io_resources/hello2.txt");
            file.renameTo(renamedFile);

            File movedFile = new File("io_resources/sub1/sub2/hello2.txt");
            renamedFile.renameTo(movedFile);

            File copiedFile = new File("io_resources/sub1/sub2/copied.txt");
            BufferedReader reader = new BufferedReader(new FileReader(movedFile));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(copiedFile));
            int value;
            while(reader.ready()){
                value = reader.read();
                writer2.write(value);
            }
            reader.close();
            writer2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
