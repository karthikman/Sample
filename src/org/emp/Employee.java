package org.emp;

public class Employee {
    public void empId() {
		System.out.println("Employee Id  : 001");
	}
	public void empName() {
		System.out.println("Employee Name : Vinoth");
	}
	public void empDob() {
		System.out.println("Employee Dob : 01.04.1995");
	}
	public void empPhone() {
		System.out.println("Employee Phone No: 4578125785");
	}
	public void empEmail() {
		System.out.println("Employee Email Id: vinoth@gmail.com");
	}
	public void empAddress() {
		System.out.println("Employee Address: No:14,Voc Nagar,chennai");
	}
public static void main(String[] args) {
	Employee a = new Employee();
	a.empId();
	a.empName();
	a.empDob();
	a.empPhone();
	a.empEmail();
	a.empAddress();
}
}
