package com.lti.bank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_FundTransfer")
public class FundTransfer {
	@Id
	private int fromaccount;
	private int toaccount;
	private int amount;

	public int getFromaccount() {
		return fromaccount;
	}

	public void setFromaccount(int fromaccount) {
		this.fromaccount = fromaccount;
	}

	public int getToaccount() {
		return toaccount;
	}

	public void setToaccount(int toaccount) {
		this.toaccount = toaccount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
