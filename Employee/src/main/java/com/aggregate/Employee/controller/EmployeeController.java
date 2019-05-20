package com.aggregate.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aggregate.Employee.model.EmployeeDetails;
import com.aggregate.Employee.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<EmployeeDetails> Employees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/newEmployee")
	public String saveEmployees(@RequestBody EmployeeDetails employeeDetails){
		String response= employeeService.save(employeeDetails);
		return response;
	}
}
