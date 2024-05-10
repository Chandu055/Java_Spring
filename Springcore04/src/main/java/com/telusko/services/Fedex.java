package com.telusko.services;

import org.springframework.stereotype.Service;

@Service("fedEx")
public class Fedex implements DeliveryServices
{
		
	@Override
	public boolean delivertheproduct(double Amount) {
		
		System.out.println("Product is delivered through Fedex and the amount is" + Amount);
		
		return true;
	}

}
