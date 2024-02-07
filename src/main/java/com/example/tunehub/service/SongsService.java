package com.example.tunehub.service;

import java.util.List;

import com.example.tunehub.entity.Songs;

public interface SongsService 
{
	public String addSongs(Songs song);
	
	public boolean songExists(String name);
	
	public List<Songs> fetchAllSongs();

}
