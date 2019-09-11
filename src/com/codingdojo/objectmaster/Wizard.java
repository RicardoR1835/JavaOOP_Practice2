package com.codingdojo.objectmaster;

public class Wizard extends Human {
	public Wizard() {
		health = 50;
		intelligence = 8;
	}
	public void heal(Human healed) {
		healed.health += this.intelligence;
	}
	public void fireball(Human attacked) {
		attacked.health -= 3 * this.intelligence;
	}
}
