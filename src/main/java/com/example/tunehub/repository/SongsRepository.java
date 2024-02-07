package com.example.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tunehub.entity.Songs;
import com.example.tunehub.entity.Users;

public interface SongsRepository extends JpaRepository<Songs, Integer>
{
	public Songs findByName(String name);
}
