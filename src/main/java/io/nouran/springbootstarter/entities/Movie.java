package io.nouran.springbootstarter.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.nouran.springbootstarter.extra.TMDBSingleMovie;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "poster_path")
	private String posterPath;
	
	//too long
	//@Column(name = "overview")
	//private String overview;
	
	@Column(name = "release_date")
	private String releaseDate;
	
	@Column(name = "popularity")
	private int popularity;
	
	@Column(name = "original_language")
	private String originalLanguage;
	
	@Column(name = "vote_average")
	private int voteAverage;
	
	@Column(name = "vote_count")
	private int voteCount;		
    
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "movie_genres",
            joinColumns = @JoinColumn(name = "genre_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private List<Genre> genres;
	
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MovieReview> movieReview;

	public Movie() {
		super();
	}

	public Movie(int id, String title, String posterPath, String releaseDate, 
			int popularity, String originalLanguage, int vote_average, int vote_count,
			List<Genre> genres ) {//, List<MovieReview> movieReview) {
		super();
		this.id = id;
		this.title = title;
		this.posterPath = posterPath;
		//this.overview = overview;
		this.releaseDate = releaseDate;
		this.popularity = popularity;
		this.originalLanguage = originalLanguage;
		this.voteAverage = vote_average;
		this.voteCount = vote_count;
		this.genres = genres;
		//this.movieReview = movieReview;
	}

	public Movie(TMDBSingleMovie movieObject) {
		this.id = movieObject.getId();
		this.title = movieObject.getTitle();
		this.posterPath = movieObject.getPoster_path();
		//this.overview = movieObject.getOverview();
		this.popularity = movieObject.getPopularity();
		this.originalLanguage = movieObject.getOriginal_language();
		this.voteAverage = movieObject.getVote_average();
		this.voteCount = movieObject.getVote_count();
		this.releaseDate = movieObject.getRelease_date().toString();
		this.popularity = movieObject.getPopularity();	
		this.genres = new ArrayList<Genre>();
		this.movieReview = new ArrayList<MovieReview>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getPopularity() {
		return popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	public int getVote_average() {
		return voteAverage;
	}

	public void setVote_average(int voteAverage) {
		this.voteAverage = voteAverage;
	}

	public int getVote_count() {
		return voteCount;
	}

	public void setVote_count(int voteCount) {
		this.voteCount = voteCount;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public List<MovieReview> getMovieReview() {
		return movieReview;
	}

	public void setMovieReview(List<MovieReview> movieReview) {
		this.movieReview = movieReview;
	}
	
	@Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", release_date=" + releaseDate + '\'' +                
                ", poster_path='" + posterPath + '\'' +
                ", vote_count='" + voteCount + '\'' +
                ", vote_average='" + voteAverage + '\'' +
                ", popularity='" + popularity + '\'' +
                ", original_language='" + originalLanguage + '\'' +
                ", genres='" + genres + '\'' +
                ", movie_review='" + movieReview + '\'' +
                '}';
    }
}