package io.nouran.springbootstarter.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import io.nouran.springbootstarter.extra.TMDBGenre;

@Entity
@Table(name = "genre")
public class Genre implements Serializable {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "genre_name")
	private String name;

	@ManyToMany(mappedBy = "genres")
    private List<Movie> movies;

	public Genre() {
		super();	
	}
	
	public Genre(String name) {
		this.name = name;
		this.movies = new ArrayList<>();
	}
	
	public Genre(String name, List<Movie> movies) {
        this.name = name;
        this.movies = movies;
    }
	
	/*
	public Genre(TMDBGenre genreObject) {
		this.id = genreObject.;
		this.name = name;
        this.movies = movies
	}
	*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	@Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", movies=" + movies + '}';
    }
	
}