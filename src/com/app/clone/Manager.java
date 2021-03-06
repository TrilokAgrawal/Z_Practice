package com.app.clone;

import java.util.Date;

public class Manager extends Employee implements Cloneable {
	
	private Date doj;
	private String department;
	
	public Manager() {
		
	}
	
	public Manager(Date doj, String department) {
		super();
		this.doj = doj;
		this.department = department;
	}
	
	



	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Object's protected clone method overridden here with public 
	 * access specifier. (We can enhance the access specifier 
	 * when override but can not narrower it.)
	 * Calling super.clone() is good enough to get the shallow copy, but
	 * to get deep copy, we need to provide the full clone method.
	 * Implementation of Clonable is required.  
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("clone called");
		return super.clone();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(doj);
		builder.append(department);
		return builder.toString();
	}

}
