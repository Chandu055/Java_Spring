package com.telusko.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.telusko.services.DeliveryServices;

@Component
public class Amazon {
	
	@Autowired
	@Qualifier("dhl")
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
	