package com.codegym.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "artists")
public class Artist{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private Long albumId;

    @ManyToOne
    @JoinColumn(name = "AlbumId")
    private Artist artist;


    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) { this.artist = artist; }

    public Artist() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAlbumId() {  { return id; }
    }

    public void setAlbumId(Long albumId) { this.id = id;}

    public void setAlbum(Album album) { this.al
    }
}
}
