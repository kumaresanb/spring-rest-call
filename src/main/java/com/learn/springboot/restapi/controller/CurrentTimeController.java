package com.learn.springboot.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.restapi.service.CurrentTimeService;

@RestController
public class CurrentTimeController {
	
	@Autowired
	private CurrentTimeService currentTimeService;
	
	@RequestMapping("/currentDateTime")
	public String getCurrentTime() {
		return currentTimeService.gerCurrentDateTime();
	}

}
