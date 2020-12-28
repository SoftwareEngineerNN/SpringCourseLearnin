package com.yusuf.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music{
    String[] classicSongs = {"Vivaldi - Year times", "Bethhoven - Symphonia #9", "Mozhart - Little night serenade"};

    public String[] getClassicSongs() {
        return classicSongs;
    }
    @PostConstruct
    public void initInit() {
        System.out.println("Doing my init");
    }
    @PreDestroy
    public void myDestroyMeth() {
        System.out.println("Doing my destroy");
    }



    @Override
    public String[] getSongs() {
        return getClassicSongs();
    }
}
