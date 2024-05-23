package com.example.lld.entities;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final String id;
    private final String name;
    private final List<Song> songs;
    private Integer currSongIndex;

    public Playlist(String id, String name) {
        this.id = id;
        this.name = name;
        this.songs = new ArrayList<>();
        this.currSongIndex = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Integer getCurrSongIndex() {
        return currSongIndex;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
        if (currSongIndex >= songs.size()) {
            currSongIndex = songs.size() - 1;
        }
    }

    public void playSong() throws InterruptedException {
        if(songs.isEmpty()) {
            System.out.println("No Songs to play...");
        } else {
            Song currSong = songs.get(currSongIndex);
            System.out.println("Playing: " + currSong);
        }
    }

    public void nextSong() throws InterruptedException {
        if(currSongIndex < songs.size() - 1){
            currSongIndex++;
        } else {
            currSongIndex = 0;
        }
        playSong();
    }

    public void prevSong() throws InterruptedException {
        if(currSongIndex > 0) {
            currSongIndex--;
        } else {
            currSongIndex = songs.size() - 1;
        }
        playSong();
    }

    @Override
    public String toString() {
        return "Playlist [ id = " + id + ", name = " + name + ", songs = " + songs + ", currSongIndex = " + currSongIndex + " ]";
    }

}
