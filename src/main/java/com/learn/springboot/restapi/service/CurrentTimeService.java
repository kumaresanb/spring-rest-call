package com.learn.springboot.restapi.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CurrentTimeService {
	
	@Autowired
	private Environment environment;
	
	public String gerCurrentDateTime() {
		String meesage=environment.getProperty("message");
		LocalDateTime localDateTime=LocalDateTime.now();
		return meesage.concat(" ").concat(localDateTime.toString());
	}
	
}
