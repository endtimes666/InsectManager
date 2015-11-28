package com.gaby;

import java.util.LinkedList;

public class InsectManager {

	public static void main(String[] args) {

		LinkedList<Insect> insects = new LinkedList<Insect>();

		// Create and add some Butterfly and Bee objects to the list
		Butterfly monarch = new Butterfly("Monarch", "Orange and black",
				"milkweed");
		Butterfly commonYellowSwallowtail = new Butterfly(
				"Common Yellow Swallowtail", "Yellow and black", "milk parsley");
		Bee bumblebee = new Bee("Bumblebee", false, "lilac");

		// add insects to linked list
		insects.add(monarch);
		insects.add(commonYellowSwallowtail);
		insects.add(bumblebee);

		for (Insect i : insects) {
			i.printSpeciesData();
		}

	}
}
