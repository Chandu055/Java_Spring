package com.telusko.controller;

import org.springframework.stereotype.Controller;

@Controller
public class Weblayer {
	
	public Weblayer() {
		System.out.println("Weblayer is created");
	}
	
	public void disp() {
		System.out.println("Method is being called in weblayer");
	}


}
