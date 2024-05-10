package com.telusko.services;

public class Fedex implements DeliveryServices
{
		
	@Override
	public boolean delivertheproduct(double Amount) {
		
		System.out.println("Product is delivered through Fedex and the amount is" + Amount);
		
		return true;
	}

}
