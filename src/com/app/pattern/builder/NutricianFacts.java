package com.app.pattern.builder;

public class NutricianFacts {
	
	private final int size;
	private final int amount;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int iron;
	
	public static class Builder {
		private int size;
		private int amount;
		private int calories;
		private int fat;
		private int sodium;
		private int iron;
		
		public static Builder getInstance(int size, int amount) {
			Builder builder = new Builder();
			builder.size = size;
			builder.amount = amount;
			builder.calories = 0;
			builder.fat = 0;
			builder.sodium = 0;
			builder.iron = 0;
			return builder;
		}
		
		private Builder() {
			
		}
		
		public Builder setCalories(int calories) {
			this.calories = calories;
			return this;
		}
		
		public Builder setFat(int fat) {
			this.fat = fat;
			return this;
		}
		
		public Builder setSodium(int sodium) {
			this.sodium = sodium;
			return this;
		}
		
		public Builder setIron(int iron) {
			this.iron = iron;
			return this;
		}
		
		public NutricianFacts build() {
			return new NutricianFacts(this);
		}
	}
	
	
	
	private NutricianFacts(Builder builder) {
		this.size = builder.size;
		this.amount = builder.amount;
		this.calories = builder.calories;
		this.sodium = builder.sodium;
		this.iron = builder.iron;
		this.fat = builder.fat;
	}
	

}
