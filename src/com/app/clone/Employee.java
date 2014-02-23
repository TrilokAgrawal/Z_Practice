package com.app.clone;

import java.util.Date;

/**
 * This class is just to demo the cloning in java and 
 * Significance of Clonable interface
 * @author trilok
 *
 */
public class Employee {
	
	private String name;
	
	private Date dob;
	
	public Employee() {
		
	}

	public Employee(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	//Though this class providing the overridden clone 
	//method but it can not be cloned because it is not implementing
	//Clonable interface. However, Its subclass can call this method 
	//and can be cloned if subclass implements Clonable
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Employee's Clone called");
		return super.clone();
	}
	
	

}
