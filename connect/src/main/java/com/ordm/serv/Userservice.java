package com.ordm.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordm.entity.User;
import com.ordm.repo.Userrepo;

@Service
public class Userservice {
	@Autowired
	Userrepo repo;

	public List<User> listuser() {
		List <User> user=new ArrayList<User>();
		repo.findAll().forEach(user1 -> user.add(user1));;
		return user;
	}

	public void addusers(User user1) {
		repo.save(user1);
		
	}

	
}
