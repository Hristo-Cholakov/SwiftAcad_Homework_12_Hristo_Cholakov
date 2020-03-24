package bg.swift.ListFileStructure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ListFileStructure {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Files.walk(Paths.get(scanner.nextLine().trim()))
                .forEach(path -> System.out.println(path));


    }
}
