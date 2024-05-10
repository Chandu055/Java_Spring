package com.telusko.services;

import org.springframework.stereotype.Service;

@Service("dhl")
public class DHL implements DeliveryServices
{

	@Override
	public boolean delivertheproduct(double Amount) 
	{
	System.out.println("The product is delivered by DHL and the amounts is" + Amount);	
	
	return true;
	}

}
