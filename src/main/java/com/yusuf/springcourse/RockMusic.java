package com.yusuf.springcourse;

import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;

@Component
public class RockMusic implements Music{
    String[] rockSongs = {"Queen - Bohemian Rhapsody", "GreenDay - Boulevard of broken Dreams",
                            "Beatles - We can work it out"};

    public String[] getRockSongs() {
        return rockSongs;
    }

    @Override
    public String[] getSongs() {
        return getRockSongs();
    }
}
