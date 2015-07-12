package com.example.Sapient.entity;

public class Student {
	private String firstName;
	
	private String lastName;
	private String midName;
	private String salutate;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMidName() {
		return midName;
	}
	public String getSalutate() {
		return salutate;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
	}
	public void setSalutate(String salutate) {
		this.salutate = salutate;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName
				+ ", midName=" + midName + ", salutate=" + salutate + "]";
	}

}
