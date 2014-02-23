package com.app.innerClass.staticAndNonStatic;

public class OuterClass {
	
	private String s;
	private static String t;
	
	/**
	 * This claas doesn't need surrounding class whenever accessed.
	 * It can access static private members of surrounding class.
	 * @author trilok
	 *
	 */
	static class StaticClass {
		
		public void print() {
			System.out.println(t);
			//System.out.println(s); non static members can not be accessed.
		}
	}
	
	/**
	 * It's a non static class, it require surrounding class always whenever accessed.
	 * It can access even private members (all static and non static)of surrounding class.
	 * @author trilok
	 *
	 */
	class NonStaticClass {
		
		public void print() {
			System.out.println(s);
			System.out.println(t);
		}
	}
	
}
