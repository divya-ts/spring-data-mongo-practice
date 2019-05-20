package com.aggregate.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.aggregate.Employee.model.employeeDetails;
import com.aggregate.Employee.repository.employeeRepo;

@Controller
public class EmployeeController {

	@Autowired
	private employeeRepo employeeRepository;
	
	@GetMapping("/employees")
	public List<employeeDetails> getInfo(){
		return employeeRepository.findAll();
	}
}
