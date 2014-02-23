package com.app.clone;

import java.util.Date;


public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Manager e = new Manager(new Date(50, 11, 11), "Product");
		System.out.println(e.toString());
		
		Manager e1 = (Manager)e.clone();
		System.out.println(e1);
		e.setDoj(new Date());
		
		System.out.println(e);
	}

}
