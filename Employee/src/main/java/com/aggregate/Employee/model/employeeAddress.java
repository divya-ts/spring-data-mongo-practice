package com.aggregate.Employee.model;

public class employeeAddress {

	private String home;
	private Double pincode;
    private companyInfo CompanyInfo;
    
	public employeeAddress(String home, Double pincode, companyInfo companyInfo) {
		super();
		this.home = home;
		this.pincode = pincode;
		CompanyInfo = companyInfo;
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
	public companyInfo getCompanyInfo() {
		return CompanyInfo;
	}
	public void setCompanyInfo(companyInfo companyInfo) {
		CompanyInfo = companyInfo;
	}
    
    
}
