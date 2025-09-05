package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "embedded_movies")
public class EmbeddedMovie {
    @Id
    private String id;
    private String title;
    private String plot;
    private List<String> genres;
    private List<String> cast;
    private Integer year;

    public EmbeddedMovie() {}

    public EmbeddedMovie(String title, String plot, List<String> genres, List<String> cast, Integer year) {
        this.title = title;
        this.plot = plot;
        this.genres = genres;
        this.cast = cast;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}