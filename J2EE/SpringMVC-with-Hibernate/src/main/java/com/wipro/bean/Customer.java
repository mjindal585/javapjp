package com.wipro.bean;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	private String CustomerID;
	private String Password;
	private double Balance;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerID, String password, double balance) {
		super();
		CustomerID = customerID;
		Password = password;
		Balance = balance;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", Password=" + Password + ", Balance=" + Balance + "]";
	}
	
}
