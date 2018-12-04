package com.bowlingkata.bowlingscore;

public class Game {

	public int score = 0;
	private int[] rolls = new int[21];
	private int currentRoll = 0;

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		int rollIndex = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (rolls[rollIndex] + rolls[rollIndex + 1] == 10)
				score = 10 + rolls[rollIndex + 2];
			else
				score += rolls[rollIndex];
			rollIndex += 2;
		}
		return score;
	}
	
}
