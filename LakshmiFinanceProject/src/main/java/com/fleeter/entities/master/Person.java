package com.fleeter.entities.master;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String firstname;
private String lastname;
private String email;
private String mobile;

@OneToOne(cascade = CascadeType.ALL)
private Address address;
private String gender;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Person(String firstname, String lastname, String email, String mobile, Address address, String gender) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.mobile = mobile;
	this.address = address;
	this.gender = gender;
}

public Person()
{
	
}

}
