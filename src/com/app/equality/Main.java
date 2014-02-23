package com.app.equality;

public class Main {
	
	public static void main(String[] args) {
		
		Address a = new Address("Street", "City", "State");
		Student s = new Student("Name", 10, a);
		Address a2 = new Address("Street", "City", "State");
		Student s2 = new Student("Name", 10, a2);
		
		System.out.println(s2.equals(s));
		
		System.out.println(s.hashCode());
	System.out.println(s2.hashCode());
		
		
	}

	}
o