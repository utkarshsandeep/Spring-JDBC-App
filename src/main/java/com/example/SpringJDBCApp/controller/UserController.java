package com.example.SpringJDBCApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJDBCApp.repository.UserRepository;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public String check()
	{
		return "Utkarsh";
	}
	
	@GetMapping(path="/check")
	public List<String> getAllCarName()
	{
		return UserRepository.getAllCarName();
	}
}
