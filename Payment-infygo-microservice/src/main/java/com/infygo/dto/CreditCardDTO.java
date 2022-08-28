package com.infygo.dto;

public class CreditCardDTO {
	
	private String cardNumber;
	private String cardHolderName;
	private String cvv;
	private String apin;
	private String expiryMonth;
	private String expiryYear;
	private String totalBill;
	
	public CreditCardDTO(String cardNumber, String cardHolderName, String cvv, String apin, String expiryMonth,
			String expiryYear, String totalBill) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
		this.apin = apin;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.totalBill = totalBill;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getCardHolderName() {
		return cardHolderName;
	}
	
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	
	public String getCvv() {
		return cvv;
	}
	
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	public String getApin() {
		return apin;
	}
	
	public void setApin(String apin) {
		this.apin = apin;
	}
	
	public String getExpiryMonth() {
		return expiryMonth;
	}
	
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	
	public String getExpiryYear() {
		return expiryYear;
	}
	
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	public String getTotalBill() {
		return totalBill;
	}
	
	public void setTotalBill(String totalBill) {
		this.totalBill = totalBill;
	}

	

	public CreditCardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
