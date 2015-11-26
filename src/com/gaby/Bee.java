/*Bee needs to have three variables:
A String for the bee’s color
A boolean for whether this species of bee makes honey (not all bees do)
A String for this bee’s favorite flower
Bee also needs a constructor to set all the variables a Bee object has. 
And, bee needs a method called printSpeciesData() that prints out 
all of the data for a Bee species. This method has the same name 
as the Butterfly method, but prints out the Bee information. 
As it prints out the information, it should print “This bee does make honey” 
or “this bee does not make honey” instead of “true” or “false”.
*/

package com.gaby;

public class Bee extends Insect {

	private String color;
	private boolean makesHoney;
	private String favoriteFlower;
	
private Bee(){
	//constructor to set all the variables a Bee object has. 
}

protected printSpeciesData(){
	//that prints out all of the data for a Bee species. This method has the same name 
	//as the Butterfly method, but prints out the Bee information. 
	//As it prints out the information, it should print “This bee does make honey” 
	//or “this bee does not make honey” instead of “true” or “false”.

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
