package com.endava.movie.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Movie implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Date releaseDate;

    @Column(nullable = false)
    private int rating;

    @Column(nullable = false)
    private String imdbLink;


    protected Movie() {
    }

    public Movie(String title, Date releaseDate, int rating, String imdbLink) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.imdbLink = imdbLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
