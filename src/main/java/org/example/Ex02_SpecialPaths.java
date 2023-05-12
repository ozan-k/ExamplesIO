package org.example;

import java.io.IOException;
import java.nio.file.Path;

public class Ex02_SpecialPaths {
    public static void main(final String[] args) throws IOException {
        printPathInfo( ".");
        printPathInfo( "");
        printPathInfo( "src/..");
    }

    private static void printPathInfo(String pathname) throws IOException {
        Path path = Path.of(pathname);
        System.out.println("Path = " + path);
        System.out.println("Absolute path = " + path.toAbsolutePath());
        System.out.println("Canonical path = " + path.toRealPath());
        System.out.println("File name = " + path.getFileName());
        System.out.println("Parent directory = " + path.getParent());
        System.out.println("Is absolute = " + path.isAbsolute());
        System.out.println("---\n");
    }
}
