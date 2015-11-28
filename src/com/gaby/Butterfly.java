/*Butterfly needs to extend Insect. Butterfly needs two methods
A String to store the butterfly’s wing color
A String to store the butterfly’s favorite flower
Will these be public, private, or protected? 
		Add get and set methods for these variables.
Also, please add a constructor that takes 4 arguments – 
the butterfly’s name, wing color, number of wings, and favorite flower.
Also, add a method to the Butterfly class called printSpeciesData. 
This method should print all the info for a Butterfly object – 
it’s name, wing color, number of wings, number of legs, and favorite flower.*/

package com.gaby;

public class Butterfly extends Insect {

	private String wingColor;
	private String favoriteFlower;

	public Butterfly(String name, String wingColor, String favoriteFlower) {
		super(name, 2);
		this.wingColor = wingColor;
		this.favoriteFlower = favoriteFlower;
	}

	public void printSpeciesData() {
		System.out.println("Name: " + getName());
		System.out.println("Wing color: " + getWingColor());
		System.out.println("Favorite flower: " + getFavoriteFlower());
		System.out.println("");


	}

	public String getFavoriteFlower() {
		return favoriteFlower;
	}

	public void setFavoriteFlower(String favoriteFlower) {
		this.favoriteFlower = favoriteFlower;
	}

	public String getWingColor() {
		return wingColor;
	}

	public void setWingColor(String wingColor) {
		this.wingColor = wingColor;
	}
}
