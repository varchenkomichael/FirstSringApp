package org.example.springcourses;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music{
private final List<String> classicalSongs = new ArrayList<>
        (Arrays.asList("Hungarian Rhapsody", "Moon Sonata", "Third Simphony"));

    @Override
    public List<String> getSong() {
        return classicalSongs;
    }
}
