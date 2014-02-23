package com.app.equality;

public class Address {

	private String street;
	private String city;
	private String state;

	public Address() {

	}

	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Address)) {
			return false;
		}
		Address a = (Address)obj;
		
		if(this.street.equals(a.getStreet()) 
				&& this.city.equals(a.getCity()) 
				&& this.state.equals(a.getState())){
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result  + this.street.hashCode();
		result = 31 * result + this.city.hashCode();
		result = 31 * result + this.state.hashCode();
		return result;
	}

}
