package com.codingdojo.objectmaster;

public class Human {
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	protected static int count = 0;
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	public int getStrength() {
		return strength;
	}
	public int getStealth() {
		return stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getHealth() {
		return health;
	}
	public void setStrength(int stength) {
		this.strength = strength;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public void setIntelligence(int intel) {
		intelligence = intel;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void attack(Human attacked) {
		attacked.health -= this.strength;
	}
}
