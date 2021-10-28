package io.nouran.springbootstarter.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nouran.springbootstarter.entities.Movie;
import io.nouran.springbootstarter.entities.MovieReview;
import io.nouran.springbootstarter.entities.User;
import io.nouran.springbootstarter.repository.MovieRepository;
import io.nouran.springbootstarter.repository.UserRepository;

@Service
public class MovieReviewService {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<MovieReview> getAllReviews(Movie targetedMovie){        
		//User dummyUser = new User("dummy", "user", 16 , "anyonea@gmail.com" , "pass");
		
		User targetedUser =  userService.getUser(1);
		MovieReview newReview = new MovieReview (targetedMovie , targetedUser , 4 , "Very Good!");
		
		targetedMovie.getMovieReview().add(newReview);
		targetedUser.getMovieReviews().add(newReview);
		
		//movieRepository.save(targetedMovie);   
		//userRepository.save(targetedUser);
                 
        //String output = "Get all reviews for \nMovie: "+targetedMovie.toString();
        //output+="\n with movie id: "+targetedMovie.getId();
        //return output;
        
		List<MovieReview> movieReviews = targetedMovie.getMovieReview();
        return movieReviews;
    }
	
		
}
