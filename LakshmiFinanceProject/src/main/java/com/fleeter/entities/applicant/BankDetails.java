package com.fleeter.entities.applicant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankDetails
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String bankName;
private String branchName;
private String ifscNo;
private String accountType;
private String accountNo;
private String averageCreditBalance;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public String getIfscNo() {
	return ifscNo;
}
public void setIfscNo(String ifscNo) {
	this.ifscNo = ifscNo;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getAccountNo() {
	return accountNo;
}
public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}
public String getAverageCreditBalance() {
	return averageCreditBalance;
}
public void setAverageCreditBalance(String averageCreditBalance) {
	this.averageCreditBalance = averageCreditBalance;
}

public BankDetails(String bankName, String branchName, String ifscNo, String accountType, String accountNo,
		String averageCreditBalance) {
	super();
	this.bankName = bankName;
	this.branchName = branchName;
	this.ifscNo = ifscNo;
	this.accountType = accountType;
	this.accountNo = accountNo;
	this.averageCreditBalance = averageCreditBalance;
}

public BankDetails()
{
	
}
}
