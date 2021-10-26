package io.nouran.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nouran.springbootstarter.entities.Genre;
import io.nouran.springbootstarter.service.GenreService;

@RestController
public class GenreController {

	@Autowired
	private GenreService genreService;
	
	@RequestMapping("/genres")
	public List<Genre> getAllGenres(){
		return genreService.getAllGenres();
	}

	@RequestMapping("/genres/{id}")
	public Genre getGenre(@PathVariable String id){
		return genreService.getGenre(Integer.parseInt(id));
	}	
	
}
