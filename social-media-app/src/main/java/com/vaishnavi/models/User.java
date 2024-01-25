package com.vaishnavi.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	public User(){
		
	}
	@Id
	private Integer id;
//	@Column(name="my_name")
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private ArrayList<Integer> followers=new ArrayList<>();
	private ArrayList<Integer> following=new ArrayList<>();
	private String gender;
	
	
	
	 User(Integer id, String firstName, String lastName, String email, String password, ArrayList<Integer> followers,
			ArrayList<Integer> following, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.followers = followers;
		this.following = following;
		this.gender = gender;
	}
	
	
	
	

	




	public List<Integer> getFollowers() {
		return followers;
	}




	public void setFollowers(ArrayList<Integer> followers) {
		this.followers = followers;
	}




	public List<Integer> getFollowing() {
		return following;
	}




	public void setFollowing(ArrayList<Integer> following) {
		this.following = following;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
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
	
	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}





	


	




	

}
