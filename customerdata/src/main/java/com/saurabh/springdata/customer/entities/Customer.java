package com.saurabh.springdata.customer.entities;

import com.saurabh.springdata.customer.custom.annotation.CustomAddressGenerator;
import com.saurabh.springdata.customer.custom.annotation.CustomEmailGenerator;
import com.saurabh.springdata.customer.custom.annotation.CustomNameGenerator;
import com.saurabh.springdata.customer.custom.listener.CustomNameGenerationListener;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@EntityListeners(value = { CustomNameGenerationListener.class })
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@CustomNameGenerator
	private String name;

	@CustomEmailGenerator
	private String email;

	@Embedded
	@CustomAddressGenerator
	private Address address;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
