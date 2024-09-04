package com.ordm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ordm.serv.RestService;

@RestController
@RequestMapping("/resttemp")
public class ResttempController {
	
	@Autowired
	RestService service;
	
	@GetMapping("/list")
	public ResponseEntity<String>listall()
	{
		return service.listall();
		
	}
}
