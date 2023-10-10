package org.java17recipes.chapter06.recipe06_05;

public class Player {
	private int id;
	private String name;
	private int goals;
	
	public Player(int id, String name, int goals) {
		this.id = id;
		this.name = name;
		this.goals = goals;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getGoals() {
		return this.goals;
	}
	
	public void setGoals(int goals) {
		this.goals = goals;
	}
}
