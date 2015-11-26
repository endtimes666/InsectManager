/*A String to store the insect’s name
An int to store the number of wings
A constant to store the number of legs, and set it to 6.
Will these be public, private, or protected?
Add get and set methods for the first 2 variables.
What will you do with the constant? Make it public, or add a get method?*/

package com.gaby;

public class Insect {

	private String name;
	private int numberOfWings;
	protected int numberOfLegs = 6;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfWings() {
		return numberOfWings;
	}
	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}
			
}
