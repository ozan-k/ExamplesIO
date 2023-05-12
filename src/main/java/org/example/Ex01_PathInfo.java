package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Ex01_PathInfo {
    public static void main(final String[] args) throws IOException {
        String pathname = "src/main/../main/resources/names.txt";

        File file = new File(pathname);
        System.out.println("Absolute path = " + file.getAbsolutePath());
        System.out.println("Canonical path = " + file.getCanonicalPath());
        System.out.println("File name = " + file.getName());
        System.out.println("Parent directory = " + file.getParent());
        System.out.println("Is absolute = " + file.isAbsolute());
        System.out.println();

        Path path = Path.of(pathname);
        System.out.println("Absolute path = " + path.toAbsolutePath());
        System.out.println("Canonical path = " + path.toRealPath());
        System.out.println("File name = " + path.getFileName());
        System.out.println("Parent directory = " + path.getParent());
        System.out.println("Is absolute = " + path.isAbsolute());
    }
}
