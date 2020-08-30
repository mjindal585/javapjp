package com.wipro.dao;

import com.wipro.bean.Coupon;
import com.wipro.bean.Customer;

public interface CustomerDAO {
	
	public double getCustomer(String CustomerID,String pswd);
	
	public float getCoupon(String CouponCode);
	
	public Customer UpdateCustomer(Customer c);
	
	public void AddCustomer(Customer c);
	
	public void AddCoupon(Coupon c);

}
