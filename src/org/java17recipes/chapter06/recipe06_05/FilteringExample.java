package org.java17recipes.chapter06.recipe06_05;

import java.util.*;

public class FilteringExample {
	public static void main(String[] args) {
		Player p1 = new Player(1, "Minori", 0);
		Player p2 = new Player(2, "Haruka", 3);
		Player p3 = new Player(3, "Airi", 5);
		Player p4 = new Player(4, "Shizuku", 10);
		
		List<Player> team = Arrays.asList(p1, p2, p3, p4);
		
		// Players with more than 3 goals
		List<Player> gtThreeGoals = team.stream()
			.filter(p -> p.getGoals() > 3)
			.toList();
		
		System.out.println("Players with more than 3 goals:");
		for (Player p : gtThreeGoals) {
			System.out.println("- " + p.getName() + ": " + p.getGoals());
		}
	}
}
