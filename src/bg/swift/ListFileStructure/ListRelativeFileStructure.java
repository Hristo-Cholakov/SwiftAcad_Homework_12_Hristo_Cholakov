package bg.swift.ListFileStructure;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ListRelativeFileStructure {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Files.walk(Paths.get(line.trim()))
                .forEach(path -> System.out.println(path.toString().replace(line, "")));
    }
}

