package bg.swift.SaveObjectsToFiles;


import java.io.Serializable;
import java.util.Arrays;

public class Movie implements Serializable {
    private String title;
    private String director;
    private String[] actors = new String[3];
    private String releaseDate;

    public Movie(String title, String director, String[] actors, String releaseDate) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return String.format("%s, %s, %s", actors[0], actors[1], actors[2]);
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
