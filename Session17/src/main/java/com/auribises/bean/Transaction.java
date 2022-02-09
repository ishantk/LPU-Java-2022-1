package com.auribises.bean;

public class Transaction {
	
	public int tid;
	public String userEmail;
	public int amount;
	public String dateTimeStamp;
	
	public Transaction() {
		System.out.println("[Trasnaction] Object Created");
	}
	
	public Transaction(String userEmail, int amount, String dateTimeStamp) {
		this.userEmail = userEmail;
		this.amount = amount;
		this.dateTimeStamp = dateTimeStamp;
	}

	@Override
	public String toString() {
		return "Trasnaction [tid=" + tid + ", userEmail=" + userEmail + ", amount=" + amount + ", dateTimeStamp=" + dateTimeStamp
				+ "]";
	}
}
