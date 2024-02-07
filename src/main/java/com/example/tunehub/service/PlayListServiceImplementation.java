package com.example.tunehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tunehub.repository.PlayListRepository;

@Service
public class PlayListServiceImplementation implements PlayListService
{
	@Autowired
	PlayListRepository prepo;
}
