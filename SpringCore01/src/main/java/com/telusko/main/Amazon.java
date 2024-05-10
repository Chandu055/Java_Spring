package com.telusko.main;

import com.telusko.services.DeliveryServices;

public class Amazon 
{
	private DeliveryServices courier;
	
	static
	{
		System.out.println("Amazon class is loaded");
	}
	
	public Amazon()
	{
		System.out.println("Amazon bean is loaded");
	}

	public void setCourier(DeliveryServices courier) {
		this.courier = courier;
	}

	public boolean delivertheproduct(double Amount) 
	{
		return courier.delivertheproduct(Amount);
	}
	
	
	}
	

