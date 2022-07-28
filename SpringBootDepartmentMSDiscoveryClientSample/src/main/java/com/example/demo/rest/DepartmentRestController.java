package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentRestController {

	@GetMapping("/getEmployeeDepartment")
	public ResponseEntity<String> getEmployeeDepartment () {
		return new ResponseEntity<String>("Employee Department called !!!", HttpStatus.OK);
	}
}
