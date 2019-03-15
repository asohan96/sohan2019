package com.lti.bank.dto;

public class SecondaryAccountDTO {
	
	private long partnerAcno;
	private int txAmount;
	private String redirectUrl;
	
	public long getPartnerAcno() {
		return partnerAcno;
	}
	public void setPartnerAcno(long partnerAcno) {
		this.partnerAcno = partnerAcno;
	}
	public int getTxAmount() {
		return txAmount;
	}
	public void setTxAmount(int txAmount) {
		this.txAmount = txAmount;
	}
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	@Override
	public String toString() {
		return "SecondaryAccountDTO [partnerAcno=" + partnerAcno + ", txAmount=" + txAmount + ", redirectUrl="
				+ redirectUrl + "]";
	}
	
}
