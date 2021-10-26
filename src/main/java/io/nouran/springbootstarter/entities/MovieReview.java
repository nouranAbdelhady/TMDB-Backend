/*
package io.nouran.springbootstarter.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "movie_review")
public class MovieReview implements Serializable {

	@Id
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@Id
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	//rating = number of starts (from 5)
	private int rating;
	private String comment;

	public MovieReview(Movie movie, User user, int rating, String comment) {
		this.movie = movie;
		this.user = user;
		this.rating = rating;
		this.comment = comment;
	}

	public MovieReview() {
		super();
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
*/