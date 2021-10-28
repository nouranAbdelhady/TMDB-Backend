package io.nouran.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nouran.springbootstarter.entities.Movie;
import io.nouran.springbootstarter.entities.MovieReview;
import io.nouran.springbootstarter.service.MovieReviewService;
import io.nouran.springbootstarter.service.MovieService;

@RestController
public class MovieReviewController {

	@Autowired
	private MovieService movieService;
	
	
	@Autowired
	private MovieReviewService movieReviewService;
	
	@RequestMapping("/movies/{id}/reviews")
	public List<MovieReview> getAllMovieReviews(@PathVariable String id){
		
		//String output = "Get all reviews for \nMovie: "+targetedMovie.toString();
        //output+="\n with movie id: "+targetedMovie.getId();
        //return output;
		
		Movie targetedMovie =  movieService.getMovie(Integer.parseInt(id));	
		return movieReviewService.getAllReviews(targetedMovie);
	}	
	
}
