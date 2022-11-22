package com.tcs.swagger.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accounts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String type;
    
    private int minBalance;
    
    private int int_rate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public int getInt_rate() {
		return int_rate;
	}

	public void setInt_rate(int int_rate) {
		this.int_rate = int_rate;
	}
    
    
}
