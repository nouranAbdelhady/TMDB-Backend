package io.nouran.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.nouran.springbootstarter.entities.Genre;
import io.nouran.springbootstarter.entities.Movie;
import io.nouran.springbootstarter.extra.TMDBGenre;
import io.nouran.springbootstarter.repository.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
    GenreRepository genreRepository;
	
	private static final String BASE_URI = "https://api.themoviedb.org/3/genre/movie/list";
	private static final String API_KEY = "?api_key=a8bd7f3d0cff0c86e330f635ea81ce95";	
	
    @PostConstruct
    public void loadGenresFromTMDB() {
        RestTemplate restTemplate = new RestTemplate();
        TMDBGenre response = restTemplate.getForObject(
                        		BASE_URI + API_KEY
                                + "&language=en-US",
                                TMDBGenre.class);
        for(Genre genre : response.getGenres())
        {
            genreRepository.save(genre);
        }
    }
    
    public List<Genre> getAllGenres(){
        List<Genre> genres = new ArrayList<Genre>();
        genreRepository.findAll().forEach(genres::add);
        return genres;
    }

    public Genre getGenre(int id){
    	Genre targetedGenre = genreRepository.findById(id);
		return targetedGenre;
    }

}
