package com.aggregate.Employee.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aggregate.Employee.model.employeeDetails;

@Repository
public interface employeeRepo extends MongoRepository<employeeDetails,String>{

	public List<employeeDetails> findAll();
	
}
