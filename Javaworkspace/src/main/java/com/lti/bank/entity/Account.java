package com.lti.bank.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="TABLE_ACCOUNT")
public class Account {
	

	@Id
	@GeneratedValue//(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
	//@SequenceGenerator(name = "sequenceGenerator", sequenceName = "acc_id_seq")
	private long accountNumber;
	

	
	private String accountType;
	
	private int balance;
	
	@OneToMany(mappedBy="account")
	private List<Transaction> transaction;
	
	//@OneToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name = "accountNumber")
//	private OpenAccount openaccount;
	
	
	
	//public OpenAccount getOpenaccount() {
		//return openaccount;
	//}

	//public void setOpenaccount(OpenAccount openaccount) {
		//this.openaccount = openaccount;
	//}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public List<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

}
