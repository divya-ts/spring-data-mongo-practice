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

	public EmployeeDetails save(EmployeeDetails employeeDetails) {
		EmployeeDetails emp=new EmployeeDetails(employeeDetails.getEmpID(),employeeDetails.getTimestamp(),employeeDetails.getEmpName(),employeeDetails.getAge(),employeeDetails.getAddress());
		return employeeRepository.save(emp);
	}
}
