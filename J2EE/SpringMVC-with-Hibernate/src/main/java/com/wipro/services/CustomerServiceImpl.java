package com.wipro.services;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public double NewBalance(double balance,float offerPercentage) {
		
		return balance+(balance*(offerPercentage/100));
	}
	
	

}
