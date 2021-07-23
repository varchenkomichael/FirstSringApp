package org.example.springcourses;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Value("${musicPlayer.volume}")
    private int volume;

    @Value("${musicPlayer.name}")
    private String name;

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }


    public String playMusic() {
        Random random = new Random();
        Music music = musicList.get(random.nextInt(musicList.size()));
        return music.getSong().get(random.nextInt(3));
    }
}

