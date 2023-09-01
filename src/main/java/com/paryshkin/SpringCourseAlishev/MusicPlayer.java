package com.paryshkin.SpringCourseAlishev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer
{
    private ClassicalMusic classicalMusic;

    //IoC
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic)
    {
        this.classicalMusic = classicalMusic;
    }
    public MusicPlayer(){}

//    public void setMusic(Music music)
//    {
//        this.music = music;
//    }

    public void playMusic()
    {
        System.out.println("Playing: " + classicalMusic.getSong());
    }
}
