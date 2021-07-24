package com.fleeter.entities.master;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ElectronicItem
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String company;
private String productName;
private String serialId;
private Long price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getSerialId() {
	return serialId;
}
public void setSerialId(String serialId) {
	this.serialId = serialId;
}
public Long getPrice() {
	return price;
}
public void setPrice(Long price) {
	this.price = price;
}

public ElectronicItem(String company, String productName, String serialId, Long price) {
	super();
	this.company = company;
	this.productName = productName;
	this.serialId = serialId;
	this.price = price;
}

public ElectronicItem()
{
	
}

}
