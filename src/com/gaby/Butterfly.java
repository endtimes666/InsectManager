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
