package io.nouran.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;

import io.nouran.springbootstarter.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	//User findByUserId(int userId);

}
