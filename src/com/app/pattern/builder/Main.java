package com.app.pattern.builder;

public class Main {

	public static void main(String[] args) {

		NutricianFacts n = NutricianFacts.Builder.getInstance(10, 1000)
				.setCalories(11).setFat(200).build();
	}

}
