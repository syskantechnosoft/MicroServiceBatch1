package com.tcs.monolith.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//Entity bean class - It represents a table in database
@Entity
@Table(name = "tbl_user")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String username;
	private String password;
	private String email;
	private long mobile;
	
}
