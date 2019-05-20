package com.aggregate.Employee.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class employeeDetails {

	
	@Id
	private String id;
	
	private Integer empID;
	private Date timestamp;
	private String empName;
	private Double age;
	private employeeAddress address;
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
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
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
