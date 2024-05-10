package com.telusko.services;

public class DHL implements DeliveryServices
{

	@Override
	public boolean delivertheproduct(double Amount) 
	{
	System.out.println("The product is delivered by DHL and the amounts is" + Amount);	
	
	return true;
	}

}
