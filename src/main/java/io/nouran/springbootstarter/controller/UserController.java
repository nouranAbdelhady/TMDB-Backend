package io.nouran.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nouran.springbootstarter.entities.User;
import io.nouran.springbootstarter.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<User> getAllUser(){
		return userService.getAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable String id){
		return userService.getUser(Integer.parseInt(id));
	}
	
	@RequestMapping("/login")
	public String login() {
		return userService.login();
	}
	
}
