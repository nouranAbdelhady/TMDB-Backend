package io.nouran.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nouran.springbootstarter.entities.User;
import io.nouran.springbootstarter.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	@PostConstruct
    private void addUsersToDatabase(){
		User user = new User("Nouran", "Abdelhady", 20 , "nouranahady@gmail.com" , "password1");
        userRepository.save(user);
        
        User user2 = new User("Salma", "Azzam", 19 , "salmaazzam@gmail.com" , "password2");
        userRepository.save(user2);
       
    }
	
	public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
	
	public User getUser(int userId) {
		User targetedMovie = userRepository.findById(userId).orElse(null); //findByUserId(userId);
		return targetedMovie;
	}
	
	public String login() {
		
		String outputString = "Incorrect email";
		
		//List<User> users = new ArrayList<>();
        //userRepository.findAll().forEach(users::add);
		
		List<User> users = getAllUsers();
		
		Scanner scanner= new Scanner(System.in); 
		
		System.out.println("Enter email: ");
		String email= scanner.nextLine();  
		
		System.out.println("Enter password: ");
		String password= scanner.nextLine(); 
	
		
		for (int i = 0; i<users.size() ; i++) {
			if ( users.get(i).getEmail().compareTo(email) == 0 ) 
			{
				if ( users.get(i).getPassword().compareTo(password) == 0 ) 
				{
					System.out.println("Login correct");
					outputString = "Login successful!";
					break;
				}
				else 
				{
					System.out.println("Password incorrect");
					outputString = "Incorrect password";
					break;
				}
			}
			
		} 
		return outputString;
	}
	
}
