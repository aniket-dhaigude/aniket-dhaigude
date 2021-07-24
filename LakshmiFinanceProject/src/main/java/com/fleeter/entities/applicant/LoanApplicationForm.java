package com.fleeter.entities.applicant;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fleeter.entities.master.ElectronicItem;
import com.fleeter.entities.master.LoanType;
import com.fleeter.entities.roles.Applicant;

@Entity
public class LoanApplicationForm
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@OneToOne
private Applicant applicant;

@OneToOne
private ElectronicItem electronicItem;

@OneToOne
private LoanType loanType;

@OneToOne(cascade = CascadeType.ALL)
private BankDetails bankDetails;

@OneToOne(cascade = CascadeType.ALL)
private IncomeStatement incomeStatement;

private String remark;
private int creditScore;
private boolean isDocumentVerified= false;
private boolean isloanDisbursed=false;
private boolean isCreditok;
private boolean isLoanRejected=false;
private boolean isloanApproved=false;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Applicant getApplicant() {
	return applicant;
}
public void setApplicant(Applicant applicant) {
	this.applicant = applicant;
}
public ElectronicItem getElectronicItem() {
	return electronicItem;
}
public void setElectronicItem(ElectronicItem electronicItem) {
	this.electronicItem = electronicItem;
}
public LoanType getLoanType() {
	return loanType;
}
public void setLoanType(LoanType loanType) {
	this.loanType = loanType;
}
public BankDetails getBankDetails() {
	return bankDetails;
}
public void setBankDetails(BankDetails bankDetails) {
	this.bankDetails = bankDetails;
}
public IncomeStatement getIncomeStatement() {
	return incomeStatement;
}
public void setIncomeStatement(IncomeStatement incomeStatement) {
	this.incomeStatement = incomeStatement;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public int getCreditScore() {
	return creditScore;
}
public void setCreditScore(int creditScore) {
	this.creditScore = creditScore;
}
public boolean isDocumentVerified() {
	return isDocumentVerified;
}
public void setDocumentVerified(boolean isDocumentVerified) {
	this.isDocumentVerified = isDocumentVerified;
}
public boolean isIsloanDisbursed() {
	return isloanDisbursed;
}
public void setIsloanDisbursed(boolean isloanDisbursed) {
	this.isloanDisbursed = isloanDisbursed;
}
public boolean isCreditok() {
	return isCreditok;
}
public void setCreditok(boolean isCreditok) {
	this.isCreditok = isCreditok;
}
public boolean isLoanRejected() {
	return isLoanRejected;
}
public void setLoanRejected(boolean isLoanRejected) {
	this.isLoanRejected = isLoanRejected;
}
public boolean isIsloanApproved() {
	return isloanApproved;
}
public void setIsloanApproved(boolean isloanApproved) {
	this.isloanApproved = isloanApproved;
}

public LoanApplicationForm(Applicant applicant, ElectronicItem electronicItem, LoanType loanType,
		BankDetails bankDetails, IncomeStatement incomeStatement, String remark, int creditScore,
		boolean isDocumentVerified, boolean isloanDisbursed, boolean isCreditok, boolean isLoanRejected,
		boolean isloanApproved) {
	super();
	this.applicant = applicant;
	this.electronicItem = electronicItem;
	this.loanType = loanType;
	this.bankDetails = bankDetails;
	this.incomeStatement = incomeStatement;
	this.remark = remark;
	this.creditScore = creditScore;
	this.isDocumentVerified = isDocumentVerified;
	this.isloanDisbursed = isloanDisbursed;
	this.isCreditok = isCreditok;
	this.isLoanRejected = isLoanRejected;
	this.isloanApproved = isloanApproved;
}

public LoanApplicationForm()
{
	
}


}
