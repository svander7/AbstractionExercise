package main;

import animals.Cat;
import animals.Cow;
import animals.Pig;
import animals.Sheep;

public class FarmerAlBarnyardInventoryApplication {

	public static void main(String[] args) {
		
		
		// Farmer Al knows he heard a cow, create a cow object and get its animal sound, then put him to bed!
		System.out.println("Cow:");
		System.out.println("");
		Cow cow = new Cow();
		cow.animalSound();
		cow.sleep();
		System.out.println("");
		
		System.out.println("Cat:");
		System.out.println("");
		Cat cat = new Cat();
		cat.animalSound();
		cat.sleep();
		System.out.println("");
		
		System.out.println("Pig:");
		System.out.println("");
		Pig pig = new Pig();
		pig.animalSound();
		pig.sleep();
		System.out.println("");
		
		System.out.println("Sheep:");
		System.out.println("");
		Sheep sheep = new Sheep();
		sheep.animalSound();
		sheep.sleep();
		System.out.println("");
		
		// Lets see if we can do this for the Pig and the Sheep as well...
	}

}
