package com.ordm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ordm.entity.User;

@Repository
public interface Userrepo extends JpaRepository<User,Integer>{

}
