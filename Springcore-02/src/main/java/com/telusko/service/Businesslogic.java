package com.telusko.service;

import org.springframework.stereotype.Service;

@Service("BLG") //To specify reference variable manually as "BLG"
public class Businesslogic {  				// by default reference variable for the object/bean created = "businessLogic"
	
	public Businesslogic() {
		System.out.println("Business logic is created");
		}
	
	public void disp() {
		System.out.println("Method is being called in BLG");
	}
}
