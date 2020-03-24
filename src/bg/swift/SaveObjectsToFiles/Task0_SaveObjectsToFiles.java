package bg.swift.SaveObjectsToFiles;

import java.io.*;

public class Task0_SaveObjectsToFiles {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("object.txt");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Movie movie = new Movie("The Mask", "Chuck Russel",
                    new String[]{"Jim Carey", "Cameron Diaz", "Chuck Russel"}, "July - 1994");
            objectOutputStream.writeObject(movie);

            Movie theMask = (Movie) objectInputStream.readObject();
            System.out.println(theMask.getActors());
            System.out.println(theMask.getTitle());
        }
    }
}
