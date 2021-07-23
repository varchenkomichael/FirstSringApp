package org.example.springcourses;



import java.util.Collections;
import java.util.List;

public class RapMusic implements Music {
    @Override
    public List<String> getSong() {
        return Collections.singletonList("In the moment");
    }
}
