package com.yusuf.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
               SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusicList();
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer2.playMusicList();
//        Alternative alternative = context.getBean("musicBean", Alternative.class);
//        alternative.getSong();
//        System.out.println(alternative);
        musicPlayer.playMusic(Genre.ALTERNATIVE);
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//
//        firstMusicPlayer.setVolume(25);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());
        context.close();
    }
}
