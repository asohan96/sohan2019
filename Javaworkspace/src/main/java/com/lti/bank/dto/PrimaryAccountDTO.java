package com.lti.bank.dto;

public class PrimaryAccountDTO {
	
	private long accountNumber;
	private String transactionPassword;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getTransactionPassword() {
		return transactionPassword;
	}
	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}
	@Override
	public String toString() {
		return "PrimaryAccountDTO [accountNumber=" + accountNumber + ", transactionPassword=" + transactionPassword
				+ "]";
	}
	
	
/*	seq,uploaddoc,pass regen,forgot userid,forgot password,email
	integrated(admin,funds,dashboard)
*/	
	
}
