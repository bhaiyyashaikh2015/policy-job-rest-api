package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy")
public class Policy {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="policy_definition")
	private String policy_definition;
	
	@Column(name="created_at")
	private String created_at;
	
	@Column(name="updated_at")
	private String updated_at;
	
		
	// define constructors
	
	public Policy() {
		
	}


	public Policy(int id, String name, String policy_definition, String created_at, String updated_at) {
		super();
		this.id = id;
		this.name = name;
		this.policy_definition = policy_definition;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPolicy_definition() {
		return policy_definition;
	}


	public void setPolicy_definition(String policy_definition) {
		this.policy_definition = policy_definition;
	}


	public String getCreated_at() {
		return created_at;
	}


	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}


	public String getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}


	@Override
	public String toString() {
		return "Policy [id=" + id + ", name=" + name + ", policy_definition=" + policy_definition + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}

	
	
		
}











