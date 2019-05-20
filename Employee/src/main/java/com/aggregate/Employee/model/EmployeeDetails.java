package com.aggregate.Employee.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employeeDetails")
public class EmployeeDetails {

	@Id
	private Integer empID;
	
	private Date timestamp;
	private String empName;
	private Double age;
	private EmployeeAddress address;
	
	
	public EmployeeDetails(Integer empID, Date timestamp, String empName, Double age,
			EmployeeAddress address) {
		super();
		this.empID = empID;
		this.timestamp = timestamp;
		this.empName = empName;
		this.age = age;
		this.address = address;
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
	public EmployeeAddress getAddress() {
		return address;
	}
	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}
}
