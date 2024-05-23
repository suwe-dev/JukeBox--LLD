package com.example.lld.entities;

public class Song {
    private String id;
    private String name;

    public Song() {

    }

    public Song(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Song [ " + "id = " + id + ", name = " + name + " ]";
    }
}
