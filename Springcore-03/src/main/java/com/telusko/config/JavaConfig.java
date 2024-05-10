package com.telusko.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig // configuration is used to inform Spring framework what need to be done
{
	@Bean
	public LocalDateTime createDateBean()
	{
		System.out.println("Local Date time bean is created");
		return LocalDateTime.now();
	}
}
