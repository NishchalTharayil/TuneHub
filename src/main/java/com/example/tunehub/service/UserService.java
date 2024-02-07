package com.example.tunehub.service;

import com.example.tunehub.entity.Users;

public interface UserService 
{
	public String addUsers(Users user);
	
	public boolean emailExists(String email);
	
	public boolean validateUser(String email, String password);
	
	public String getRole(String email);

}
