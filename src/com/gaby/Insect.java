/*A String to store the insect’s name
An int to store the number of wings
A constant to store the number of legs, and set it to 6.
Will these be public, private, or protected?
Add get and set methods for the first 2 variables.
What will you do with the constant? Make it public, or add a get method?*/

package com.gaby;

public abstract class Insect {

	private String name;
	private int numberOfWings;
	protected int numberOfLegs;

	protected Insect(String name, int numberOfWings){
		this.name = name;
		this.numberOfWings = numberOfWings;
		this.numberOfLegs = 6;
	};
	
	protected String getName(){
		return name;
	};
	
	
	protected void setName(String name) {
		this.name = name;
	}

	protected void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}

	protected int getNumberOfWings() {
		return numberOfWings;
	}

	protected int getNumberOfLegs() {
		return numberOfLegs;
	};
	
	public abstract void printSpeciesData();
	
	
}
