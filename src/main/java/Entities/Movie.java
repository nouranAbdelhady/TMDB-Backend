package Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String title;
	private String posterPath;
	private int runTime;
	private long budget;
	private long revenue;
	private String overview;
	private String releaseDate;
	private int popularity;
	private String originalLanguage;
	private int vote_average;
	private int vote_count;	
    
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "movie_genre", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
	private List<Genre> genres;
	
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MovieReview> movieReview;

	public Movie() {
		super();
	}

	public Movie(long id, String title, String posterPath, int runTime, long budget, long revenue, String overview,
			String releaseDate, int popularity, String originalLanguage, int vote_average, int vote_count,
			List<Genre> genres, List<MovieReview> movieReview) {
		super();
		this.id = id;
		this.title = title;
		this.posterPath = posterPath;
		this.runTime = runTime;
		this.budget = budget;
		this.revenue = revenue;
		this.overview = overview;
		this.releaseDate = releaseDate;
		this.popularity = popularity;
		this.originalLanguage = originalLanguage;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
		this.genres = genres;
		this.movieReview = movieReview;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public long getRevenue() {
		return revenue;
	}

	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
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
		return vote_average;
	}

	public void setVote_average(int vote_average) {
		this.vote_average = vote_average;
	}

	public int getVote_count() {
		return vote_count;
	}

	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
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
	
	
	
	
}