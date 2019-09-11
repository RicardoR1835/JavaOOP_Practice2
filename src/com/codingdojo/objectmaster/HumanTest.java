package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Ninja rick = new Ninja();
		Human novi = new Human();
		Samuri dave = new Samuri();
		System.out.println(dave.howMany());
		rick.steal(novi);
		System.out.println(novi.health);
		System.out.println(rick.health);
		rick.runAway();
		System.out.println(rick.health);
		System.out.println("===============================");
		System.out.println(rick.health);
		System.out.println(rick.intelligence);
		System.out.println(rick.stealth);
		System.out.println(rick.strength);
	}

}
