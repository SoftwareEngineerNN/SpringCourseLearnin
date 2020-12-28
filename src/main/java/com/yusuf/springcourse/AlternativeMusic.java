package com.yusuf.springcourse;

import org.springframework.stereotype.Component;

@Component
public class AlternativeMusic implements Music{
    String[] alternativeSongs = {"Linkin Park - Somewhere I belong","Sum41 - With me",
                "ADTR - Downfall"};


    private AlternativeMusic() {

    }

    public String[] getAlternativeSongs() {
        return alternativeSongs;
    }


    public static AlternativeMusic getAlternative() {
        return new AlternativeMusic();
    }


    public void doMyInit() {
        System.out.println("Get started initialization Alternative Bean");
    }

    public void doMyDestroy() {
        System.out.println("Destroying bean Alternative Bean");
    }


    @Override
    public String[] getSongs() {
        return getAlternativeSongs();
    }
}
