package io.nouran.springbootstarter.extra;

import java.util.List;

import io.nouran.springbootstarter.entities.Genre;

public class TMDBGenre {
	
	private List<Genre> genres;

    public TMDBGenre() {
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
