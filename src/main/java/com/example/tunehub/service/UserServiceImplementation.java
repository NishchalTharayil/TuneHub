package com.example.tunehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tunehub.entity.Users;
import com.example.tunehub.repository.UsersRepository;

@Service
public class UserServiceImplementation implements UserService
{
	@Autowired
	UsersRepository repo;
	
	@Override
	public String addUsers(Users user) {
		// TODO Auto-generated method stub
		repo.save(user);
		return "User is Created and Saved";
	}

	@Override
	public boolean emailExists(String email) 
	{
		if(repo.findByEmail(email)==null)
		{
			return false;
		}
		else 
		{
			return true;
		}
		
	}

	@Override
	public boolean validateUser(String email, String password) {
		Users user = repo.findByEmail(email);
		String db_password = user.getPassword();
		if(db_password.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String getRole(String email) 
	{
		return (repo.findByEmail(email).getRole());
	}
	
	

}
