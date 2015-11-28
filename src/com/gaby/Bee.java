package com.gaby;

public class Bee extends Insect {

	private String color;
	private boolean makesHoney;
	private String favoriteFlower;

	Bee(String name, boolean makesHoney, String favoriteFlower) {
		super(name, 4);
		this.makesHoney = makesHoney;
		this.favoriteFlower = favoriteFlower;
	}

	public void printSpeciesData() {
		System.out.println("Name: " + getName());
		System.out.println("Color: " + getColor());
		System.out.println("Favorite flower: " + favoriteFlower);
		if (makesHoney == true) {
			System.out.println("This bee does make honey");
		} else {
			System.out.println("This bee does not make honey.");
		}
		System.out.println("");

	}

	public String getFavoriteFlower() {
		return favoriteFlower;
	}

	public void setFavoriteFlower(String favoriteFlower) {
		this.favoriteFlower = favoriteFlower;
	}

	public boolean isHoneyMaker() {
		return makesHoney;
	}

	public void setIsHoneyMaker(boolean makesHoney) {
		this.makesHoney = makesHoney;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
