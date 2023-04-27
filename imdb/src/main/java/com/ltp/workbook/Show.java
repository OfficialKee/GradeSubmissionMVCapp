package com.ltp.workbook;
import java.util.Objects;

public class Show {
    private String title;
    private String episode;
    private double rating;


    public Show() {
    }

    public Show(String title, String episode, double rating) {
        this.title = title;
        this.episode = episode;
        this.rating = rating;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode() {
        return this.episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Show title(String title) {
        setTitle(title);
        return this;
    }

    public Show episode(String episode) {
        setEpisode(episode);
        return this;
    }

    public Show rating(double rating) {
        setRating(rating);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Show)) {
            return false;
        }
        Show show = (Show) o;
        return Objects.equals(title, show.title) && Objects.equals(episode, show.episode) && rating == show.rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, episode, rating);
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", episode='" + getEpisode() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }
    
    
}
