package com.example.david.androidmusicplayer;

/**
 * Created by DAVID on 15/04/2016.
 */
public class Song {

    private long id;
    private String title;
    private String artist;

    public long getId() {return id;}
    public String getTitle() {return title;}
    public String getArtist() { return artist; }

    public Song(long songID, String songTitle, String songArtist) {

        id=songID;
        title=songTitle;
        artist=songArtist;
    }
}
