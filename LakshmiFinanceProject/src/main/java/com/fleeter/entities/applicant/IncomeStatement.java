package com.fleeter.entities.applicant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IncomeStatement 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String grossSalary;
private String Netsalary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGrossSalary() {
	return grossSalary;
}
public void setGrossSalary(String grossSalary) {
	this.grossSalary = grossSalary;
}
public String getNetsalary() {
	return Netsalary;
}
public void setNetsalary(String netsalary) {
	Netsalary = netsalary;
}

public IncomeStatement(String grossSalary, String netsalary) {
	super();
	this.grossSalary = grossSalary;
	Netsalary = netsalary;
}

public IncomeStatement()
{
	
}

}
