package io.nouran.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nouran.springbootstarter.entities.Movie;
import io.nouran.springbootstarter.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/movies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@RequestMapping("/movies/{id}")
	public Movie getMovie(@PathVariable String id){
		return movieService.getMovie(Integer.parseInt(id));
	}	
	
}
