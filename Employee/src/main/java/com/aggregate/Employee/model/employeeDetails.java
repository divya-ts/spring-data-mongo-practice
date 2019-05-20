package com.aggregate.Employee.model;

import java.security.Timestamp;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employeeDetails")
public class employeeDetails {

	
	@Id
	private String id;
	
	private Integer empID;
	private Timestamp timestamp;
	private String empName;
	private Double age;
	private employeeAddress address;
	
	
	public employeeDetails(String id, Integer empID, Timestamp timestamp, String empName, Double age,
			employeeAddress address) {
		super();
		this.id = id;
		this.empID = empID;
		this.timestamp = timestamp;
		this.empName = empName;
		this.age = age;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getEmpID() {
		return empID;
	}
	public void setEmpID(Integer empID) {
		this.empID = empID;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getAge() {
		return age;
	}
	public void setAge(Double age) {
		this.age = age;
	}
	public employeeAddress getAddress() {
		return address;
	}
	public void setAddress(employeeAddress address) {
		this.address = address;
	}
	
	
	
}
