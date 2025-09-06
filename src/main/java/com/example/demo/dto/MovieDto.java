package com.example.demo.dto;

import com.example.demo.model.Movie;

import java.util.Date;
import java.util.List;

public class MovieDto {
    private String fullplot;
    private Movie.Imdb imdb;
    private Integer year;
    private String plot;
    private List<String> genres;
    private String rated;
    private Integer metacritic;
    private String title;
    private String lastupdated;
    private List<String> languages;
    private List<String> writers;
    private String type;
    private Movie.Tomatoes tomatoes;
    private String poster;
    private Integer numMflixComments;
    private Date released;
    private Movie.Awards awards;
    private List<String> countries;
    private List<String> cast;
    private List<String> directors;
    private Integer runtime;

    public static class Imdb {
        private Double rating;
        private Integer votes;
        private Integer id;

        public Double getRating() {
            return rating;
        }

        public void setRating(Double rating) {
            this.rating = rating;
        }

        public Integer getVotes() {
            return votes;
        }

        public void setVotes(Integer votes) {
            this.votes = votes;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }
    public static class Tomatoes {
        private String website;
        private Movie.Tomatoes.Rating viewer;
        private Date dvd;
        private Movie.Tomatoes.Rating critic;
        private String boxOffice;
        private String consensus;
        private Integer rotten;
        private String production;
        private Date lastUpdated;
        private Integer fresh;
        public static class Rating {
            private Double rating;
            private Integer numReviews;
            private Integer meter;

            public Double getRating() {
                return rating;
            }

            public void setRating(Double rating) {
                this.rating = rating;
            }

            public Integer getNumReviews() {
                return numReviews;
            }

            public void setNumReviews(Integer numReviews) {
                this.numReviews = numReviews;
            }

            public Integer getMeter() {
                return meter;
            }

            public void setMeter(Integer meter) {
                this.meter = meter;
            }
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public Movie.Tomatoes.Rating getViewer() {
            return viewer;
        }

        public void setViewer(Movie.Tomatoes.Rating viewer) {
            this.viewer = viewer;
        }

        public Date getDvd() {
            return dvd;
        }

        public void setDvd(Date dvd) {
            this.dvd = dvd;
        }

        public Movie.Tomatoes.Rating getCritic() {
            return critic;
        }

        public void setCritic(Movie.Tomatoes.Rating critic) {
            this.critic = critic;
        }

        public String getBoxOffice() {
            return boxOffice;
        }

        public void setBoxOffice(String boxOffice) {
            this.boxOffice = boxOffice;
        }

        public String getConsensus() {
            return consensus;
        }

        public void setConsensus(String consensus) {
            this.consensus = consensus;
        }

        public Integer getRotten() {
            return rotten;
        }

        public void setRotten(Integer rotten) {
            this.rotten = rotten;
        }

        public String getProduction() {
            return production;
        }

        public void setProduction(String production) {
            this.production = production;
        }

        public Date getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(Date lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public Integer getFresh() {
            return fresh;
        }

        public void setFresh(Integer fresh) {
            this.fresh = fresh;
        }
    }
    public static class Awards {
        private Integer wins;
        private Integer nominations;
        private String text;

        public Integer getWins() {
            return wins;
        }

        public void setWins(Integer wins) {
            this.wins = wins;
        }

        public Integer getNominations() {
            return nominations;
        }

        public void setNominations(Integer nominations) {
            this.nominations = nominations;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public String getFullplot() {
        return fullplot;
    }

    public void setFullplot(String fullplot) {
        this.fullplot = fullplot;
    }

    public Movie.Imdb getImdb() {
        return imdb;
    }

    public void setImdb(Movie.Imdb imdb) {
        this.imdb = imdb;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public Integer getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(Integer metacritic) {
        this.metacritic = metacritic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getWriters() {
        return writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Movie.Tomatoes getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(Movie.Tomatoes tomatoes) {
        this.tomatoes = tomatoes;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Integer getNumMflixComments() {
        return numMflixComments;
    }

    public void setNumMflixComments(Integer numMflixComments) {
        this.numMflixComments = numMflixComments;
    }

    public Date getReleased() {
        return released;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public Movie.Awards getAwards() {
        return awards;
    }

    public void setAwards(Movie.Awards awards) {
        this.awards = awards;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }
}
