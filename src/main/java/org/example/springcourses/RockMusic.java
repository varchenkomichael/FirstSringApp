package org.example.springcourses;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RockMusic implements Music {
    private List<String> rockSongs = new ArrayList<>
            (Arrays.asList("Snuff", "Come together", "Show must go on"));

    @Override
    public List<String> getSong() {
        return rockSongs;
    }
}
