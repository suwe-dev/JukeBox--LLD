package com.example.lld.entities;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseEntity {
    private List<Playlist> playlists;
    private Integer currPlaylistIndex;

    public User(String id, String name, List<Playlist> playlists, Integer currPlaylistIndex) {
        this.playlists = playlists;
        this.currPlaylistIndex = currPlaylistIndex;
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.playlists = new ArrayList<>();
        this.currPlaylistIndex = 0;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public Integer getCurrPlaylistIndex() {
        return currPlaylistIndex;
    }
}
