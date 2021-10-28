package io.nouran.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.nouran.springbootstarter.entities.Genre;
import io.nouran.springbootstarter.entities.Movie;
import io.nouran.springbootstarter.extra.TMDBAllMovies;
import io.nouran.springbootstarter.extra.TMDBSingleMovie;
import io.nouran.springbootstarter.repository.GenreRepository;
import io.nouran.springbootstarter.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private GenreRepository genreRepository;
	
	//List<Genre> genres = new ArrayList <Genre>( Arrays.asList( new Genre("romance") , new Genre ("comedy") ) );
	
	//list of movies
	/*
	private List<Movie> movies = new ArrayList <Movie> ( Arrays.asList(
			new Movie(456 ,"Movie Title 1" , "www.posterpath.com" , 45 , 80 , 70 , "overview111" , "14 - Oct" , 100 , "English" , 15 , 20 ,  genres)
			) ) ;	
	*/
	
	private static final String BASE_URI = "https://api.themoviedb.org/3/movie/top_rated";
	private static final String API_KEY = "?api_key=a8bd7f3d0cff0c86e330f635ea81ce95";
	
	@PostConstruct
    public void loadMoviesFromTMDB() {
        RestTemplate restTemplate = new RestTemplate();
        
        //int pageCount =1;
        
        for (int pageCount=1 ; pageCount<6 ; pageCount++) 
        {
        	TMDBAllMovies response = restTemplate.getForObject(
	                     				BASE_URI 
	                     				+ API_KEY 
	                                    + "&page=" + pageCount
	                                    + "&language=en-US",
	                                    TMDBAllMovies.class);
            for(TMDBSingleMovie TMDBMovieObject : response.getResults())
            {
                Movie newMovie = new Movie(TMDBMovieObject);
				
                
				 for(int i=0; i<TMDBMovieObject.getGenre_ids().size() ; i++) 
				 { 
					 Genre genre = genreRepository.findById( TMDBMovieObject.getGenre_ids().get(i) ).orElse(null);
					 
					 if (genre != null) 
					 {
						 newMovie.getGenres().add(genre); 						
					 } 
				 }
				 
                
                movieRepository.save(newMovie);   
                //pageCount++;
             }
        } 
    }
    
	
	public List<Movie> getAllMovies(){
		//return movies;
		List<Movie> movies = new ArrayList<Movie>();
		movieRepository.findAll().forEach(movies::add);
		return movies;
	}
	
	
	public Movie getMovie(int id) {
		//return movies.stream().filter(movie -> movie.getId() == id).findFirst().get(); 
		Movie targetedMovie = movieRepository.findById(id);
		return targetedMovie;
	}
}
