package com.app.innerClass.staticAndNonStatic;

public class OuterClass {
	
	private String s;
	private static String t;
	
	static class StaticClass {
		
		public void print() {
			System.out.println(t);
		}
	}
	
	class NonStaticClass {
		
		public void print() {
			System.out.println(s);
			System.out.println(t);
		}
	}

}
