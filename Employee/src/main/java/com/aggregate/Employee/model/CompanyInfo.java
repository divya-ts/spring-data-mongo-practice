package com.aggregate.Employee.model;

public class CompanyInfo {
 
	private String companyName;
	private String city;
	private String country;
	private Double experience;
	
	
	public CompanyInfo(String companyName, String city, String country, Double experience) {
		super();
		this.companyName = companyName;
		this.city = city;
		this.country = country;
		this.experience = experience;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Double getExperience() {
		return experience;
	}
	public void setExperience(Double experience) {
		this.experience = experience;
	}
	
	
}
