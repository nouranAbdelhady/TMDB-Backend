package io.nouran.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;

import io.nouran.springbootstarter.entities.Movie;

public interface MovieRepository extends CrudRepository<Movie, String> {

	Movie findById(int id);

}
