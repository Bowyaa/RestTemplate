package com.ordm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ordm.entity.User;
import com.ordm.serv.Userservice;

@RestController
public class Controller {
@Autowired
private Userservice userService;
	@GetMapping("/list")
	public List<User> listuser()
	{
		return userService.listuser();
	}
	
	@PostMapping("/add")
	public User adduser(@RequestBody User theUser)
	{
		userService.addusers(theUser);
		return theUser;
		
	}
}
