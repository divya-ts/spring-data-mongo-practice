package com.aggregate.Employee.model;

public class EmployeeAddress {

	private String home;
	private Double pincode;
    private CompanyInfo companyInfo;
    
	public EmployeeAddress(String home, Double pincode, CompanyInfo companyInfo) {
		super();
		this.home = home;
		this.pincode = pincode;
		this.companyInfo = companyInfo;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public Double getPincode() {
		return pincode;
	}
	public void setPincode(Double pincode) {
		this.pincode = pincode;
	}
	public CompanyInfo getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}
    
    
}
