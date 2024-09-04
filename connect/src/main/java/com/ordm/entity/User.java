package com.ordm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="user")
public class User {
	@Id
private int id;
private String name;
private String email;
private String phno;
private int revno;
}
