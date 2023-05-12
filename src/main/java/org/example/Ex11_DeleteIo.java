package org.example;

import java.io.File;

public class Ex11_DeleteIo {
    public static void main(String[] args) {
        File copiedFile = new File("io_resources/sub1/sub2/copied.txt");
        copiedFile.delete();

        // File::delete only deletes empty directories
        File folder = new File("io_resources");
        folder.delete();
    }
}
