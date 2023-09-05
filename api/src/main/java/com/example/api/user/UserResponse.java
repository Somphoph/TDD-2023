package com.example.api.user;

import java.util.Objects;

public class UserResponse{
	private String firstname;
	private int id;
	private String lastname;

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public String getFirstname(){
		return firstname;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getLastname(){
		return lastname;
	}

	@Override
 	public String toString(){
		return 
			"UserResponse{" + 
			"firtname = '" + firstname + '\'' +
			",id = '" + id + '\'' + 
			",lastname = '" + lastname + '\'' + 
			"}";
		}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UserResponse that = (UserResponse) o;
		return id == that.id && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstname, id, lastname);
	}
}
