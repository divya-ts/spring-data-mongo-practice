package com.aggregate.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aggregate.Employee.model.EmployeeDetails;
import com.aggregate.Employee.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<EmployeeDetails> getAllEmployees(){
		return employeeRepository.findAll();
	}

	public String save(EmployeeDetails employeeDetails) {
		try {
		employeeRepository.save(employeeDetails);
		return "Successfully saved";
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return "Error";
		}
	}
}
