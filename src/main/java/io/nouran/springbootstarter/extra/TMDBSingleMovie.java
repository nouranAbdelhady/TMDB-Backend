package io.nouran.springbootstarter.extra;

import java.sql.Date;
import java.util.List;

public class TMDBSingleMovie {

	private int id;
    private String title;
    private String overview;
    private String poster_path;
    private String original_language;
    private List<Integer> genre_ids;
    private boolean adult;
    private boolean video;
    private Date release_date;
    private int vote_count;
    private int vote_average;
    private int popularity;
    
    public TMDBSingleMovie(int id, String title, String overview, String poster_path, String original_language,
			List<Integer> genre_ids, boolean adult, boolean video, Date release_date, int vote_count, int vote_average,
			int popularity) {
		super();
		this.id = id;
		this.title = title;
		this.overview = overview;
		this.poster_path = poster_path;
		this.original_language = original_language;
		this.genre_ids = genre_ids;
		this.adult = adult;
		this.video = video;
		this.release_date = release_date;
		this.vote_count = vote_count;
		this.vote_average = vote_average;
		this.popularity = popularity;
	}

	public TMDBSingleMovie() {}
    
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
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	public String getOriginal_language() {
		return original_language;
	}
	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}
	public List<Integer> getGenre_ids() {
		return genre_ids;
	}
	public void setGenre_ids(List<Integer> genre_ids) {
		this.genre_ids = genre_ids;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public boolean isVideo() {
		return video;
	}
	public void setVideo(boolean video) {
		this.video = video;
	}
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	public int getVote_count() {
		return vote_count;
	}
	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}
	public int getVote_average() {
		return vote_average;
	}
	public void setVote_average(int vote_average) {
		this.vote_average = vote_average;
	}
	public int getPopularity() {
		return popularity;
	}
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	
	@Override
    public String toString() {
        return "TMDBSingleMovie {" +
                ", id=" + id + '\'' +
                ", title='" + title + '\'' +
                ", overview='" + overview + '\'' +
                ", poster_path='" + poster_path + '\'' +
                ", original_language='" + original_language + '\'' +
                ", genre_ids=" + genre_ids + '\'' +
                ", adult=" + adult + '\'' +
                ", video=" + video + '\'' +
                ", release_date=" + release_date + '\'' +
                ", vote_count=" + vote_count + '\'' +
                ", vote_average=" + vote_average + '\'' +
                "popularity=" + popularity  + '\''  +
                '}';
    }
}