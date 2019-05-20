package com.aggregate.Employee.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aggregate.Employee.model.EmployeeDetails;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeDetails,String>{

	public List<EmployeeDetails> findAll();
	
}
