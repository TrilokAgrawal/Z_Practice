package com.app.equality;

public class Student {
	
	private String name;
	private int age;
	private Address address;
	
	public Student() {
		super();
	}

	public Student(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	/**
	 * Overriding super class equals method.
	 * <BR>
	 * ALWAYS OVERRIDE hashCode() METHOD WHEN YOU OVERRIDE equals()
	 * <BR>
	 * For primitive fields whose type is not float or double, use the == operator for
	 * comparisons; for object reference fields, invoke the equals method recursively;
	 * for float fields, use the Float.compare method; and for double fields, use
	 * Double.compare. The special treatment of float and double fields is made
	 * necessary by the existence of Float.NaN, -0.0f and the analogous double
	 * constants; see the Float.equals documentation for details. For array fields,
	 * apply these guidelines to each element. If every element in an array field is significant,
	 * you can use one of the Arrays.equals methods added in release 1.5.
	 */
	@Override
	public boolean equals(Object obj) {
		//use == operator to check if the argument is a reference to this object
		if(obj == this) {
			return true;
		}
		//use the instanceof operator to check if the argument has correct type
		if(!(obj instanceof Student)) {
			return false;
		}
		//cast the argument to the correct type
		Student s = (Student)obj;
		//now check for each instance variable for equality check
		if(this.name.equals(s.getName()) 
				&& (this.age == s.getAge())) {
			if(this.address == s.getAddress()){
				return true;
			}
			if(this.address != null) {
				return this.address.equals(s.getAddress());
			}
		}
		return false;
	}
	
	/**
	 * If two objects are equal according to the equals(Object) method, then calling
     * the hashCode method on each of the two objects must produce the same
     * integer result.
     * <br>
     * <br>
     * A good hash function tends to produce unequal hash codes for unequal
	 * objects. This is exactly what is meant by the third provision of the hashCode contract.
	 * Ideally, a hash function should distribute any reasonable collection of
	 * unequal instances uniformly across all possible hash values.
	 * <br>
	 * <br>
	 * You must exclude any fields that are not used in equals comparisons.
	 * <br>
	 * <br>
	 * The value 31 was chosen because it is an odd prime.
	 */
	@Override
	public int hashCode() {
		/* Store some constant nonzero value, say, 17, 
		 * in an int variable called result. */
		int result = 17;
		
		/*
		 * i. If the field is a boolean, compute (f ? 1 : 0).
		 * ii. If the field is a byte, char, short, or int, compute (int) f.
         * iii. If the field is a long, compute (int) (f ^ (f >>> 32)).
         * iv. If the field is a float, compute Float.floatToIntBits(f).
         * v. If the field is a double, compute Double.doubleToLongBits(f), and
         * then hash the resulting long as in step 2.a.iii.
         * vi. If the field is an object reference and this class’s equals method
         * compares the field by recursively invoking equals, recursively
		 * invoke hashCode on the field. If a more complex comparison is
		 * required, compute a “canonical representation” for this field and
		 * invoke hashCode on the canonical representation. If the value of the
		 * field is null, return 0 (or some other constant, but 0 is traditional).
		 */
		result = 31 * result + this.name.hashCode();
		result = 31 * result + this.age;
		result = 31 * result + this.address.hashCode();
		 return result;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
