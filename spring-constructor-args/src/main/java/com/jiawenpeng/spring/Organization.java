package com.jiawenpeng.spring;

public class Organization {
	
	private String companyName;
	private int yearOfIncorporation;
	
	
	
	public Organization() {
	
	}

	public Organization(String companyName, int yearOfIncorporation) {
		super();
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public void makeSlogan() {
		String slogan = "Everything will be fine!";
		System.out.print(slogan);
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
	
	
}
