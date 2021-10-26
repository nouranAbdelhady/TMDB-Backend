package io.nouran.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;
import io.nouran.springbootstarter.entities.Genre;
import io.nouran.springbootstarter.entities.Movie;

public interface GenreRepository extends CrudRepository<Genre, Integer> {
	
	Genre findById(int id);
}