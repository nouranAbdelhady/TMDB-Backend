package io.nouran.springbootstarter.entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "user_id")
	private long id;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
		
	//@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//private List<MovieReview> movieReviews;

	public User() {
		super();
	}
	
	public User(long id, String firstName, String lastName, int age, String email, String password) {
			//,List<MovieReview> movieReviews) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.password = password;
		//this.movieReviews = movieReviews;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	public List<MovieReview> getMovieReviews() {
		return movieReviews;
	}

	public void setMovieReviews(List<MovieReview> movieReviews) {
		this.movieReviews = movieReviews;
	}
	*/
	
	@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
	
}