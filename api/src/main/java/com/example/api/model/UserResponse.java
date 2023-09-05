package com.example.api.model;

public class UserResponse{
	private String firtname;
	private int id;
	private String lastname;

	public void setFirtname(String firtname){
		this.firtname = firtname;
	}

	public String getFirtname(){
		return firtname;
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
			"firtname = '" + firtname + '\'' + 
			",id = '" + id + '\'' + 
			",lastname = '" + lastname + '\'' + 
			"}";
		}
}