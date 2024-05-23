package com.example.lld;

import com.example.lld.entities.Playlist;
import com.example.lld.entities.Song;

public class JukeBox {
    public static void main(String[] args) throws InterruptedException {
        // Create Songs
        Song song1 = new Song("1", "song1");
        System.out.println("Creating Song 1 : " + song1);
        Song song2 = new Song("2", "song2");
        System.out.println("Creating Song 2 : " + song2);
        Song song3 = new Song("3", "song3");
        System.out.println("Creating Song 3 : " + song3);
        Song song4 = new Song("4", "song4");
        System.out.println("Creating Song 4 : " + song4);
        Song song5 = new Song("5", "song5");
        System.out.println("Creating Song 5 : " + song5);

        // Create Playlist
        Playlist evenplaylist = new Playlist("1", "playlist1");
        System.out.println("Creating Playlist 1 : " + evenplaylist);
        Playlist oddplaylist = new Playlist("2", "playlist2");
        System.out.println("Creating Playlist 2 : " + oddplaylist);

        // Adding songs to Playlists
        System.out.println("<-------Adding songs to Playlists------->");
        evenplaylist.addSong(song2);
        evenplaylist.addSong(song4);

        oddplaylist.addSong(song1);
        oddplaylist.addSong(song3);
        oddplaylist.addSong(song5);

        // Playing operation
        System.out.println("Playlists after songs were added");
        System.out.println(evenplaylist);
        System.out.println(oddplaylist);

        System.out.println("Playing " + evenplaylist.getName() + "'s first song...");
        evenplaylist.playSong();
        System.out.println("Playing next song");
        evenplaylist.nextSong();
        System.out.println("Playing next song");
        evenplaylist.nextSong();
        System.out.println("Playing next song");
        evenplaylist.nextSong();
        System.out.println("Current Playing song in the playlist");
        System.out.println(evenplaylist.getSongs().get(evenplaylist.getCurrSongIndex()));

        System.out.println("Playing " + evenplaylist.getName() + "'s first song...");
        oddplaylist.playSong();
        System.out.println("Playing next song");
        oddplaylist.nextSong();
        System.out.println("Playing next song");
        oddplaylist.nextSong();
        System.out.println("Current Playing song in the playlist");
        System.out.println(oddplaylist.getSongs().get(evenplaylist.getCurrSongIndex()));

        System.out.println("Removing songs from playlists");
        evenplaylist.removeSong(song4);
        oddplaylist.removeSong(song5);

        System.out.println("Updated Playlists");
        System.out.println(evenplaylist);
        System.out.println(oddplaylist);

    }
}