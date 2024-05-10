package com.telusko.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Greetme 
{
	@Autowired	
	private LocalDate dateTime;
	
	public Greetme() {
		
		System.out.println("Greetme is created");
	}
	
	public String generateWish() 
	{
		int hour=dateTime.getHour();
		
	}
	
}
