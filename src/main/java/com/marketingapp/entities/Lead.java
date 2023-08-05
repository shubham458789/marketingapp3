package com.marketingapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leads")
public class Lead {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

@Column(name = "first_name", length = 45, nullable = false)
	private String firstName;

@Column(name = "last_name", length = 45, nullable = false)
	private String lastName;

@Column(name = "email", length = 128, nullable = false, unique = true)
	private String email;

@Column(name = "mobile", length = 10, nullable = false, unique = true)
	private String mobile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
