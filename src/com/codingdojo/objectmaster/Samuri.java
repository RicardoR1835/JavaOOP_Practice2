package com.codingdojo.objectmaster;

public class Samuri extends Human {
	public Samuri() {
		health = 200;
		count++;
	}
	public void deathBlow(Human target) {
		target.health = 0;
		health /= 2;
	}
	public void meditate() {
		int amount = health/2;
		health += amount;
	}
	public int howMany() {
		return count;
	}
}
