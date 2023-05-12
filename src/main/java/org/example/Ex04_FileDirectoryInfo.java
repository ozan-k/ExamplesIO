package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;

public class Ex04_FileDirectoryInfo {
    public static void main(final String[] args) throws IOException {
        File file = new File("src/main/resources/names.txt");
        System.out.println("About `" + file + "` :");
        System.out.println("Exists = " + file.exists());
        System.out.println("Is directory = " + file.isDirectory());
        System.out.println("Is file = " + file.isFile());
        System.out.println("Is hidden = " + file.isHidden());
        System.out.println("Is readable = " + file.canRead());
        System.out.println("Is writable = " + file.canWrite());
        System.out.println("Is executable = " + file.canExecute());
        System.out.println("Last modified = " + new Date(file.lastModified()));
        System.out.println("Length = " + file.length() + " bytes\n");

        Path path = Path.of("src/main/resources");
        System.out.println("About `" + path + "` :");
        System.out.println("Exists = " + Files.exists(path));
        System.out.println("Is directory = " + Files.isDirectory(path));
        System.out.println("Is file = " + Files.isRegularFile(path));
        System.out.println("Is hidden = " + Files.isHidden(path));
        System.out.println("Is readable = " + Files.isReadable(path));
        System.out.println("Is writable = " + Files.isWritable(path));
        System.out.println("Is executable = " + Files.isExecutable(path));
        System.out.println("Last modified = " + Files.getLastModifiedTime(path));
        System.out.println("Length = " + Files.size(path) + " bytes");
    }
}
