package io.nouran.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;
import io.nouran.springbootstarter.entities.Genre;

public interface GenreRepository extends CrudRepository<Genre, Integer> {
	
}