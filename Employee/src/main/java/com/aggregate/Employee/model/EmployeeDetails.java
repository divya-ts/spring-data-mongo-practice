package com.aggregate.Employee.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employeeDetails")
public class EmployeeDetails {

	@Id
	private int empID;
	private Date timestamp;
	private String empName;
	private Double age;
	private EmployeeAddress address;
	private CompanyInfo company;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
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
	public CompanyInfo getCompany() {
		return company;
	}
	public void setCompany(CompanyInfo company) {
		this.company = company;
	}
	
	

}