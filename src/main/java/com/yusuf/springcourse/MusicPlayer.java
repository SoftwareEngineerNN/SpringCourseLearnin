package com.yusuf.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("prototype")
public class MusicPlayer {
        private Music music1;
        private Music music2;
        private Music music3;
    //    private List<Music> musicList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {

    }
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("alternativeMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }
    //    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }

    //    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
    @PostConstruct
    public void doMyInit() {
        System.out.println("Get started initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroying bean");
    }

    public void playMusic(Genre genre) {
        int numOfArr = (int) (Math.random() * 3);
        switch (genre) {
            case CLASSICAL:
                System.out.println(music1.getSongs()[numOfArr]);
                break;
            case ROCK:
                System.out.println(music2.getSongs()[numOfArr]);
                break;
            case ALTERNATIVE:
                System.out.println(music3.getSongs()[numOfArr]);
                break;
        }
    }

//    public void playMusicList() {
//        for (int i = 0; i < musicList.size() ; i++) {
//            System.out.println(musicList.get(i).getSong());
//        }
//    }


}
