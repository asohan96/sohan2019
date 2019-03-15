package com.lti.bank.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bank_transaction2")
public class Transaction {
	@Id
	@GeneratedValue //(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
	//@SequenceGenerator(name = "sequenceGenerator", sequenceName = "trx_id_seq")
	private int transid;
	
	@ManyToOne
	@JoinColumn(name = "accountNumber")
	private Account account;

	private double amount;

	@Column(name = "tx_type")
	private String type;

	

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTransid() {
		return transid;
	}

	public void setTransid(int transid) {
		this.transid = transid;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
