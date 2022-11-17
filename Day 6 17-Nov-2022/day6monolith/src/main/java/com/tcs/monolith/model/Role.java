package com.tcs.monolith.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_role")
@Data
public class Role {
	@Id
	private int id;
	private String name;
}
