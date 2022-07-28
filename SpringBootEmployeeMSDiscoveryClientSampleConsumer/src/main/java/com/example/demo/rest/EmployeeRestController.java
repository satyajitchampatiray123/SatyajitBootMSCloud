package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.discoveryclient.EmployeeConsumer;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeConsumer consumer;
	@GetMapping("/emp") 
	public ResponseEntity<String> getEmployeeDepartment () {
		String response = consumer.getDeptData();
		return new ResponseEntity<String>("Employee Department being called"+response, HttpStatus.OK);
	}

}
