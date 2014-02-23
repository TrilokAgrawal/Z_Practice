package com.app.performance.bestpractice;

/**
 * Avoid using Wrapper classes or more correctly say, boxed premitive when need performace
 * 
 * The lesson is clear: prefer primitives to boxed primitives, 
 * and watch out for unintentional autoboxing.
 * @author trilok
 *
 */
public class WrapperInsteadOfPremitive {
	
	public static void main(String[] args) {
		//replace this Long with premitive type long and see the time difference
		Long sum = 0L;
		
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}

}
