package org.example;

import java.io.*;

public class Ex29_WriterComparison {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("resources/test.txt");
        writer.write("Hello\n");
        char[] chars = { 'H','e','l','l','o',' ','2','\n'};
        writer.write(chars);
        writer.write("Hello 3\n",1,7);
        writer.append("Hello 4\n");

        // Extends OutputStreamWriter, which extends Writer, and adds getEnconding()
        FileWriter fileWriter = (FileWriter) writer;
        System.out.println("File encoding: "+fileWriter.getEncoding());
        fileWriter.write("Hello 5\n");
        fileWriter.append("Hello 6\n");

        // Extends Writer; adds newLine()
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello 7");
        bufferedWriter.newLine();

        // Extends Writer; adds print(), println(), printf(), and checkError() methods
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        printWriter.print("Hello 8\n");
        printWriter.println("Hello 9");
        printWriter.printf("Hello %d %n",10);
        System.out.printf("Check error: %b", printWriter.checkError());

        printWriter.close();;
    }
}
