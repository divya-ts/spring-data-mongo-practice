package com.aggregate.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aggregate.Employee.model.employeeDetails;
import com.aggregate.Employee.repository.employeeRepo;


@Service
public class EmployeeService {

	@Autowired
	employeeRepo employeeRepository;
	
	public List<employeeDetails> getInfo(){
		return (List<employeeDetails>) employeeRepository.findAll();
	}
}
